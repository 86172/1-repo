
package zmienne18;


public class Zmienne18 {

    
    public static void main(String[] args) {
        
        System.out.println("Program demonstrujący definiowanie zmiennych");
        int a,b,c; //dane typu całkowite
        double x,y,z; //dane typu zmiennoprzecinkowe
        String n1,n2,n3;//napisy-łańcuchy tekstowe
        a = 10;
        b = 7;
        x = 10.3;
        y = 2.5;
        c = (int)33.3; //zmuszamy (część ułamkowa zostanie stracona)
        //System.out.print("Wartość zmiennej c "); te dwa można w taki sposób jak poniżej
        //System.out.println(c);
        System.out.println("Wartość zmiennej c " + c);
        c = a + b;
        System.out.println(" Suma a + b = " + c);
        c = a - b;
        System.out.println(" Różnica a - b = " + c);
        c = a * b;
        System.out.println(" Iloczyn a * b = " + c);
        c = a / b;
        System.out.println(" Iloraz a / b = " + c); //wynikiem będzie 1 bo nie 'przyjmuje' liczb z przecinkim
        c = a % b;
        System.out.println(" Reszta a / b = " + c);
        System.out.println(" ");
        
        
        z = x + y;
        System.out.println(" Suma x + y = " + z);
        z = x - y;
        System.out.println("Różnica x - y = " + z);
        z = x * y;
        System.out.println("Iloczyn x * y = " + z);
        z = x / y;
        System.out.println("Iloraz x / y = " + z);
        z = x % y;
        System.out.println("Reszta x % y =" + z);
       
        }
     
}
