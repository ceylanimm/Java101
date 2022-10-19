
import java.util.Scanner;


public class KullaniciGirisi {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        String userName,passWord;

        System.out.println("Kullanıcı Adınız:");
        userName = inp.nextLine();

        System.out.println("Şifreniz:");
        passWord = inp.nextLine();

        if(userName.equals("nurceylan42")&&passWord.equals("hnc2002")){

            System.out.println("sisteme başarıyla giriş yaptınız!");

        }
        else if(userName.equals("nurceylan42")){

            System.out.println("girilen şifre hatalı...");
            System.out.println("şifrenizi sıfırlamak ister misiniz? evet/hayır");
            passWord = inp.nextLine();
            
            if(passWord.equals("evet")){
                String yenisifre;
                System.out.println("yeni bir şifre giriniz:");
                yenisifre = inp.nextLine();

                if(yenisifre.equals("hnc2002")&&yenisifre.equals("passWord")){

                    System.out.println("şifreniz olusturulamadı...");
                }
                else{

                    System.out.println("şifreniz başarıyla oluşturuldu...");
                }

            }
            else{
                System.out.println("çıkıs yapılıyor....");
            }


        }

        else if(passWord.equals("hnc2002")){

            System.out.println("kullanıcı adınız hatalı...");
        }
        else{

            System.out.println("girdiğiniz kullanıcı adı ve şifre yanlıştır...");
        }


    }
}
