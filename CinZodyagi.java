
import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {

        int yil;
        String burc =" ";

        Scanner inp = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz: ");
        yil = inp.nextInt();

        if(yil%12==0){
            burc ="maymun";
        }
        if(yil%12==1){
            burc ="horoz";
        }
        if(yil%12==2){
            burc ="köpek";
        }
        if(yil%12==3){
            burc ="domuz";
        }
        if(yil%12==4){
            burc ="fare";
        }
        if(yil%12==5){
            burc ="öküz";
        }
        if(yil%12==6){
            burc ="kaplan";
        }
        if(yil%12==7){
            burc ="tavşan";
        }
        if(yil%12==8){
            burc ="ejderha";
        }
        if(yil%12==9){
            burc ="yılan";
        }
        if(yil%12==10){
            burc ="at";
        }
        if(yil%12==11){
            burc ="koyun";
        }
        System.out.println("Çin Zodyağı Burcunuz: "+burc);
    }
}
