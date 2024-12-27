//package YeniPkg;
//
//public class AnaSinif {
//    int ozellik1;
//    String ozellik2;
//    double ozellik3;
//
//    
//    public AnaSinif() {
//        this.ozellik1 = 0;
//        this.ozellik2 = "";
//        this.ozellik3 = 0.0;
//    }
//
//    
//    public AnaSinif(int ozellik1, String ozellik2) {
//        this.ozellik1 = ozellik1;
//        this.ozellik2 = ozellik2;
//    }
//
//   
//    public AnaSinif(int ozellik1, String ozellik2, double ozellik3) {
//        this.ozellik1 = ozellik1;
//        this.ozellik2 = ozellik2;
//        this.ozellik3 = ozellik3;
//    }
//
//    
//    public static void statikMetot() {
//        System.out.println(10); 
//    }
//
//    
//    public void ikinciSinifDegerYazdir(IkinciSinif iks) {
//        System.out.println("IkinciSinif Ozellik1: " + iks.getOzellik1());
//        System.out.println("IkinciSinif Ozellik2: " + iks.getOzellik2());
//        System.out.println("IkinciSinif Ozellik3: " + iks.getOzellik3());
//    }
//
//    
//    public IkinciSinif ikinciSinifaDegerAta(int ozellik1, String ozellik2, float ozellik3) {
//        IkinciSinif iks = new IkinciSinif();
//        iks.setOzellik1(ozellik1);
//        iks.setOzellik2(ozellik2);
//        iks.setOzellik3(ozellik3);
//        return iks;
//    }
//
//    public static void main(String[] args) {
//        
//        statikMetot();
//
//        
//        IkinciSinif[] ikinciSinifDizisi = new IkinciSinif[10];
//        
//        
//        for (int i = 0; i < ikinciSinifDizisi.length; i++) {
//            ikinciSinifDizisi[i] = new IkinciSinif();
//        }
//
//        
//        for (int i = 0; i < ikinciSinifDizisi.length; i++) {
//            ikinciSinifDizisi[i].setOzellik1(i + 1);
//            ikinciSinifDizisi[i].setOzellik2("Ozellik2_" + (i + 1));
//            ikinciSinifDizisi[i].setOzellik3(i * 1.1f);
//        }
//
//        
//        AnaSinif anaSinif = new AnaSinif();
//        for (IkinciSinif iks : ikinciSinifDizisi) {
//            anaSinif.ikinciSinifDegerYazdir(iks);
//        }
//    }
//}
