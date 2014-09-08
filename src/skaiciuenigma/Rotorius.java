package skaiciuenigma;

import java.util.Arrays;

public class Rotorius {

    private int ID;
    private int[] rotorius;
    private Rotorius r;
    private int Pasukimu_sk;

    Rotorius(int i) {
        Pasukimu_sk = 1;
        ID = i;
        switch (ID) {
            case 2:
                rotorius = new int[]{6, 2, 0, 4, 3, 9, 8, 5, 10, 7, 1};
                break;
            case 1:
                rotorius = new int[]{3, 0, 1, 4, 2, 8, 9, 5, 7, 10, 6};
                break;
            case 0:
                rotorius = new int[]{6, 2, 1, 7, 9, 5, 0, 3, 10, 4, 8};
                break;
            default:
                rotorius = new int[]{6, 2, 1, 7, 9, 5, 0, 3, 10, 4, 8};
                break;
        }
        if (i > 0) {
            r = new Rotorius(i - 1);
        }
    }

    public void Test() {
        System.out.println(ID + "  -->");
        if (ID != 0) {
            r.Test();
        }
        System.out.println(ID + "  <--");
    }

    public void Pasukti() {
        Pasukimu_sk += 1;
        if(ID > 0){r.Pasukti();}
        if (ID==1 || (ID==2 && Pasukimu_sk%rotorius.length==0)) {
            for (int i = 0; i < rotorius.length; i++) {
                if(rotorius[i] > 0){
                    rotorius[i] -= 1;
                } else {
                    rotorius[i] = rotorius.length - 1;
                }
            }
            int n = rotorius[0];
            for (int j = 0; j < rotorius.length - 1; j++) {
                rotorius[j] = rotorius[j+1];
            }
            rotorius[rotorius.length-1] = n;
        }
    }

    public int Koduoti(int n) {
        System.out.println(ID + " 1     " + n);
        n = rotorius[n];
        System.out.println(ID + " 2     " + n);
        if (ID > 0) {
            n = r.Koduoti(n);
            System.out.println(ID + " 3     " + n);
            for (int i = 0; i < rotorius.length; i++) {
                if (n == rotorius[i]) {
                    n = i;
                    break;
                }
            }
            System.out.println(ID + " 4     " + n);
            
        }
        return n;
    }
}
