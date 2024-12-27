//package AgacYapilari;
//
//public class AVL_Dugun {
//    AVL_Dugun sag;
//    AVL_Dugun sol;
//
//    int deger;
//    int boy; // Düğümün yüksekliği
//
//    AVL_Dugun(int deger) {
//        this.deger = deger;
//        sag = sol = null;
//        boy = 1; // Yeni eklenen düğümün başlangıçta yüksekliği 1
//    }
//
//    void araGezinti() {
//        if (sol != null)
//            sol.araGezinti();
//        System.out.println(deger); // Mevcut düğümü yazdır
//        if (sag != null)
//            sag.araGezinti();
//    }
//
//    int maks(int a, int b) {
//        if (a > b) {
//            return a;
//        } else {
//            return b;
//        }
//    }
//
//    int dugumBoyu(AVL_Dugun dg) {
//        if (dg == null) {
//            return 0;
//        } else {
//            return dg.boy;
//        }
//    }
//
//    int dengeFaktoru() {
//        int solBoy = dugumBoyu(sol); // Sol alt ağacın yüksekliği
//        int sagBoy = dugumBoyu(sag); // Sağ alt ağacın yüksekliği
//        return solBoy - sagBoy; // Denge faktörü
//    }
//
//    // Sağ dönüş (Right Rotation)
//    AVL_Dugun sagaDonus() {
//        AVL_Dugun yeniKok = sol;
//        AVL_Dugun gecici = yeniKok.sag;
//
//        // Dönüş işlemi
//        yeniKok.sag = this;
//        sol = gecici;
//
//        // Yükseklikleri güncelle
//        boy = maks(dugumBoyu(sol), dugumBoyu(sag)) + 1;
//        yeniKok.boy = maks(dugumBoyu(yeniKok.sol), dugumBoyu(yeniKok.sag)) + 1;
//
//        return yeniKok; // Yeni kökü döndür
//    }
//
//    // Sol dönüş (Left Rotation)
//    AVL_Dugun solaDonus() {
//        AVL_Dugun yeniKok = sag;
//        AVL_Dugun gecici = yeniKok.sol;
//
//        // Dönüş işlemi
//        yeniKok.sol = this;
//        sag = gecici;
//
//        // Yükseklikleri güncelle
//        boy = maks(dugumBoyu(sol), dugumBoyu(sag)) + 1;
//        yeniKok.boy = maks(dugumBoyu(yeniKok.sol), dugumBoyu(yeniKok.sag)) + 1;
//
//        return yeniKok; // Yeni kökü döndür
//    }
//
//    // AVL Ağacına değer ekle ve dengeyi sağla
//    AVL_Dugun ekle(AVL_Dugun kok, int yeni) {
//        if (kok == null) {
//            return new AVL_Dugun(yeni); // Yeni düğüm oluştur
//        }
//
//        if (yeni < kok.deger) {
//            kok.sol = ekle(kok.sol, yeni); // Sol alt ağaçta ekleme
//        } else if (yeni > kok.deger) {
//            kok.sag = ekle(kok.sag, yeni); // Sağ alt ağaçta ekleme
//        } else {
//            return kok; // Aynı değer tekrar eklenmez
//        }
//
//        // Yükseklik güncelle
//        int solYukseklik = dugumBoyu(kok.sol);
//        int sagYukseklik = dugumBoyu(kok.sag);
//        kok.boy = maks(solYukseklik, sagYukseklik) + 1;
//
//        // Denge faktörünü kontrol et ve gerekirse dönüş uygula
//        int denge = kok.dengeFaktoru();
//
//        // Sol-Sol durumu
//        if (denge > 1 && yeni < kok.sol.deger) {
//            return kok.sagaDonus();
//        }
//
//        // Sağ-Sağ durumu
//        if (denge < -1 && yeni > kok.sag.deger) {
//            return kok.solaDonus();
//        }
//
//        // Sol-Sağ durumu
//        if (denge > 1 && yeni > kok.sol.deger) {
//            kok.sol = kok.sol.solaDonus();
//            return kok.sagaDonus();
//        }
//
//        // Sağ-Sol durumu
//        if (denge < -1 && yeni < kok.sag.deger) {
//            kok.sag = kok.sag.sagaDonus();
//            return kok.solaDonus();
//        }
//
//        return kok; // Düğüm dengeliyse kökü döndür
//    }
//}
