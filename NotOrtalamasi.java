import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        //değiken tipini gir.
        int mat,fiz,kim,tur,tar,muz;
        //degiskenleri kullanıcıdan iste.
        System.out.println("matematik notunu gir:");
        mat= inp.nextInt();
        System.out.println("fizik notunu gir:");
        fiz= inp.nextInt();
        System.out.println("kimya notunu gir:");
        kim= inp.nextInt();
        System.out.println("turkce notunu gir:");
        tur= inp.nextInt();
        System.out.println("tarih notunu gir:");
        tar= inp.nextInt();
        System.out.println("müzik notunu gir:");
        muz= inp.nextInt();

        int toplam=mat+fiz+kim+tar+tur+muz;
        float ortalama=toplam/6f;
        System.out.println("ortalamanız"+ortalama);

        boolean sonuc=ortalama>60;
        String str=sonuc? "gecti":"kaldı";
        System.out.println(str);
    }
}
