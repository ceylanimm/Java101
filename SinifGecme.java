
import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {

        int mat,fizik,turkce,kimya,muzik;
        double toplam = 0;

        Scanner inp = new Scanner(System.in);

        System.out.println("matematik notunu giriniz:");
        mat = inp.nextInt();

        if(mat>0 &&mat<=100){

            toplam = toplam+mat;
        }
        else{
            System.out.println("geçersiz not girdiniz!");
            System.exit(0);
        }

        System.out.println("fizik notunu giriniz:");
        fizik = inp.nextInt();

        if(fizik>0 && fizik<=100){
            toplam = toplam+fizik;
        }
        else{
            System.out.println("geçersiz not girdiniz!");
            System.exit(0);
        }

        System.out.println("turkçe notunu giriniz:");
        turkce = inp.nextInt();

        if(turkce>0 && turkce<=100){
            toplam = toplam+turkce;
        }
        else{
            System.out.println("geçersiz not girdiniz!");
            System.exit(0);
        }

        System.out.println("kimya noyunu giriniz:");
        kimya = inp.nextInt();

        if(kimya>0 && kimya<=100){
            toplam = toplam+kimya;
        }
        else{
            System.out.println("geçersiz not girdiniz!");
            System.exit(0);
        }

        System.out.println("müzik notunuzu giriniz:");
        muzik = inp.nextInt();

        if(muzik>0 && muzik<=100){
            toplam = toplam +muzik;
        }
        else{
            System.out.println("geçersiz not girdiniz!");
            System.exit(0);
        }

        double avarage = toplam/5;

        if(avarage<=55){

            System.out.println("sınıfı geçemediniz...");
        }
        else{

            System.out.println("sınıfı geçtiniz..");
        }

        System.out.println("ortalamanız:"+avarage);










    }
}
