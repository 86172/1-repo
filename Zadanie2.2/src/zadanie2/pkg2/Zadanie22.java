package zadanie2.pkg2;

import java.util.Scanner;

public class Zadanie22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberJudges, number = 0, agree, max = 0, min = 0, sum = 0;
        System.out.println("Program sędziowski\nOblicza średnią punktów nie uwzględniając maksymalnej i minimalnej ceny punktowej");
        do {
            System.out.println("Podaj ilość sędziów (od 3 do 10):");
            numberJudges = sc.nextInt();
            while (numberJudges < 3 || numberJudges > 10) {
                System.out.println("Podaj wartość z podanego przedziału");
                numberJudges = sc.nextInt();
            }
            for (int i = 1; i <= numberJudges; i++) {
                System.out.println("Wpisz liczbe (całkowitą) punktów sędziego nr: " + i);
                number = sc.nextInt();
                while (number <= 0) {
                    System.out.println("Podaj wartość dodtania");
                    number = sc.nextInt();
                }
                if (i == 1) {
                    min = number;
                }

                if (number < min) {
                    min = number;
                } else if (number > max) {
                    max = number;
                }
                sum = sum + number;
            }

            double s = (double) (sum - (min + max)) / (numberJudges - 2);
            //System.out.println(max);
            //System.out.println(min);
            //System.out.println(sum);
            System.out.println("Srednia punktów wynosi ; " + s);

            System.out.println("Czy chcesz powtórzyć obliczenia dla nwoego zawodnika? \nNaciśnij 1 jeśli tak \nNajciśnij dowolna liczba jesli nie");
            agree = sc.nextInt();
            
        } while (agree == 1);
        System.out.println("Koniec");
        
    }
}