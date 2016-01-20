/*
Parlin Nando (1103132235)
IF-38-01
 */
import java.util.Scanner;

public class Nilai {
    
    public static void main (String[] args){
        Scanner x = new Scanner(System.in);
        
        System.out.println("UAS :");int uas = x.nextInt();
        System.out.println("UTS :");int uts = x.nextInt();
        System.out.println("Kuis :");int kuis = x.nextInt();
        
        double total = ((kuis*0.25) + (uts* 0.35) + (uas*0.4));
        
        if ((total >= 0) & (total <= 49)){System.out.println("Failed");}
        else if ((total >= 50) & (total <= 64)){System.out.println("Accepted");}
        else if ((total >= 65) & (total <= 74)){System.out.println("Good");}
        else if ((total >= 75) & (total <= 84)){System.out.println("Very Good");}
        else if ((total >= 85) & (total <= 100)){System.out.println("Excellent");}
    }
}

