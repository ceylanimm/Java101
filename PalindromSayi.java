
import java.util.Scanner;

public class PalindromSayi {

    static boolean isPalindrom(int number) {

        int temp = number, reserveNumber = 0, lastNumber;

        while (temp != 0) {
            //son basamagı buluyorum.
            lastNumber = temp % 10;
            reserveNumber = (reserveNumber * 10) + lastNumber;
            temp /= 10;
            //son basamagı yazdırmıyorum.

        }
        if (number == reserveNumber) {
            System.out.println("sayı palindromdur..");
            return true;
        } else {
            System.out.println("sayı palindrom degildir..");
            return false;
        }

    }

    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.println("bir sayı giriniz: ");
        n = inp.nextInt();
        System.out.println(isPalindrom(n));


    }
}
