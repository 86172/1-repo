
package zadanie1.pkg1;

import java.util.Scanner;


public class Zadanie11 {


    public static void main(String[] args) {
      double metr;
      
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Przeliczanie jednostek miar długości");
      System.out.println("Wpisz wartość w metrach");
      metr = sc.nextDouble();
      
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
     
     
      
      a *= 10000;
      a = Math.round(a);
      a /= 10000;
      
      b *= 10000;
      b = Math.round(b);
      b /= 10000;
      
      c *= 10000;
      c = Math.round(c);
      c /= 10000;
      
      d *= 10000;
      d = Math.round(d);
      d /= 10000;
     

      System.out.println( metr + " metr [m] = " + a + " cal");
      System.out.println( metr + " metr [m] = " + b + " jard");
      System.out.println( metr + " metr [m] = " + c + " stopa");
     System.out.println( metr + " metr [m] = " + d + " mila lądowa");
     System.out.format("%.4f%n", d);
      double sążen, milaMorska, angstremy, kable, łokiec, wiorsty;
      
      double g, h, i, j;
      
      sążen = 0.54680;
      milaMorska = 0.00053;
      angstremy = 10000000000l;
      łokiec = 1.64041;
      //wiorsty = 
       g = sążen * metr;
       //h = milaMorska * metr;
       i = angstremy * metr;
       j = łokiec * metr;
      
      g *= 10000;
      g = Math.round(g);
      g /= 10000;
      
      i *= 10000;
      i = Math.round(i);
      i /= 10000;
      
       j *= 10000;
       j = Math.round(j);
       j /= 10000;
      //milaMorska *= 10000;
      //milaMorska = Math.round(milaMorska);
      //milaMorska /= 10000;
      
      
      
      System.out.println( metr + " metr [m] = " +  g + " sążeń");
      //System.out.println( metr + " metr [m] = " + (milaMorska * metr) + " milaMorska");
      System.out.println( metr + " metr [m] = " + i + " angstremy");
      System.out.println( metr + " metr [m] = " + j + " łokieć");
     
      
      
      
      System.out.println("Przeliczanie zakończone");
      
      
      
      
      
      
      
      
    }
    
}
