//package YeniPkg;
//
//public class ArrayProcess {
//
//   
//    public static void diziYaz(int[] dizi) {
//        for (int eleman : dizi) {
//            System.out.print(eleman + " ");
//        }
//        System.out.println(); 
//    }
//
//   
//    public static int[] elemanEkle(int[] array, int yeni) {
//        int[] yeniDizi = new int[array.length + 1];
//        for (int i = 0; i < array.length; i++) {
//            yeniDizi[i] = array[i];
//        }
//        yeniDizi[array.length] = yeni;
//        return yeniDizi;
//    }
//
//   
//    public static int[] elemanSil(int[] array) {
//        if (array.length == 0) {
//            return new int[0];
//        }
//        int[] yeniDizi = new int[array.length - 1];
//        for (int i = 1; i < array.length; i++) {
//            yeniDizi[i - 1] = array[i];
//        }
//        return yeniDizi;
//    }
//
//   
//    public static int diziElemanSay(int[] dizi, int aranan) {
//        int sayac = 0;
//        for (int eleman : dizi) {
//            if (eleman == aranan) {
//                sayac++;
//            }
//        }
//        return sayac;
//    }
//
//   
//    public static int[] diziArananElemanIndeks(int[] dizi, int aranan) {
//        
//        int sayac = diziElemanSay(dizi, aranan);
//
//        
//        if (sayac == 0) {
//            return new int[0];
//        }
//
//       
//        int[] indeksDizisi = new int[sayac];
//        int indeks = 0;
//
//        for (int i = 0; i < dizi.length; i++) {
//            if (dizi[i] == aranan) {
//                indeksDizisi[indeks] = i;
//                indeks++;
//            }
//        }
//
//        return indeksDizisi;
//    }
//
//    public static void main(String[] args) {
//        int[] dizi = {44, 52, 93, 4, 52, 125, 52};
//        System.out.print("Mevcut Dizi: ");
//        diziYaz(dizi);
//
//       
//        int yeniEleman = 125;
//        dizi = elemanEkle(dizi, yeniEleman);
//        System.out.print("Yeni Dizi: ");
//        diziYaz(dizi);
//
//        
//        dizi = elemanSil(dizi);
//        System.out.print("İlk Eleman Silindikten Sonra Dizi: ");
//        diziYaz(dizi);
//
//        
//        int arananEleman = 52;
//        int tekrarSayisi = diziElemanSay(dizi, arananEleman);
//        System.out.println("Dizide " + arananEleman + " sayısı " + tekrarSayisi + " kez bulunuyor.");
//
//        int[] bulunanIndeksler = diziArananElemanIndeks(dizi, arananEleman);
//        System.out.print("Aranan eleman " + arananEleman + " dizide şu indekslerde bulunuyor: ");
//        diziYaz(bulunanIndeksler);
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
