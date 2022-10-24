
import java.util.Scanner;

public class DortBesKuvvetleriniYazdirma {
    public static void main(String[] args) {

        int numb;

        Scanner inp = new Scanner(System.in);

        System.out.print("bir sayı giriniz: ");
        numb = inp.nextInt();

        System.out.println("4 sayısının kuvvetleri:");

        for(int i = 1; i <=numb; i*=4){
            System.out.println(i);
        }
        System.out.println("5 sayısının kuvvetleri:");
        for(int i = 1; i <= numb; i*=5){
            System.out.println(i);
        }

    }
}
