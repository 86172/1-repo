
package zadanie1.pkg1c;

import java.util.Scanner;


public class Zadanie11c {


    public static void main(String[] args) {
        double metr;
     
      Scanner sc = new Scanner(System.in);
      System.out.println("Przeliczanie jednostek miar długości");
      System.out.println("Wpisz wartość w metrach");
      metr = sc.nextDouble();
      if(metr < 0){
          System.out.println("Wpisz liczbę dodatnią");
          metr = sc.nextDouble();
      } else
      
      System.out.println("Przeliczenia :");
       
      double cal, jard, stopa, milaLadowa;
      double a, b, c, d, e, f;
      
      cal = 39.37005;
      jard = 1.09361;
      stopa = 3.28083;
      milaLadowa = 0.00062;
     
     a = cal * metr;
     b = jard * metr;
     c = stopa * metr;
     d = milaLadowa * metr;
     

     double sążen, milaMorska, angstremy, kable, łokiec, wiorsty;
      
      double g, h, z, j, k;
      
      sążen = 0.54680;
      milaMorska = 0.00053;
      angstremy = 10000000000l;
      łokiec = 1.64041;
      wiorsty = 0.00093;
      
      for( int i = 0; i < 8; i++ ){
         
       System.out.format(metr + " metr [m] = %.4f", a );
        System.out.println(" cal ");
     System.out.format( metr + " metr [m] = %.4f ", b);
        System.out.println(" jard ");
     System.out.format( metr + " metr [m] = %.4f ", c );
        System.out.println(" stopa ");
     System.out.format( metr + " metr [m] = %.4f", d);
        System.out.println(" mila lądowa");
      
       g = sążen * metr;
       h = milaMorska * metr;
       z = angstremy * metr;
       j = łokiec * metr;
       k = wiorsty * metr;
       
      System.out.format(metr + " metr [m] = %.4f", g );
        System.out.println(" sążeń ");
      System.out.format(metr + " metr [m] = %.4f", h );
        System.out.println(" mila morska ");
      System.out.format(metr + " metr [m] = %.4f", z );
        System.out.println(" angstremy ");
      System.out.format(metr + " metr [m] = %.4f", j );
        System.out.println(" łokcie ");
      System.out.format(metr + " metr [m] = %.4f", k );
        System.out.println(" wiorsty ");
     System.out.println("Przeliczanie zakończone");   
      }
   
           System.out.println("Koniec");
       
       }
            
}    
    

