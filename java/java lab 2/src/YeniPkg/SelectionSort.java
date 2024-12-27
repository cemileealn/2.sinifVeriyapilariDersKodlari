//package YeniPkg;
//
//public class SelectionSort {
//
//    
//    static void secmeliSiralama(int[] dizi) {
//        int n = dizi.length;
//        for (int i = 0; i < n - 1; i++) {
//            
//            int min_index = i;
//
//            for (int j = i + 1; j < n; j++) {
//                if (dizi[j] < dizi[min_index]) {
//                    
//                    min_index = j;
//                }
//            }
//
//            if (min_index != i) {
//                int temp = dizi[i];
//                dizi[i] = dizi[min_index];
//                dizi[min_index] = temp;
//            }
//        }
//    }
//
//    
//    static void secmeliSiralamaString(String[] str) {
//        int n = str.length;
//        for (int i = 0; i < n - 1; i++) {
//            
//            int min_index = i;
//
//            for (int j = i + 1; j < n; j++) {
//                if (str[j].compareTo(str[min_index]) < 0) {
//                    
//                    min_index = j;
//                }
//            }
//
//            
//            if (min_index != i) {
//                String temp = str[i];
//                str[i] = str[min_index];
//                str[min_index] = temp;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        String[] str = {"kadir", "ayşe", "zeynep", "mehmet"};
//        secmeliSiralamaString(str);
//
//        for (int i = 0; i < str.length; i++) {
//            System.out.println(str[i]);
//        }
//    }
//}
//
//
//
