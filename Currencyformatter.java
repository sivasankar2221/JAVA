
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;


public class Currencyformatter {

  
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          double payment= sc.nextDouble();
          sc.close();
     NumberFormat objus=NumberFormat.getCurrencyInstance(Locale.US);
    NumberFormat objin=NumberFormat.getCurrencyInstance(new Locale("en","IN"));
    NumberFormat objch=NumberFormat.getCurrencyInstance(Locale.CHINA);
    NumberFormat objfr;
        objfr = NumberFormat.getCurrencyInstance(Locale.FRANCE);

    String us=objus.format(payment);
    String in=objin.format(payment);
    String ch=objch.format(payment) ;
    String fr=objfr.format(payment);
          
          
          
          System.out.println("US:"+us);
          System.out.println("INDIA:"+in);
          System.out.println("FRANCE"+fr);
          System.out.println("CHINA:"+ch);
            }
    
}