package DiziIslemleri;

public class DiziIslemleri {
	int[] dizi;
	
	DiziIslemleri(){
		dizi=new int[1];
	}
	//<>
	int[] ekle(int yeni) {
		
		int[] temp=new int[dizi.length+1];
		
		for(int i=0; i<dizi.length;i++) {
			temp[i]=dizi[i];
		}
		
		temp[dizi.length]=yeni;
		return temp;
	}
	int[] sil() {
		if(dizi.length==1) {
			//System.out.println("Liste boş, silme işlemi yapılamaz"); bu dizi=new int[0]; ve buradaki if eşitliği 0 ken olur!!!
 			return dizi;
		}
		int temp[]= new int[dizi.length-1];
		
		for(int i=0; i<temp.length;i++) {
			temp[i]=dizi[i];
		}
		return temp;
	}
	void diziYaz() {
		
		for(int i=0; i<dizi.length;i++) {
			System.out.println(i +". eleman: " +dizi[i]);
		}
		System.out.println("-----------");
	}
	public static void main(String[] args) {
		int[] array= {6,4,1};
		DiziIslemleri di=new DiziIslemleri();
		di.dizi=array;
		di.diziYaz();
		di.dizi=di.ekle(9);  
		di.diziYaz();
		di.dizi=di.ekle(-4);
		di.diziYaz();
		di.dizi=di.sil();
		di.diziYaz();
		di.dizi=di.sil();
		di.diziYaz();
		di.dizi=di.sil();
		di.diziYaz();
		di.dizi=di.sil();
		di.diziYaz();
		di.dizi=di.sil();
		di.diziYaz();
		di.dizi=di.sil();
		di.diziYaz();
		di.dizi=di.sil();
		di.diziYaz();

	}

}
