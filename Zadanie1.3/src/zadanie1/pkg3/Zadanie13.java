
package zadanie1.pkg3;

import java.util.Scanner;

public class Zadanie13 {

    public static void main(String[] args) {
        
        System.out.println("Prosty kalkulator, pozwalający na wykonywanie operacji dodawania, odejmowania, mnożenia i dzielenia na dwóch\n" +
          "liczbach rzeczywistych.");
        Scanner sc = new Scanner(System.in); 
        Scanner scanner = new Scanner(System.in);
        int agree ;
        
        do{
        System.out.println( "Podaj pierwszą liczbę" );
        double a = sc.nextDouble();
        String str = new String();
        System.out.println("Jakie działanie chcesz wykonać? \n1. dodawanie  \n2. odejmowanie \n3. mnożenie \n4. dzielenie");
        int c = sc.nextInt();  
        while (c!=1 && c!=2 && c!=3 && c!=4){
            System.out.println("Nie wybrano poprawnego działania- wybierz poprawne działanie");
            c = sc.nextInt();
        }

        System.out.println("Podaj drugą liczbę");
        double b = sc.nextDouble();
        if (c==4 && b==0){
            System.out.println("Dzielnik nie może być równy 0, podaj liczbe różną od zera");
        b = sc.nextDouble();    
        }
        switch (c){
            case 1:
                System.out.println("Wynik to " + (a + b) );
            break;
            case 2:
                System.out.println("Wynik to " + (a - b) );
            break;
            case 3:
                System.out.println("Wynik to " + (a * b));
            break;
            case 4:
                System.out.println("Wynik to " + (a / b));
            break;
            default:
            System.out.println("Nie wybrano żadnego z wyżej wymienionych działań");
        }
        System.out.println("Koniec przeliczania");
        System.out.println("Czy chcesz wyświetlić obliczenia jeszcze raz? \nNaciśnij '0' jeśli tak \nNaciśni '1' jeśli nie ");
        agree = scanner.nextInt();
        }while (agree ==0);
        System.out.println("Koniec");
        
                }
    }  