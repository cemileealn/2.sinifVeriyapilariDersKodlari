package karmaDizi;
import java.util.LinkedList;
//Karma (hash) tablo sınıfı
public class KarmaTablo {

 // Sabit dizi boyutu
 private final int BOYUT = 10;

 // Karma tablosu: Her bir hücre bir bağlı liste tutar
 private LinkedList<Kayit>[] tablo;

 // Eleman sayısını tutar
 private int elemanSayisi;

 // Sınıfın yapıcı metodu
 public KarmaTablo() {
     tablo = new LinkedList[BOYUT]; // Karma tablosu oluşturulur
     elemanSayisi = 0;

     // Her bir hücre için bağlı liste oluşturulur
     for (int i = 0; i < BOYUT; i++) {
         tablo[i] = new LinkedList<>();
     }
 }

 // Ekleme metodu: Anahtar ve değer çifti eklenir
 public void ekle(int anahtar, String deger) {
     int index = hashFonksiyonu(anahtar); // Anahtarın indeksini hesaplar

     // Aynı anahtar var mı kontrol eder
     for (Kayit kayit : tablo[index]) {
         if (kayit.anahtar == anahtar) {
             kayit.deger = deger; // Değeri günceller
             return;
         }
     }

     // Yeni kayıt ekler
     tablo[index].add(new Kayit(anahtar, deger));
     elemanSayisi++;
 }

 // Yazdır metodu: Tablonun tüm elemanlarını yazdırır
 public void yazdir() {
     for (int i = 0; i < BOYUT; i++) {
         System.out.print(i + ": ");
         for (Kayit kayit : tablo[i]) {
             System.out.print("[" + kayit.anahtar + ", " + kayit.deger + "] -> ");
         }
         System.out.println("null");
     }
 }

 // Arama metodu: Anahtar ile eşleşen değeri döndürür
 public String ara(int anahtar) {
     int index = hashFonksiyonu(anahtar); // Anahtarın indeksini hesaplar

     for (Kayit kayit : tablo[index]) {
         if (kayit.anahtar == anahtar) {
             return kayit.deger; // Değeri döndürür
         }
     }

     return null; // Anahtar bulunamadıysa null döner
 }

 // Boyut metodu: Tablodaki toplam eleman sayısını döndürür
 public int boyut() {
     return elemanSayisi;
 }

 // Karma (hash) fonksiyonu: Anahtarın indeksini hesaplar
 private int hashFonksiyonu(int anahtar) {
     return anahtar % BOYUT;
 }}
