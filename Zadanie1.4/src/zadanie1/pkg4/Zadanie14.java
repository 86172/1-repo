
package zadanie1.pkg4;


import java.util.Random;
import java.util.Scanner;


public class Zadanie14 {

    
    public static void main(String[] args) {
        System.out.println("Witaj w grze \"Za dużo, za mało\"");
          System.out.println("\nProgram wylosuje liczbe z przedzialu podanego przez Ciebie a twoim zadaniem jest ją odgadnąć. ");
          System.out.println("Liczba prób odgadnięcia jest uzależniona od liości liczb w podanym przez Ciebie przedziale.");
        Scanner sc = new Scanner(System.in);
        int a, p, k;
        int agree;
        Random random = new Random();
       
        do{
         System.out.println("\nPodaj liczbę od której ma zacząć się przedział:");
          p = sc.nextInt();
         System.out.println("A teraz podaj liczbę na której ma zakończyc sie przedział");
          k = sc.nextInt();
          a = random.nextInt((k-p)+1)+p;
        
         for (int i=1; i<=((k-p)+1); i++){
          System.out.println("Jak myślisz jaką liczbę wylosował program: \nPróba nr" + i);
              int b=sc.nextInt();
          if (b==a){
                System.out.println("Brawo, trafiles za " + i + " razem!");
               
              break;
            }else if (b>a){
                System.out.println ("Za duzo");
               
            }else if(b<a){
                System.out.println ("Za malo");
            }
           if (i==((k-p)+1)){
              System.out.println("Przegrałeś!");}
            }
              System.out.println("Czy chcesz zagrać jeszcze raz? \nNaciśnij '1' jeśli tak \nNaciśnij '2' jeśli nie");
              agree = sc.nextInt();
        
         }while (agree ==1);
          System.out.println("Koniec gry");
    }
}