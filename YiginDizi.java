package DiziIslemleri;

public class YiginDizi {
	int[] yigin;
	private int isaretci; // dışarıdan erişim istemiyorum çünkü. Ayrıca değeri = stackteki eleman sayısı
							// kadardır

	YiginDizi(int boyut) {
		yigin = new int[boyut];
		isaretci = 0; 
	}

	boolean dolumu() {
		if (yigin.length == isaretci)
			return true;
		return false;
	}

	boolean bosmu() {
		if (isaretci == 0)
			return true;
		return false;
	}

	void yiginYaz() {
		for (int i = 0; i < yigin.length; i++) {
			System.out.println(i + ". eleman: " + yigin[i]);
		}
		System.out.println("-----------");
	}

	void yiginEkle(int yeni) {
		if (dolumu()) {
			System.out.println("yığın dolu ekleme yapılamaz");
			return;
		}

		yigin[isaretci] = yeni;
		isaretci++;
   
	}

	int yiginCek() {
		if (bosmu()) {
			System.out.println("yığın bos ÇEKME yapılamaz");
			return -1;
		}
		isaretci--;  // pop fonksiyonu
		int a = yigin[isaretci];
		yigin[isaretci] = 0;
		return a;
	}

	public static void main(String[] args) {
		YiginDizi yd = new YiginDizi(3);

		yd.yiginYaz();
		yd.yiginEkle(7);
		yd.yiginYaz();
		yd.yiginEkle(-3);
		yd.yiginYaz();
		yd.yiginEkle(1);
		yd.yiginYaz();
		System.out.println("cekilen deger :" + yd.yiginCek());
		System.out.println("isaretci :" + yd.isaretci);
		yd.yiginYaz();

	}

}
