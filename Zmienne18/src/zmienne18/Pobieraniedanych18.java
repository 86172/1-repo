
package zmienne18;

import java.util.Scanner;


public class Pobieraniedanych18 {
    
    public static void main (String[]args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Wpisz liczbę całkkowitą");
        a = sc.nextInt();
        System.out.println("Wpisz liczbę całkowitą");
        b = sc.nextInt();
        c = a + b;
        System.out.println("Suma a + b =" + c);
    }
    
}
