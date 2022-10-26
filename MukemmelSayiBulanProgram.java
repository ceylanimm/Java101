
import java.util.Scanner;

public class MukemmelSayiBulanProgram {
    public static void main(String[] args) {

        int number, sum = 0;

        Scanner inp = new Scanner(System.in);

        System.out.print("bir sayı giriniz: ");
        number = inp.nextInt();

        for (int i = 1; i <number; i++) {

            if (number % i == 0) {
                sum = sum + i;
            }
        }


    if (number == sum) {
            System.out.println("mükemmel sayıdır..");
        } else {
            System.out.println("mükemmel sayı değildir..");
        }
    }
}