
package cwiczenia0411;


public class Cwiczenia0411 {

    
    public static void main(String[] args) {
        System.out.println("Początek");
        int a = 11, b = 33;
        kopy();
        zwieksz(a, b);
        System.out.println("a = " + a + ", b = " + b);
        int w;
        w = suma(a, b);
        System.out.println("Suma = " + w);
        System.out.println("Iloczyn = " + iloczyn(a, b));
        System.out.println("Koniec");
    }
    
    static int wieksza(int x, int y) {
        int w;
        // wartością funkcji ma być większa z wartości przekazanych przez zmienne x i y
        if ( x>y) w =x; {
            return w;
        }else { 
            return w;
        }
        }
    
    
    static int iloczyn(int x, int y) {
        return x * y;
    }
    
    static int suma(int x, int y) {
        int wynik;
        wynik = x + y;
        return wynik;
    }
    
    static void zwieksz(int x, int y) {
        System.out.println("P. funkcji");
        x += 100; y += 100;
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("K. funkcji");
    }
    
    static void kopy() {
        System.out.println("(c) A.S. 2021");
    }
    
}
