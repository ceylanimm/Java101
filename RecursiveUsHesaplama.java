import java.util.Scanner;

public class RecursiveUsHesaplama {

    static int usAlma(int taban,int us){
        int i;
        int result = 1;
        for(i = 1; i <= us; i++){
            result *= taban;
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n1,n2;
        System.out.print("taban degerini giriniz: ");
        n1 = inp.nextInt();

        System.out.print("üs degerini giriniz:: ");
        n2 = inp.nextInt();
        
        System.out.println(usAlma(n1,n2));

    }
}
