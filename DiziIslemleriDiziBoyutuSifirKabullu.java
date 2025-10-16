package DiziIslemleri;

public class DiziIslemleriDiziBoyutuSifirKabullu {

	int[] dizi;

	DiziIslemleriDiziBoyutuSifirKabullu() {
		dizi = new int[5]; // en küçük boyutun 0 değil 1 olduğunu var sayarlım
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = dizi.length;
		}
	}

	// <>
	int[] ekle(int yeni) {

		int[] temp = new int[dizi.length + 1];

		for (int i = 0; i < dizi.length; i++) {
			temp[i] = dizi[i];
		}

		temp[dizi.length] = yeni;
		return temp;
	}

	int[] sil() {
		if (dizi.length <= 1) { // en küçük boyut 1 olduğundan direkt boş liste gibi kabul ettik
			System.out.println("Dizinin boyutu 1");
			return dizi;
		}
		int temp[] = new int[dizi.length - 1];

		for (int i = 0; i < temp.length; i++) {
			temp[i] = dizi[i];
		}
		return temp;

	}

	void diziYaz() {

		for (int i = 0; i < dizi.length; i++) {
			System.out.println(i + ". eleman: " + dizi[i]);
		}
		System.out.println("-----------");
	}

	public static void main(String[] args) {
		int[] array = { 6, 4, 1 };
		DiziIslemleriDiziBoyutuSifirKabullu di = new DiziIslemleriDiziBoyutuSifirKabullu();
		di.diziYaz();
		
		di.ekle(5);
		di.ekle(30);
		di.ekle(50);
		int[] yeniDizi = di.sil();

		for (int i = 0; i < yeniDizi.length; i++) {
			System.out.println(yeniDizi[i]);
		}
		di.diziYaz();

		/*
		 * di.dizi=array;
		 *  di.diziYaz();
		 *  di.dizi=di.ekle(9);
		 *   di.diziYaz();
		 * di.dizi=di.ekle(-4);
		 *  di.diziYaz(); 
		 *  di.dizi=di.sil(); 
		 *  di.diziYaz();
		 */

	}

}
