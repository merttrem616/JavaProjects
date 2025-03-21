public class MatrisYaz extends MatrisCreate {

    int i, j;

    public void matrisYaz(int[][] matris) {
        System.out.println("Oluşturulan matris: ");
        for(i=0; i<matris.length; i++){
            for(j=0; j<matris[0].length; j++){
                System.out.print(matris[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
    public void matrisTranspozeYaz(int[][] matris) {
        System.out.println("Oluşturulan matrisin transpozesi: ");
        for(i=0; i<matris.length; i++){
            for(j=0; j<matris[0].length; j++){
                System.out.print(matris[j][i] + "\t");
            }
            System.out.println("\n");
        }
    }
}
