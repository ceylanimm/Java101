
import java.util.Scanner;

public class MaxMinDegeriBulma {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int sayac=0,sayi;
        int max=0,min=0;
        System.out.print("kac tane sayı girmek istiyorsunuz?: ");
        sayac = inp.nextInt();

        for(int i =1 ; i <= sayac; i++){
            System.out.print("bir sayı giriniz: ");
            sayi = inp.nextInt();

            /* ilk girilen sayıyı kontrol ettiriliyor
             max veya min degişenine atıyorum ve
              sonrasından girilen sayıları da
               onlara kontrol ettiriyorum.
             */
            
            if(i==1){
                min=sayi;
                max=sayi;
            }
            if(sayi>max){
                max=sayi;
            }
            else if(sayi<min){
                min=sayi;
            }
        }
        System.out.println("en büyük sayı: "+max);
        System.out.println("en küçük sayı: "+min);



    }
}
