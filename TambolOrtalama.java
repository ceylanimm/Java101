
import java.util.Scanner;

public class TambolOrtalama {
    public static void main(String[] args) {

        int sayi,i;
        int sayac=0,toplam=0;
        float ort;

        Scanner inp =new Scanner(System.in);

        System.out.print("bir sayı giriniz: ");
        sayi = inp.nextInt();

        for(i=1;i<=sayi;i++){

            if(i%3==0 && i%4==0){
                toplam =toplam+i;
                sayac++;
            }

        }
        ort =(toplam/sayac);
        System.out.println("3 ve 4 sayısına tam bölünebilen sayıların ortalaması: "+ort);
    }
}
