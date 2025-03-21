import java.util.Scanner;

public class MatrisCreate {
    public int[][] matrisCreate(int giris, int satir, int sutun) {

        Scanner klavye = new Scanner(System.in);
        int i, j;
        int[][] matris = new int[satir][sutun];

        switch(giris){
          
          case 1:
                for (i = 0; i < satir; i++) {
                    for (j = 0; j < sutun; j++) {
                        matris[i][j] = (int) (100 * Math.random() * 99 + 1);
                    }
                }
                break;
            
          case 2:
                for (i = 0; i < satir; i++) {
                    for (j = 0; j < sutun; j++) {
                        matris[i][j] = klavye.nextInt();
                    }
                }
            break;
        }
        return matris;
    }
}
