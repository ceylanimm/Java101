
import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int sayi;
        int i,j,k;
        System.out.print("basamak sayısını giriniz:");
        sayi = inp.nextInt();

        //büyük bir for açıp satır yazdırıyorum.

        for(i=sayi;i>0;i--){

            //satır kenarındaki boşlukları yazdırıyorum

            for (j=sayi-i;j>0;j--) {
                System.out.print(" ");
            }

            //yıldızları yazdırıyorum.

            for(k=(2*i)-1;k>0;k--){
                System.out.print("*");
            }

            //en son satırın yıldızlarını yazdırınca bir alt saırı yazdırıyorum.

            System.out.println(" ");

        }
    }
}
