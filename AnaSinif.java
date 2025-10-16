package BagliListe;

public class AnaSinif {
	    public static void main(String[] args) {
	        BagliListe liste = new BagliListe();

	        // Elemanlar oluştur
	        Eleman e1 = new Eleman("Ahmet", "Yılmaz", 1995);
	        Eleman e2 = new Eleman("Ayşe", "Kaya", 1993);
	        Eleman e3 = new Eleman("Mehmet", "Demir", 2000);
	        Eleman e4 = new Eleman("Fatma", "Öztürk", 1998);

	        // Elemanları listeye ekle
	        liste.basaEkle(e1);
	        liste.sonaEkle(e2);
	        liste.sonaEkle(e3);

	        // Listeyi yazdır
	        System.out.println("İlk Durum:");
	        liste.listeYazdir();

	        // Ortaya eleman ekle
	        liste.ortadanEkle(e4, e1); // e1'den sonra e4'ü ekle
	        System.out.println("Ortaya Eleman Eklendi:");
	        liste.listeYazdir();

	        // Baştan eleman sil
	        liste.bastanSil();
	        System.out.println("Baştan Eleman Silindi:");
	        liste.listeYazdir();

	        // Sondan eleman sil
	        liste.sondanSil();
	        System.out.println("Sondan Eleman Silindi:");
	        liste.listeYazdir();

	        // Sorgu yap
	        Eleman[] sonuc = liste.sorgu(1993);
	        System.out.println("Sorgu Sonucu:");
	        for (Eleman eleman : sonuc) {
	            if (eleman != null) {
	                System.out.println(eleman.ad + " " + eleman.soyad + " " + eleman.dt);
	            }
	        }
	    }
	}


	/*public static void main(String[] args) {
		Eleman kisi1=new Eleman("Ali", "Kara", 1997);
		Eleman kisi2=new Eleman("Osman", "Kaplan", 2007);
		Eleman kisi3=new Eleman("Kadir", "Arlan", 2011);
		Eleman kisi4=new Eleman("Ender", "El", 1997);

		BagliListe bl=new BagliListe();
		
		bl.listeYazdir();
		
		bl.basaEkle(kisi1);
		bl.listeYazdir();
		
		bl.basaEkle(kisi2);
		bl.listeYazdir();
		
		bl.sonaEkle(kisi3);
		bl.listeYazdir();
		
		bl.bastanSil();
		bl.listeYazdir();
		
		bl.bastanSil();
		bl.listeYazdir();
		
		bl.bastanSil();
		bl.listeYazdir();
		
		bl.bastanSil();
		bl.listeYazdir();
		
		bl.sondanSil();
		bl.listeYazdir();
		
		bl.sondanSil();
		bl.listeYazdir();
		
		Eleman[] sonuc = bl.sorgu(1997);
		System.out.println("1997 doğumlular");

		System.out.println(sonuc[1]);
		*/




