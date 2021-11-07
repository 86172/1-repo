
package zadanie1.pkg2;

import java.util.Scanner;


public class Zadanie12 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int g;
        System.out.println("Program ten wyświetla tabelę przeliczeniową na jednnostki odległości z metrów na: \n1. Cale \n2. Jardy \n3. Stopę \n4. Milę lądową");
        do{
        System.out.println("Wybierz tabelę która ma się wyświetlić");
        int a = sc.nextInt();
           while(a!=1 && a!=2 && a!=3 && a!=4){
            System.out.println("Podano niewłaściwy numer tablei,wybierz tabelę jeszcze raz");
            a = sc.nextInt();
            }
           
        System.out.println("Podaj liczbę od której ma rozpocząć się program");
        int metr= sc.nextInt();
        while ( metr <= 0 ){
            System.out.println("Podaj liczbę większą od zera");
            metr = sc.nextInt();
        }
        
        System.out.println("O ile ma zwiększać się jednostka?");
        int c = sc.nextInt();
        while( c <= 0){
          System.out.println("Podaj wartość dodatnią");
          c = sc.nextInt();
        }

        System.out.println("Podaj wartość na jakiej ma zakończyć się tabelka");
        int d = sc.nextInt();   
        while (d <= 0 || d < metr ){
           System.out.println("Podaj wartość dodatnią,większą od wartości rozpoczynającej program");
            d = sc.nextInt();
        }
 
    switch (a){
        case 1:
         double cal = 39.37005; 
         for ( int i = metr; metr <= d; metr+=c ){
         System.out.println(  + metr + " m = " + metr * cal + " cal");
          continue;
                }
        case 2:
          double jard = 1.09361;
          for ( int i = metr; metr <= d; metr+=c ){
         System.out.println(  + metr + " m = " + metr * jard + " jard");
          continue;
          }
        case 3:
          double stopa = 3.28083;
          for ( int i = metr; metr <= d; metr+=c ){
         System.out.println(  + metr + " m = " + metr * stopa + " stopa");
          continue;
          }
        case 4:
         double milaLadowa = 0.00062;
         for ( int i = metr; metr <= d; metr+=c ){
         System.out.println(  + metr + " m = " + metr * milaLadowa + " mila lądowa");
          continue;
          }
        break;
        default:
            System.out.println("Podano niewłaściwy numer tablei");
            }
    System.out.println("Czy chcesz powtórzyć wyświetlanie? \nNaciśnij '1' jeśli Tak \nNacisnij '0' jeśli Nie");
    g = sc.nextInt();
        }while ( g == 1);
    System.out.println("Koniec");
    }
} 