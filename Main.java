import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        MatrisYaz matrisYaz = new MatrisYaz();
        MatrisCreate matrisOlustur = new MatrisCreate();

        int giris;
        int satir, sutun, i, j;

        System.out.println("Hangi işlemi istiyorsunuz? 1:RastgeleMatris 2:El ile giriş ");
        giris = klavye.nextInt();

        System.out.println("Kaç satır olsun? ");
        satir = klavye.nextInt();
        System.out.println("Kaç sütun olsun?");
        sutun = klavye.nextInt();

        int[][] matris = matrisOlustur.matrisCreate(giris, satir, sutun);
        matrisYaz.matrisYaz(matris);
        matrisYaz.matrisTranspozeYaz(matris);

    }
}
