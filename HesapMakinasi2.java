
import java.util.Scanner;

public class HesapMakinasi2 {
    public static void main(String[] args) {

        int n1 , n2;

        Scanner inp = new Scanner(System.in);
        System.out.println("birinci sayıyı giriniz:");
        n1 = inp.nextInt();
        System.out.println("ikinci sayıyı giriniz:");
        n2 = inp.nextInt();

        System.out.println("1-TOPLAMA\n2-ÇIKARMA\n3-ÇARPMA\n4-BÖLME");
        System.out.println("seçiminiz:");
        int select = inp.nextInt();

        if(select==1){
            System.out.println("toplama:"+(n1+n2));

        }
        else if(select==2){
            System.out.println("farkı:"+(n1-n2));

        }
        else if(select==3){
            System.out.println("çarpımı:"+(n1*n2));

        }
        else if(select==4){
            if(n2!=0){
                System.out.println("bölümü:"+(n1/n2));
            }
            else{
                System.out.println("sayı sıfıra bölünmez.");
            }
        }
        else{
            System.out.println("hatalı giriş yaptınız.");
        }
    }
}
