package zadanie2.pkg3;

import java.util.Scanner;

public class Zadanie23 {

    public static void main(String[] args) {
        double time, max = 0, min = 0, sum = 0;
        int licznik = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Program ma na celu wyznaczyć najlepszy, najgorszy i średni czas sprintera dla jednego dystansu");
        System.out.println("Wprowadź watość '0' aby zakończyć wprowadzanie czasów");
        do {
            ++licznik;
            System.out.println("Podaj czas nr." + licznik);
            time = sc.nextDouble();

            if (time == -1) {
                System.out.println("Koniec");
            } else {

                while (time < 0) {
                    System.out.println("Podaj liczbę większą od zera");
                    time = sc.nextDouble();
                }
            }

            if (licznik == 1) {
                min = time;
            }

            if (time < min && time != 0) {
                min = time;
            } else if (time > max) {
                max = time;
            }
            sum = sum + time;
        } while (time != 0);
        System.out.println(sum + time);

        System.out.println("Najleszy czas = " + max);
        System.out.println(" Najgorszy czas = " + min);
        System.out.println("Średni czas = " + (sum) / (licznik - 1));
        System.out.println("Koniec ");
    }
}