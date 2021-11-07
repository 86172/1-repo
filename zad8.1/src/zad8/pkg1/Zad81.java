
package zad8.pkg1;

import java.util.Scanner;


public class Zad81 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sprawdz czy waruiem dowolnego dzielenia jest wartość 0");
        System.out.println("Wpisz liczbę całkowitą");
       int a, b;
       a = sc.nextInt();
       System.out.println("Podaj drugą liczbe całkowitą");
       b = sc.nextInt();
       boolean sprawdz;
          if ( a % b == 0  ){
              System.out.println(true);
          }else
          System.out.println(false);
       
       
       
    }
    
}
