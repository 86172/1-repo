
package donauki2;

import java.util.Scanner;


public class Donauki2 {

   
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Jak masz na imię?");
       String name = sc.nextLine();
       if ( name.isEmpty()){
           System.out.println("Podaj imię");
       }
       System.out.println("Cześć" + " " + name + "!");
       
       System.out.println( name + " " + "ile masz lat?");
       
       int age = sc.nextInt();
       
       
       
       
       /*switch (liczba){
           case 1:
               System.out.println("Hej jestem Aga");
               break;
           case 3:
               System.out.println("Hej jestem Renata");
               break;
           case 15:
               System.out.println("Bardzo dobrze!");
               break;
           default :
               System.out.println("good");*/
       }   
       
               
               
}

   