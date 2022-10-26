
import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {

        int numb,n=0,n1=0,n2=1,n3=3;

        Scanner inp = new Scanner(System.in);
        System.out.print("eleman sayısı giriniz: ");
        numb = inp.nextInt();

        for(int i=1; i<=numb; i++){
            n3=n1+n2;
            System.out.print(n1+"+"+n2 + "="+n3 );
            n1=n2;
            n2=n3;

            System.out.println();

        }
    }
}
