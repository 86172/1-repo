
package przyklad;

import java.util.Scanner;
import przyklad.Przyklad.main.licz_srednia;



public class Przyklad {

 
    public static void main(String[] args) {
       
 
class licz_srednia{
double wynik=0;
licz_srednia(double n){
for(int x=1;x<=n;x++){
System.out.println("podaj liczbe nr "+x+":");
int a = new Scanner(System.in).nextInt();
wynik=wynik+a;
}
System.out.println("Srednia tych liczb to: "+wynik/n);
}
}
 
public class srednia {
 
public static void main(String[] args) {
System.out.println("ile liczb jest w sredniej");
int n = new Scanner(System.in).nextInt();
new licz_srednia(n);
}
 
}
    }
    
}
