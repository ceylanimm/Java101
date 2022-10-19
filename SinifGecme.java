import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {

        int mat,fizik,turkce,kimya,muzik;

        Scanner inp = new Scanner(System.in);

        System.out.println("matematik notunu gir:");
        mat = inp.nextInt();

        System.out.println("fizik notunu gir:");
        fizik = inp.nextInt();

        System.out.println("turkce notunu gir:");
        turkce = inp.nextInt();

        System.out.println("kimya notunu gir:");
        kimya = inp.nextInt();

        System.out.println("muzik notunu gir:");
        muzik = inp.nextInt();

        double ort = (mat+fizik+turkce+kimya+muzik)/5;

        if(ort<50){
            System.out.println("sınıfta kaldınız..");
        }
        else{
            System.out.println("tebrikler geçtiniz..");
        }

        System.out.println("ortamanız:"+ort);

    }
}
