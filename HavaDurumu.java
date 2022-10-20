
import java.util.Scanner;

public class HavaDurumu {
    public static void main(String[] args) {

        int heat;

        Scanner inp = new Scanner(System.in);

        System.out.println("hava sıcaklık deeğerini giriniz:");
        heat = inp.nextInt();

        if(heat<5){
            System.out.println("kayak yapmaya gidebilirsiniz.");
        }
        else if(heat>5 && heat<15){
            System.out.println("sinemaya gidebilirsiniz.");
        }
        else if(heat>15 && heat<25){
            System.out.println("pikniğe gidebilirsiniz.");
        }
        else{
            System.out.println("yüzmeye gidebilirsiniz.");
        }
    }
}
