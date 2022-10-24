
import java.util.Scanner;

public class KombinasyonBulma {
    public static void main(String[] args) {

        int n,r;
        int fac1 = 1,fac2 = 1,fac3 = 1;
        int kombinasyon;

        Scanner inp = new Scanner(System.in);

        System.out.print("bir sayı giriniz: ");
        n = inp.nextInt();

        System.out.print("bir sayı giriniz: ");
        r = inp.nextInt();

        for(int i = 1; i <= n; i++){
            fac1 = fac1 * i;

        }
        for(int i = 1; i <= r; i++){
            fac2 = fac2 * i;
        }
        for(int i =1; i <= (n-r); i++){
            fac3 = fac3 * i;
        }
        kombinasyon = fac1 / (fac2 * fac3);

        System.out.println("n sayısının r sayına göre kombinasyonu: "+kombinasyon);

    }
}
