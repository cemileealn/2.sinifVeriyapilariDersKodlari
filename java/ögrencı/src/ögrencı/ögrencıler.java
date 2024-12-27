package ögrencı;

public class ögrencıler {

    String ad; 
    String soyad; 
    int not;
    ögrencıler sonraki; 
    public ögrencıler(String ad, String soyad, int not) {
        this.ad = ad;
        this.soyad = soyad;
        this.not = not;
        this.sonraki = null;
    }
}