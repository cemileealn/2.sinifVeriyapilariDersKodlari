package BaglıListe;

public class BaglıListe {
	eleman bas;
	eleman son;
	BaglıListe() {
		bas = null; 
		son = null;
	}
	void listeYazdir() {
		eleman temp = bas;
		while (temp != null) {
			System.out.println(temp.ad + " " + temp.soyad + " " + temp.dt);
			temp = temp.sonraki;
		}
		System.out.println("--------------------");
	}
	void basaEkle(eleman yeni) {
		if (bas == null) {
			bas = yeni;
			son = yeni;
			return;
		}
		yeni.sonraki = bas;
		bas = yeni;
	}
	void ortadanEkle(eleman yeni, eleman onceki) {
		if (son != null && son != bas) {
			yeni.sonraki = onceki.sonraki;
			onceki.sonraki = yeni;
		}
		else {
			System.out.println("Listede en az iki eleman olmadan ortadan ekleme yapılamaz");
			System.out.println("--------------------------------------------------");
		}
	}

	void sonaEkle(eleman yeni) {

		if (bas == null) {   
			bas = yeni;
			son = yeni;
			return;
		}
		son.sonraki = yeni;
		son = yeni;
	}
	void bastanSil() {
		if (bas == null) {
			System.out.println("Liste boş Silme yapılamaz ");
			return;
		}
		bas = bas.sonraki;
	}
	void sondanSil() {
		if (bas == null) {
			System.out.println("Liste boş silineceke eleman yok ");
			return;
		}
		if (bas == son) {
			bas = null;
			son = null;
			System.out.println("Listede tek eleman var ve silindi");
			return;
		}
		eleman tmp = bas;
		while (tmp.sonraki.sonraki != null) { 
			tmp = tmp.sonraki;
		}
		son = tmp;
		tmp.sonraki = null;
	}
	void ortadansil(eleman s) {
		eleman tmp,elemanonc;
		tmp=bas;
		elemanonc=null;
		while(tmp!=s) {
			elemanonc=tmp;
			tmp=tmp.sonraki;		
		}
		elemanonc.sonraki=s.sonraki;
	}
	eleman[] sorgu(int dt) {
		eleman[] sonuc = new eleman[5];
	    eleman tmp = bas;
		int sayac = 0;
		while (tmp != null) {
			if (tmp.dt == dt) {
				sonuc[sayac] = tmp;
				sayac++;
			}
			tmp = tmp.sonraki;
		}
		return sonuc;
	}
}