//package YeniPkg;
//
//
//public class DiziTersYazdır {
//
//   
//    public static void TersYazdır(char[] dizi) {
//        
//        int uzunluk = dizi.length;
//
//       
//        tersYaz(dizi, uzunluk - 1);
//    }
//
//    private static void tersYaz(char[] dizi, int indeks) {
//       
//        if (indeks < 0) {
//            return;
//        }
//
//        
//        System.out.print(dizi[indeks]);
//
//        
//        tersYaz(dizi, indeks - 1);
//    }
//
//    public static void main(String[] args) {
//        char[] karakterDizisi = {'v', 'e', 'r', 'i', ' ','y','a','p','ı','l','a','r','ı'};
//        System.out.print("Tersten yazdırma: ");
//        TersYazdır(karakterDizisi);  
//    }
//}
//
