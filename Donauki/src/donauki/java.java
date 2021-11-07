package donauki;

import java.util.Scanner;

public class java {

    public static void main(String[] args) {
        System.out.println("Program wyswietla roczne przychody");
        Scanner sc = new Scanner(System.in);
        double income, max = 0, min = 0, sum = 0;
        int agree, month;
        do {
            System.out.println("Podaj ilość miesiecy: ");
            month = sc.nextInt();
            while (month <= 0) {
                    System.out.println("Podaj liczbe większą od zera:");
                    month = sc.nextInt();}
            for (int i = 1; i <= month; i++) {
                System.out.println("Podaj przychód w kolejnych miesiącach: " + i);
                income = sc.nextDouble();
                while (income <= 0) {
                    System.out.println("Podaj liczbe większą od zera:");
                    income = sc.nextDouble();                   
                }
                if(i==1){
                    min = income;
                }
                
                sum = sum + income;
                max = Math.max(income, max);
                min = Math.min(income, min);
                
               /* if (income < min) {          
                    min = income;
                } else if (income > max) {
                    max = income;
                }*/
               
            }

            System.out.println("Suma przychodłów ze wszytskich miesięcy wynosi: " + sum);
            System.out.println("Średni przychód miesięczny wynosi: " + sum / 12);
            System.out.println("Przychód minimalny wynosi: " + min + "\nPrzychód maksymalny wynosi: " + max);
            System.out.println("Czy chcesz powtórzyć przeliczenia? \nNaciśnij 1 jeśli tak \nNaciśnij dowolny cyfrę jeśli nie ");
            agree = sc.nextInt();
        } while (agree == 1);

    }

}
