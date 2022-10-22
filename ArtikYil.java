
import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {

        int year;

        Scanner inp = new Scanner(System.in);

        System.out.print("Yıl Giriniz: ");
        year = inp.nextInt();

        if(year%4==0){

            if(year%100==0){

                if (year % 400 == 0) {

                    System.out.println("Artık Yıldır..");
                }
                else{

                    System.out.println("Artık Yıl Değildir..");
                }
            }
            else{
                System.out.println("Artık Yıldır..");
            }

        }
        else{
            System.out.println("Artık Yıl Değildir..");
        }
    }
}
