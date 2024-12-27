package lab3;
//Empty stack= boş yıgıt 
//push=eleman ekleme 
//pop=eleman 
//size=toplam eleman sayısı 
//isEmpty=eleman kontrolu


public class BagliListeYiğin {
    private eleman ilk;
    private int elemanSayisi;

    public BagliListeYiğin() {
        this.ilk = null;
        this.elemanSayisi = 0;
    }

    public void elemanEkle(String ad, String soyad, String telNo, String dogumTarihi) {
        eleman yeniEleman = new eleman(ad, soyad, telNo, dogumTarihi);
        yeniEleman.sonraki = ilk;
        ilk = yeniEleman;
        elemanSayisi++;
    }

    public eleman ElemanAt() {
        if (ilk == null) {
            System.out.println("Yığın boş, atılacak eleman yok.");
            return null;
        }
        eleman atilan = ilk;
        ilk = ilk.sonraki;
        elemanSayisi--;
        return atilan;
    }

    public void yiginYazdir() {
        eleman gecici = ilk;
        if (gecici == null) {
            System.out.println("Yığın boş");
            return;
        }
        System.out.println("Yığındaki elemanlar:");
        while (gecici != null) {
            System.out.println("Ad: " + gecici.ad + " Soyad: " + gecici.soyad + " TelNo: " + gecici.telNo + " Doğum Tarihi: " + gecici.dogumTarihi);
            gecici = gecici.sonraki;
        }
    }

    public int elemanSayisi() {
        return elemanSayisi;
    }

    public static void main(String[] args) {
        BagliListeYiğin yigin = new BagliListeYiğin();
        yigin.elemanEkle("Ali", "Kara", "0551345678", "2002");
        yigin.elemanEkle("Veli", "Yakar", "0551056", "1982");
        yigin.elemanEkle("Cemile", "Alan", "0542325", "1999");
        yigin.elemanEkle("Ayşe", "Yıldız", "05509717", "2012");
        yigin.elemanEkle("Betül", "Yaldız", "05509987", "2000");

        System.out.println("Yığına eklenen elemanlar:");
        yigin.yiginYazdir();

        System.out.println("Yığındaki eleman sayısı: " + yigin.elemanSayisi());

        System.out.println("Yığındaki bir eleman siliniyor...");
        eleman atilan = yigin.ElemanAt();
        if (atilan != null) {
            System.out.println("Silinen eleman bilgileri - Ad: " + atilan.ad + " Soyad: " + atilan.soyad + " Telefon Numarası: " + atilan.telNo + " Doğum Tarihi: " + atilan.dogumTarihi);
        }

        System.out.println("\nYeni yığın:");
        yigin.yiginYazdir();

        System.out.println("Yığındaki güncel eleman sayısı: " + yigin.elemanSayisi());
    }
}
