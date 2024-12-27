package BaglıListe;

public class eleman {
	String ad;
	String soyad;
	int dt;
	eleman sonraki;
	eleman(String ad, String soyad, int dt){
		this.ad=ad;
		this.soyad=soyad;
		this.dt=dt;	
		sonraki=null;
	}
}
