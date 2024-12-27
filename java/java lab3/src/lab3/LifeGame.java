package lab3;

public class LifeGame {
    final int habitatSatır = 19;
    final int habitatSutun = 19;

    int[][] hücreHabitat;
    int[][] hücreHabitatTmp;

    int[] pulsarSatır;
    int[] pSatır;
    int[] pulsarSutun;

    public LifeGame() {
        pSatır = new int[]{3, 8, 10, 15};
        pulsarSatır = new int[]{0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0};
        pulsarSutun = new int[]{0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0};

        hücreHabitat = new int[habitatSatır][habitatSutun];
        hücreHabitatTmp = new int[habitatSatır][habitatSutun];
        int c = 0;
        for (int i = 0; i < habitatSatır; i++) {
            for (int y = 0; y < habitatSutun; y++) {
                hücreHabitatTmp[i][y] = c;
                hücreHabitat[i][y] = c;
            }
        }
        for (int satır = 0; satır < pSatır.length; satır++) {
            for (int sutun = 0; sutun < habitatSutun; sutun++) {
                hücreHabitat[pSatır[satır]][sutun] = pulsarSatır[sutun];
            }
        }
        for (int sutun = 0; sutun < pSatır.length; sutun++) {
            for (int satır = 0; satır < habitatSutun; satır++) {
                hücreHabitat[satır][pSatır[sutun]] = pulsarSatır[satır];
            }
        }
    }

    public void cizHabitat() {
        for (int i = 0; i < habitatSatır; i++) {
            for (int j = 0; j < habitatSutun; j++) {
                if (hücreHabitat[i][j] == 1) {
                    System.out.print("x");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }

    public int komsuCanlıSayısı(int satır, int sutun) {
        int canliKomsuSayısı = 0;

        for (int i = satır - 1; i <= satır + 1; i++) {
            for (int j = sutun - 1; j <= sutun + 1; j++) {
                if (i >= 0 && i < habitatSatır && j >= 0 && j < habitatSutun) {
                    if (i != satır || j != sutun) {
                        if (hücreHabitat[i][j] == 1) {
                            canliKomsuSayısı++;
                        }
                    }
                }
            }
        }
        return canliKomsuSayısı;
    }

    public void newHabitatRule() {
        int cks;

        for (int satır = 0; satır < habitatSatır; satır++) {
            for (int sutun = 0; sutun < habitatSutun; sutun++) {
                cks = komsuCanlıSayısı(satır, sutun);

                if (hücreHabitat[satır][sutun] == 1 && (cks == 2 || cks == 3)) {
                    hücreHabitatTmp[satır][sutun] = 1;
                } else if (hücreHabitat[satır][sutun] == 0 && cks == 3) {
                    hücreHabitatTmp[satır][sutun] = 1;
                } else {
                    hücreHabitatTmp[satır][sutun] = 0;
                }
            }
        }
    }

    public void copyHabitat() {
        for (int satır = 0; satır < habitatSatır; satır++) {
            for (int sutun = 0; sutun < habitatSutun; sutun++) {
                hücreHabitat[satır][sutun] = hücreHabitatTmp[satır][sutun];
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        LifeGame lg = new LifeGame();

        for (int i = 0; i < 20; i++) {
            lg.cizHabitat();
            lg.newHabitatRule();
            lg.copyHabitat();
            System.out.println();
            Thread.sleep(1500);
        }
    }
}