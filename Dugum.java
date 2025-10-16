public class Dugum {

	Dugum sag;
	Dugum sol;
	int deger;

	Dugum(int deger) {
		sag = null;
		sol = null;
		this.deger = deger;

	}

	// recursive bir yapı
	void ekle(int yeni) {
		if (deger < yeni) {
			// sağa ekleme yapılacak
			if (sag == null) { // boşsa
				// eklenecek yer bulundu
				sag = new Dugum(yeni);

			} else {
				// dugum soluna ekleyemez eklemeyi sol elemanına devretmeli
				sag.ekle(yeni);
			}

		} else {
			// sola ekleme yapılacak
			if (sol == null) {
				// eklenecek yer bulundu
				sol = new Dugum(yeni);

			} else {
				// dugum soluna ekleyemez eklemeyi sol elemanına devretmeli
				sol.ekle(yeni);

			}
		}
	}

	void onceGezin() {
		System.out.println(deger);
		if (sol != null) {
			sol.onceGezin();
		}
		if (sag != null) {
			sag.onceGezin();
		}

	}

	Dugum min(Dugum dg) {
		Dugum tmp = dg;
		while (tmp.sol != null) {
			tmp = tmp.sol;
		}
		return tmp;
	}

	Dugum ara(int aranan) {
		if (deger == aranan) {
			return this;
		}
		if (aranan > deger) {
			if (sag != null) {
				return sag.ara(aranan);
			} else
				;
			return null;

		} else {
			if (sol != null) {
				return sol.ara(aranan);
			} else
				;
			return null;
		}
	}

	void silme(Dugum ebeveyn, int sildeger) {
		if (deger == sildeger) {
			// silinecek değeri yusuf bulmuşşş
			System.out.println("silinecek degerin ebeveyni" + ebeveyn);
			System.out.println("silinecek deger bulundu" + deger);
			if ((sag == null) && (sol == null)) {
				System.out.println("silinecek eleman yaprak elemandır");
				if (this == ebeveyn.sag) {
					ebeveyn.sag = null;
					return;

				} else {
					ebeveyn.sol = null;
					return;
				}
			}

			else if ((sag == null) && (sol != null)) {
				System.out.println("silinecek eleman tek sag cocuklu");
				if (ebeveyn.sag == this) {
					ebeveyn.sag = this.sag;
				} else {
					ebeveyn.sol = this.sag;
				}

			}

			else if ((sag != null) && (sol == null)) {
				System.out.println("silinecek eleman tek sol cocuklu");
				if (ebeveyn.sag == this) {
					ebeveyn.sag = this.sol;
				} else {
					ebeveyn.sol = this.sol;
				}
			} else if ((sag != null) && sol != null) {
				System.out.println("2 cocuklu bi dugum");
				Dugum silinecekyaprakDugum = min(sag);

				int a = silinecekyaprakDugum.deger;

				sag.silme(this, silinecekyaprakDugum.deger);
				deger = a;
			}
		} else if (deger > sildeger) {
			if (sol == null) {
				System.out.println("son aranan deger" + this.deger);
				System.out.println("silinecek deger bulunamadi");
				return;
			} else {

				sol.silme(this, sildeger);
			}

		} else if (deger < sildeger) {
			if (sag == null) {
				System.out.println("silinecek deger bulunamamistir");
				return;
			} else {

				sag.silme(this, sildeger);
			}
		}
	}
}
