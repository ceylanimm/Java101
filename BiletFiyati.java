
import java.util.Scanner;

public class BiletFiyati {
    public static void main(String[] args) {

        int mesafe,yas,ytipi;
        double ilkTutar,toplamTutar,indirimliTutar,yasIndirimi=0,tIndirimi=0;

        Scanner inp = new Scanner(System.in);

        System.out.print("mesafeyi km cinsinden giriniz: ");
        mesafe = inp.nextInt();

        System.out.print("yaşınızı giriniz: ");
        yas = inp.nextInt();

        System.out.print("yolculuk tipini giriniz (1=>tek yön  2=>gidiş-dönüş: ");
        ytipi = inp.nextInt();

        if(mesafe>0 &&yas>0 && (ytipi>0 && ytipi<3)) {

            ilkTutar = (mesafe * 0.10);
            System.out.println("normal tutar: " + ilkTutar);
            
            if (yas < 12) {

                yasIndirimi = (ilkTutar * 50 / 100);
            } else if (yas > 12 && yas < 24) {

                yasIndirimi = (ilkTutar * 10 / 100);

            } else if (yas > 65) {

                yasIndirimi = (ilkTutar * 30 / 100);
            }
            if (ytipi == 2) {

                tIndirimi = (ilkTutar * 20 / 100);

            } else {
                tIndirimi = 0;
            }
            System.out.println("yaş indirimi: " + yasIndirimi);
            System.out.println("yolculuk tipi indirimi: " + tIndirimi);
            toplamTutar = ilkTutar - yasIndirimi - tIndirimi;
            System.out.println("toplam tutar: " + toplamTutar);

        }
        else{
            System.out.println("hatalı bir giriş yaptınız..");
        }

    }

}
