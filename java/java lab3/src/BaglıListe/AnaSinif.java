package BaglıListe;

public class AnaSinif {
	public static void main(String[] args) {
        BaglıListe liste = new BaglıListe();

        // Elemanlar oluştur
        eleman e1 = new eleman("Ahmet", "Yılmaz", 1995);
        eleman e2 = new eleman("Ayşe", "Kaya", 1993);
        eleman e3 = new eleman("Mehmet", "Demir", 2000);
        eleman e4 = new eleman("Fatma", "Öztürk", 1998);

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
        eleman[] sonuc = liste.sorgu(1993);
        System.out.println("Sorgu Sonucu:");
        for (eleman eleman : sonuc) {
            if (eleman != null) {
                System.out.println(eleman.ad + " " + eleman.soyad + " " + eleman.dt);
            }
        }
    }
}




