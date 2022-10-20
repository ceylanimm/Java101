
import java.util.Scanner;

public class BurcProgrami {
    public static void main(String[] args) {

        int day,month;
        String burc ="";
        boolean isError = false;

        Scanner inp = new Scanner(System.in);

        System.out.println("doğduğunuz ayı giriniz :");
        month = inp.nextInt();

        System.out.println("doğdğunuz günü giriniz :");
        day = inp.nextInt();

        if(month==1){
            if(0<day && day<=31){
                if(day<21){
                    burc ="oğlak";
                }
                else{
                    burc ="kova";

                }
            }
            else{
                isError =true;
            }
        }

        if(month==2){
            if(0<day && day<=28){
                if(day<19){
                    burc ="kova";
                }
                else{
                    burc ="balık";

                }
            }
            else{
                isError =true;
            }
        }

        if(month==3){
            if(0<day && day<=31){
                if(day<20){
                    burc ="balık";
                }
                else{
                    burc ="koç";

                }
            }
            else{
                isError =true;
            }
        }

        if(month==4){
            if(0<day && day<=30){
                if(day<20){
                    burc ="koç";
                }
                else{
                    burc ="boğa";

                }
            }
            else{
                isError =true;
            }
        }

        if(month==5){
            if(0<day && day<=30){
                if(day<21){
                    burc ="boğa";
                }
                else{
                    burc ="ikizler";

                }
            }
            else{
                isError =true;
            }
        }

        if(month==6){
            if(0<day && day<=30){
                if(day<22){
                    burc ="ikizler";
                }
                else{
                    burc ="yengeç";

                }
            }
            else{
                isError =true;
            }
        }

        if(month==7){
            if(0<day && day<=31){
                if(day<22){
                    burc ="yengeç";
                }
                else{
                    burc ="aslan";

                }
            }
            else{
                isError =true;
            }
        }

        if(month==8){
            if(0<day && day<=31){
                if(day<22){
                    burc ="aslan";
                }
                else{
                    burc ="başak";

                }
            }
            else{
                isError =true;
            }
        }

        if(month==9){
            if(0<day && day<=30){
                if(day<22){
                    burc ="başak";
                }
                else{
                    burc ="terazi";

                }
            }
            else{
                isError =true;
            }
        }

        if(month==10){
            if(0<day && day<=31){
                if(day<22){
                    burc ="terazi";
                }
                else{
                    burc ="akrep";

                }
            }
            else{
                isError =true;
            }
        }

        if(month==11){
            if(0<day && day<=30){
                if(day<21){
                    burc ="akrep";
                }
                else{
                    burc ="yay";

                }
            }
            else{
                isError =true;
            }
        }

        if(month==12){
            if(0<day && day<=31){
                if(day<21){
                    burc ="yay";
                }
                else{
                    burc ="oğlak";

                }
            }
            else{
                isError =true;
            }
        }

        if(isError){
            System.out.println("hatalı giriş yaptınız ,tekrar deneyiniz...");
        }
        else{
            System.out.println("burcunuz :"+burc);
        }




























    }



























































}
