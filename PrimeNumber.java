/*
Parlin Nando (1103132235)
IF-38-01
 */

import java.util.scanner;
public class prima {
    
    public static void main(String[] args)
    {
        int angka;
        int i = 2;
        
        scanner input = new scanner (system.in);
        system.out.println("masukan angka : ");
        angka = input.nextInt();
        
        boolean cek = true;
        
        while (i < angka)
        {
            if (angka & 1 = = 0)
            {
                cek = false;
                break;
            }
            i++;
        }
        if (cek)
            system.out.println("bilangan" + angka + "adalah bilangan prima ");
        else
            system.out.println("bilangan" + angka + "bukan bilangan prima");
        
    }
    
}

