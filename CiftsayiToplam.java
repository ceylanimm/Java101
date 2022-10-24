
import java.util.Scanner;

public class CiftsayiToplam {
    public static void main(String[] args) {

        int number,total=0;

        Scanner inp = new Scanner(System.in);

        do{
            System.out.print("sayı giriniz:");
            number = inp.nextInt();
            if( number % 4 == 0){

                total = total + number;
            }
        }while(number % 2 == 0);

        System.out.println("Toplam: "+total);
    }
}
