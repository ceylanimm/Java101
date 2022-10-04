import java.util.Scanner;

public class KdvTutari {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);

        int tutar;
        System.out.println("tutar giriniz:");
        tutar= inp.nextInt();

        if(tutar<1000){
            double kdv1=(tutar*18)/100;
            System.out.println("kdv tutarı1::"+kdv1);

        }
        else{
            double kdv2=(tutar*8)/100;
            System.out.println("kdv tutarı2:"+kdv2);
        }

    }
}
