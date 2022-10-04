import java.util.Scanner;

public class UcgenAlan {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);

        int a,b,c;
        System.out.println("bir kenar gir:");
        a= inp.nextInt();
        System.out.println("bir kenar gir:");
        b= inp.nextInt();
        System.out.println("bir kenar gir:");
        c= inp.nextInt();

        int cevre=a+b+c;
        int u=cevre/2;
        double alan=Math.sqrt((u*(u-a)*(u-b)*(u-c)));
        System.out.println("ucgenin alanı:"+alan);

    }
}
