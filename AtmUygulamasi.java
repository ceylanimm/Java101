
import java.util.Scanner;

public class AtmUygulamasi {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        String passWord,userName;
        int balance = 1500,price=0,select;

        System.out.print("Kullanıcı adınızı giriniz: ");
        userName = inp.nextLine();
        System.out.print("Parolanızı giriniz: ");
        passWord = inp.nextLine();

        if(userName.equals("patika") && passWord.equals(("dev123"))){
            System.out.println("X Bankasına Hoşgeldiniz!");
            System.out.println("Gerçekleştirmek İstediğiniz İşlemi Seçiniz:");
            System.out.println("1-Para yatırma\n" +
                    "2-Para çekme\n" +
                    "3-Bakiye sorgulama\n" +
                    "4-Çıkış yapma");
            select = inp.nextInt();

            switch(select){

                case 1:
                    System.out.println("Yatırmak istediğiniz miktarı giriniz: ");
                    price = inp.nextInt();
                    balance=+price;
                    break;

                case 2:
                    System.out.println("Çekmek istediğiniz tutarı giriniz: ");
                    price = inp.nextInt();

                    if(price>balance){
                        System.out.println("Yetersiz bakiye.. ");
                    }
                    else{
                        balance-=price;
                    }
                    break;

                case 3:
                    System.out.println("Bakiyeniz: "+balance);
                    break;


                case 4:
                    System.out.println("Çıkış yapıldı");
                    break;
            }
        }
        else{
            System.out.println("Hatalı giriş yaptınız, lütfen tekrar deneyiniz...");
        }
    }
}
