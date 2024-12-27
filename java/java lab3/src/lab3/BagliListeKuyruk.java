package lab3;

public class BagliListeKuyruk {
	
	    eleman on, arka;

	  
	    public BagliListeKuyruk() {
	        on = arka = null;
	    }

	    public void kuyrugaEkle(String ad, String soyad, String telNo, String dogumTarihi) {
	        eleman yeniEleman = new eleman(ad, soyad, telNo, dogumTarihi);
	        
	        if (arka == null) { 
	            on = arka = yeniEleman;
	            return;
	        }
	        
	        arka.sonraki = yeniEleman; 
	        arka = yeniEleman;
	    }

	    
	    public void kuyruktanCek() {
	        if (on == null) {
	            System.out.println("Kuyruk boş, eleman çekilemez.");
	            return;
	        }

	        on = on.sonraki; 
	        if (on == null) { 
	            arka = null;
	        }
	    }

	    
	    public void kuyruguYazdir() {
	        if (on == null) {
	            System.out.println("Kuyruk boş.");
	            return;
	        }

	        eleman temp = on;
	        while (temp != null) {
	            System.out.println("Ad: " + temp.ad + ", Soyad: " + temp.soyad +  ", Telefon: " + temp.telNo +", Doğum Tarihi: " + temp.dogumTarihi);
	                              
	            temp = temp.sonraki; 
	        }
	    }

	   
	    public int elemanSayisi() {
	        int sayac = 0;
	        eleman temp = on;
	        while (temp != null) {
	            sayac++;
	            temp = temp.sonraki;
	        }
	        return sayac;
	    }
	

	public static void main(String[] args) {
		
	        BagliListeKuyruk kuyruk = new BagliListeKuyruk();

	        kuyruk.kuyrugaEkle("Ali", "Kara", "0551345678", "2002");
	        kuyruk.kuyrugaEkle("Veli", "Yakar", "0551056", "1982");
	        kuyruk.kuyrugaEkle("Ahmet", "Yılmaz", "55514567", "1990");
	        kuyruk.kuyrugaEkle("Mehmet", "Öztürk", "5559843", "1985");
	        kuyruk.kuyrugaEkle("Zeynep", "Kara", "5551113", "2000");

	      
	        System.out.println("Kuyruk içeriği:");
	        kuyruk.kuyruguYazdir();

	        
	        System.out.println("\nKuyruktan eleman çekiliyor...");
	        kuyruk.kuyruktanCek();

	        System.out.println("\nKuyruk içeriği (eleman çekildikten sonra):");
	        kuyruk.kuyruguYazdir();

	        
	        System.out.println("\nKuyruktaki eleman sayısı: " + kuyruk.elemanSayisi());

	}

}
