package DiziIslemleri;

public class DiziKuyruk {
	int[] kuyruk;
	int ko; // kuyruk önce 
	int ks; // kuyruk sonra
	int maxBoyut;
	int simdikiBoyut;
	
	DiziKuyruk(int boyut){
		maxBoyut=boyut;
		kuyruk=new int[boyut];
		ko=0;
		ks=-1;
		simdikiBoyut=0;
	}
	
	/*boolean bosmu() {
		if((ko % maxBoyut)==(ks %maxBoyut))
			return true;
		return false;

	}*/
	boolean bosmu() {
		if(simdikiBoyut==0)
			return true;
		return false;
	}
	
	boolean dolumu() {
		int a=(ks % maxBoyut)-(ko % maxBoyut); // maxboyut - simdikiBoyut
		if(a==kuyruk.length-1)
			return true;
		return false;
	}
	
	void kuyrukEkle(int yeni) {
		
		if(dolumu()) {
			System.out.println("Dolu");    
			return;
		}
			
		
		ks++;
		ks=ks % maxBoyut; 
		simdikiBoyut++;
		kuyruk[ks]=yeni;
	}
	
	int kuyrukCek() {
		if(bosmu()){
			System.out.println("BOS");
			return-1;
		}
		
		int a=kuyruk[ko];
		kuyruk[ko]=0;
		ko++;
		simdikiBoyut--;
		ko=ko % maxBoyut;
		return a;
		
	}
	void kuyrukYaz() {
		for(int i=0; i<kuyruk.length;i++) {
			System.out.println(i +". eleman: " +kuyruk[i]);
		}
		System.out.println("-----------");
	}

	public static void main(String[] args) {
		DiziKuyruk dk=new DiziKuyruk(3);
		dk.kuyrukEkle(5);
		dk.kuyrukYaz();
		dk.kuyrukEkle(6);
		dk.kuyrukYaz();
		dk.kuyrukEkle(-5);
		dk.kuyrukYaz();
		dk.kuyrukEkle(-5);
		dk.kuyrukYaz();
		System.out.println("cekilen deger "+dk.kuyrukCek());
		dk.kuyrukYaz();
		System.out.println("cekilen deger "+dk.kuyrukCek());
		dk.kuyrukYaz();
		System.out.println("cekilen deger "+dk.kuyrukCek());
		dk.kuyrukYaz();
		System.out.println("cekilen deger "+dk.kuyrukCek());
		dk.kuyrukYaz();
	}
	
	
	
	// tüm derste printlenip eklenen ifadeler
	/*public static void main(String[] args) {
		kuyrukk dK=new kuyrukk(5);
		dK.ekle(2);
		dK.kuyrukyaz();
		dK.ekle(5);
		dK.kuyrukyaz();
		dK.ekle(8);
		dK.kuyrukyaz();
		dK.ekle(1);
		dK.kuyrukyaz();
		dK.ekle(7);
		dK.kuyrukyaz();
		dK.ekle(11);
		dK.kuyrukyaz();
		System.out.println("kuyruk sonu"+dK.ks);
		System.out.println("cekilen eleman: "+dK.kuyruk[dK.kö]);
		dK.cekme();
		
		dK.kuyrukyaz();
		dK.cekme();
		dK.kuyrukyaz();
		dK.cekme();
		
		dK.kuyrukyaz();
		dK.cekme();
		dK.kuyrukyaz();
		dK.cekme();
		
		dK.kuyrukyaz();
		dK.cekme();
		dK.kuyrukyaz();
		dK.cekme();
		

	}*/

}
