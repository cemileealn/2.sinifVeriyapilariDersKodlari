package ögrencı;
public class ögrencı_liste {
    ögrencıler bas;
    ögrencıler son;

    ögrencı_liste() {
        bas = null;
        son = null;
    }
    void yazdır() {
        ögrencıler tmp = bas;
        while (tmp != null) {
            System.out.println(tmp.ad + " " + tmp.soyad + " " + tmp.not);
            tmp = tmp.sonraki;
        }
    }
    void basaEkle(ögrencıler yeni) {
        if (bas == null) {
            bas = yeni;
            son = yeni;
        } else {
            yeni.sonraki = bas;
            bas = yeni;
        }
    }
    void sonaEkle(ögrencıler yeni) {
        if (bas == null) {
            bas = yeni;
            son = yeni;
        } else {
            son.sonraki = yeni;
            son = yeni;
        }
    }
    void bastanSil() {
        if (bas == null) {
            System.out.println("Öğrenci listesi boş, eleman silinemez.");
        } else {
            bas = bas.sonraki;
        }
    }
    void sondanSil() {
        if (bas == null) {
            System.out.println("Öğrenci listesi boş, eleman silinemez.");
        } else if (bas == son) {
            bas = null;
            son = null;
        } else {
            ögrencıler tmp = bas;
            while (tmp.sonraki != son) {
                tmp = tmp.sonraki;
            }
            son = tmp;
            son.sonraki = null;
        }
    }
    ögrencıler sorgu(String ad) {
        ögrencıler tmp = bas;
        while (tmp != null) {
            if (tmp.ad.equals(ad)) {
                return tmp;
            }
            tmp = tmp.sonraki;
        }
        return null;
    }
    public static void main(String[] args) {
        ögrencı_liste liste = new ögrencı_liste();

        ögrencıler e1 = new ögrencıler("Ahmet", "Yılmaz", 95);
        ögrencıler e2 = new ögrencıler("Ayşe", "Kaya", 93);
        ögrencıler e3 = new ögrencıler("Mehmet", "Demir", 60);
        ögrencıler e4 = new ögrencıler("Yılmaz","cam", 85);
        ögrencıler e5 = new ögrencıler("Kaya","sever", 63);
        ögrencıler e6 = new ögrencıler( "Demir","alan", 30);

        liste.basaEkle(e1);
        liste.sonaEkle(e2);
        liste.sonaEkle(e3);
        liste.basaEkle(e5);
        liste.sonaEkle(e4);
        liste.sonaEkle(e6);

        System.out.println("**********İlk Durum:***********");
        liste.yazdır();

        liste.bastanSil();
        System.out.println("Baştan Eleman Silindi:");
        System.out.println("********************YENİ HALİ********************");
        liste.yazdır();

        liste.sondanSil();
        System.out.println("Sondan Eleman Silindi:");
        System.out.println("******************YENİ HALİ*********************");
        liste.yazdır();

        ögrencıler sonuc = liste.sorgu("Mehmet");
        if (sonuc != null) {
            System.out.println("Sorgu Sonucu: " + sonuc.ad + " " + sonuc.soyad + " " + sonuc.not);
        } else {
            System.out.println("Sorgu sonucu bulunamadı.");
        }
    }
}