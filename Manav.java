import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {

        int a,e,d,m,p;
        Scanner inp=new Scanner(System.in);

        System.out.println("alınan armutun kg cinsinden değeri:");
        a= inp.nextInt();
        System.out.println("alınan elmanın kg cinsinden değeri:");
        e= inp.nextInt();
        System.out.println("alınan domatesin kg cinsinden değeri:");
        d= inp.nextInt();
        System.out.println("alınan muzun kg cinsinden değeri:");
        m= inp.nextInt();
        System.out.println("alınan patlıcanın kg cinsinden değeri:");
        p= inp.nextInt();

        double tutar=a*2.14+e*3.67+d*1.11+m*0.95+p*5;
        System.out.println("toplam tutar:"+tutar);

    }
}
