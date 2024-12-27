package lab3;

public class eleman {
    String ad;
    String soyad;
    String telNo;
    String dogumTarihi;
    eleman sonraki;

    public eleman(String ad, String soyad, String telNo, String dogumTarihi) {
        this.ad = ad;
        this.soyad = soyad;
        this.telNo = telNo;
        this.dogumTarihi = dogumTarihi;
        this.sonraki = null;
    }
}