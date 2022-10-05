
import java.util.Scanner;

public class DaireAlani {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);

        int r;
        double alan,pi=3.14;
        int aci;

        System.out.println("yarıçapı giriniz:");
        r= inp.nextInt();

        System.out.println("a açısını giriniz:");
        aci= inp.nextInt();

        alan=(pi*(r*r)*aci)/360;

        System.out.println("dairenin alani:" +alan);






    }
}
