
package wyznaczpierwiastkirównania;

import java.util.Scanner;


public class Wyznaczpierwiastkirównania {


    public static void main(String[] args) {
        
        System.out.print("Pierwiastki równania Ax*x + B*x + C");
        System.out.println(" ");
     double A, B, C, delta, x0;
     
     Scanner sc = new Scanner(System.in);
     System.out.println("Podaj wartość A ");
     A = sc.nextDouble();
     if(A == 0){
      System.out.println("A nie może byc równe zero");
      System.out.println("Podaj jeszcze raz wartość A");
     A = sc.nextDouble();
    }
     System.out.println("Podaj wartość B");
     B = sc.nextDouble();
     System.out.println("Podaj wartość C");
     C = sc.nextDouble();
     
 delta = B*B - (4*A*C);
 
 if (delta<0){
     System.out.println("Brak rozwiązań");
 }else if (delta==0){
     System.out.println("Równanie ma jedno rozwiązanie");
     
      x0 = -B / (2*A);
     System.out.println( "X0 = " + x0 );
 }
 if (delta>0){
     System.out.println("Równanie ma dwa rozwiązania");
     double x1, x2, pd;
    pd = Math.sqrt(delta);
     
     x1 = (-B - pd) / (2 * A);
     x2 = (-B + pd) / (2 * A);
     System.out.println( "X1 = " + x1 +" "+ "X2 = " + x2);
     
 
     System.out.println("Koniec zadania ");
     
 } 
    }
    
}
