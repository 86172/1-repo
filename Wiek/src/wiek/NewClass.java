
package wiek;

import java.util.Scanner;


public class NewClass {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    
         System.out.println("Cześć");
         System.out.println("Podaj imię");
         String name = scanner.nextLine();
         
 
        if (name.isEmpty()){
                System.out.println("Nie podałeś/aś imienia");  
                System.out.println("Wpisz swoje imię");
            } else {
        System.out.println("Cześć " + name);
        
        
            if (name.endsWith("a") && !name.isEmpty()){
                System.out.println("Jesteś kobietą");
            } else if (!name.endsWith("a")&& !name.isEmpty()){
                System.out.println("Jesteś mężczyzną");
                
           
            }  
   
        System.out.println("Ile masz lat?");
        
        int age = scanner.nextInt();
        
        if (age >= 18){
            System.out.println("Jesteś osobą pełnoletnią");
            System.out.println("Co byś chciała kupić?");
            
        System.out.println("a)Piwo\nb)Wino\nc)Wódkę");
        scanner.nextLine();
        String word = scanner.nextLine();
        
        if (word.equals("a")){
        System.out.println("dobrze do zapłaty będzie 5 zł");
        System.out.println("Dziękujemy za zakupy");
        }
        if (word.equals("b")){
        System.out.println("Dobrze,do zapłaty będzie 15 zł");
        System.out.println("Dziękujemy za zakupy");
        }
        if (word.equals("c")){
        System.out.println("Dobrze, do zapłaty będzie 11 zł");
        System.out.println("Dziękujemy za zakupy");
        }
        if (word.isEmpty()){
            System.out.println("Wybierz a b lub c");
        }
        } else {
            System.out.println("Jesteś osoba niepełnoletnią");
        } 
        
        
    }
        
    }  
  }
    

