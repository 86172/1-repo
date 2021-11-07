
package programbmi;

import java.util.Scanner;


public class ProgramBMI {


    public static void main(String[] args) {
        double masa, wzrost, BMI;
        Scanner sc = new Scanner(System.in);
        System.out.println("Wpisz swoją wagę w kg ");
        masa = sc.nextDouble();
        System.out.println("Wpisz swój wzrost w cm ");
        wzrost = sc.nextDouble();
        
        wzrost = wzrost / 100;
        //wzrost /= 100;
        BMI = masa / (wzrost* wzrost);
       //double zero = Math.round(BMI);
        System.out.println(" Twoje BMI to " + BMI);
        
        if (BMI < 18.5){
         System.out.println("Niedowaga");
        }else if (BMI > 18.5 && BMI < 25){
            System.out.println("Prawidłowo");
                }
        if (BMI >= 25){
            System.out.println("Nadwaga");
        }
     
    }
    
}
