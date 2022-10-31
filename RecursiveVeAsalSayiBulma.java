import java.util.Scanner;

public class RecursiveVeAsalSayiBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int number;
        System.out.println("bir sayı giriniz: ");
        number = inp.nextInt();
        asal(number,2);

    }
    static void asal(int n1,int i){
        if(i==n1){
            System.out.println(n1 +" asal sayıdır.");
            return;
        } else if(n1%i==0){
            System.out.println(n1 + " asal sayı değildir.");
            return;
        }
        asal(n1,i+1);

    }

    }

