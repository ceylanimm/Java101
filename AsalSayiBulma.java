
import java.util.Scanner;

public class AsalSayiBulma {
    public static void main(String[] args) {

        int sayac = 0;

        for(int i =2; i < 100; i++){

            /*büyük bir for acıp önce
            100e kadar sayıları yazdırıyorum.
             */

            for(int k=2; k < i; k++){
                /*büyük forda yazdığım sayıların
                 kendine kadar olanlarını istiyorum.
                 */
                /*mesela 13 sayısı kendinden küçük nelere bölünebiliyor
                 buna bakıyorum eğer kendinden küçük sayılara
                 bölünebiliyor olsaydı sayac
                 tek tek artardı ama sayac artmıyorsa
                 sayı asaldır derim
                 */
                
                if(i % k == 0){

                    sayac++;
                }

            }
            if(sayac == 0){
                System.out.println(i);
            }
            sayac = 0;
        }
    }
}
