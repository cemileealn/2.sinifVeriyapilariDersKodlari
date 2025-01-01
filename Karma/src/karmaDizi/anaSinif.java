package karmaDizi;

public class anaSinif {

	// Ana program
    public static void main(String[] args) {
        KarmaTablo karmaTablo = new KarmaTablo();

        // Eleman ekleme
        karmaTablo.ekle(1, "Bir");
        karmaTablo.ekle(11, "On Bir");
        karmaTablo.ekle(21, "Yirmi Bir");

        // Elemanları yazdırma
        System.out.println("Karma Tablo:");
        karmaTablo.yazdir();

        // Eleman arama
        System.out.println("\nAnahtar 11'in değeri: " + karmaTablo.ara(11));

        // Toplam eleman sayısı
        System.out.println("\nKarma tablodaki eleman sayısı: " + karmaTablo.boyut());
    }
}


