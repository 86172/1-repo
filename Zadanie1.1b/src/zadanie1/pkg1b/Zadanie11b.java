
package zadanie1.pkg1b;

import java.util.Scanner;


public class Zadanie11b {


    public static void main(String[] args) {
       
        double metr;
     
      Scanner sc = new Scanner(System.in);

        Scanner scanner = new Scanner(System.in);
        int nazwa;
        System.out.println("Przelicznik jednostek długości z metra na cal, jard,stopę ,milę lądową, sążen, milaMorska, angstremy, kable, łokieć, wiorsty, kabel ");
      do{ 
      System.out.println("Wpisz wartość w metrach");
      metr = sc.nextDouble();
      while(true){
                if(metr>0){
                    break;
                }
                else{
                        System.out.println("Wpisz liczbę dodatnią ");
                        metr = sc.nextDouble();
                }
            }
        System.out.println("Przeliczenia :");
        double cal, jard, stopa, milaLadowa;
        double a, b, c, d, e, f;
        double sążen, milaMorska, angstremy, kable, łokiec, wiorsty, kabel;
        double g, h, i, j, k, l;
      
        cal = 39.37005;
        jard = 1.09361;
        stopa = 3.28083;
        milaLadowa = 0.00062;
        sążen = 0.54680;
        milaMorska = 0.00053;
        angstremy = 10000000000l;
        łokiec = 1.64041;
        wiorsty = 0.00093;
        kabel = 0.00539;
        
       a = cal * metr;
       b = jard * metr;
       c = stopa * metr;
       d = milaLadowa * metr;
       g = sążen * metr;
       h = milaMorska * metr;
       i = angstremy * metr;
       j = łokiec * metr;
       k = wiorsty * metr;
       l = kabel * metr;
     
      System.out.format(metr + " metr [m] = %.4f", a );
        System.out.println(" cal ");
     System.out.format( metr + " metr [m] = %.4f ", b);
        System.out.println(" jard ");
     System.out.format( metr + " metr [m] = %.4f ", c );
        System.out.println(" stopa ");
     System.out.format( metr + " metr [m] = %.4f", d);
        System.out.println(" mila lądowa");
      System.out.format(metr + " metr [m] = %.4f", g );
        System.out.println(" sążeń ");
      System.out.format(metr + " metr [m] = %.4f", h );
        System.out.println(" mila morska ");
      System.out.format(metr + " metr [m] = %.4f", i );
        System.out.println(" angstremy ");
      System.out.format(metr + " metr [m] = %.4f", j );
        System.out.println(" łokcie ");
      System.out.format(metr + " metr [m] = %.4f", k );
        System.out.println(" wiorsty ");
      System.out.format(metr + " metr [m] = %.4f", l );
        System.out.println(" kable ");
     System.out.println("Przeliczanie zakończone");
     System.out.println();
     System.out.println("Czy chcesz wyświetlić obliczenia jeszcze raz? \nNaciślij '1' jeśli tak \nNaciśnij '2' jeśli nie ");
     nazwa = scanner.nextInt();;
        
      }while (nazwa ==1);
       System.out.println("Koniec");
       }               
    }