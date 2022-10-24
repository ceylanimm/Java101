
import java.util.Scanner;

public class UslusayiHesaplama {
    public static void main(String[] args) {

        int n,k;

        Scanner inp = new Scanner(System.in);

        System.out.print("üssü alınacak sayıyı giriniz: ");
        n = inp.nextInt();

        System.out.print("üs alacak sayıyı giriniz: ");
        k = inp.nextInt();

        int total = 1;
        int i = 1;

        for(i = 1; i <= k; i++){

            total *= n;
        }

        System.out.println("cevap: "+total);
    }
}
