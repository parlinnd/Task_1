/**
 Parlin Nando
 1103132235
 IF-38-01
 */
import java.util.Scanner;

public class TemperatureConvert
{
    public static void main (String[] args)
    {
       Scanner x = new Scanner(System.in);
       System.out.println("Temperatur dalam celcius: ");
       int suhu = x.nextInt();
       System.out.println("Ubah : ");
       System.out.print("1.Reamur");
       System.out.print("2.Kelvin");
       System.out.print("3.Fahrenheit");
       System.out.println("pilih 1/2/3 "); 
       int menu = x.nextInt();
       String y = x.next();
       
       switch (menu){
           case 1:
               double R = 0.8 * suhu;
               System.out.println("Reamur   :"+R);
               break;
           case 2:
               double K = 273.15 * suhu;
               System.out.println("Reamur   :"+K);
               break;
           case 3:
               double F = (1.8 * suhu) + 32;
               System.out.println("Reamur   :"+F);
               break; 
       }
    } 
}
