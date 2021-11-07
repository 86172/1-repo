
package zadanie2.pkg1;

import java.util.Scanner;


public class Zadanie21 {


    public static void main(String[] args) {
        System.out.println("Program wyswietla roczne przychody" );
        
        Scanner sc = new Scanner(System.in);
        int agree;
        double a, b, c, d, e, f, g, h, i, j, k, l, min = 0, max = 0;
        boolean pierwszyOdczyt = true;
       //for(int i=0; i<=12; i++){
         //   System.out.println("Podaj twoje przychody w miesiącu " + )
            do{
        System.out.println( "Podaj twoje przychody w miesiącu styczeń" );
         a = sc.nextDouble();
        System.out.println( "Podaj twoje przychody w miesiącu luty" );
         b = sc.nextDouble();
        System.out.println( "Podaj twoje przychody w miesiącu marzec" );
         c = sc.nextDouble();
        System.out.println( "Podaj twoje przychody w miesiącu kwiecień" );
         d = sc.nextDouble();
        System.out.println( "Podaj twoje przychody w miesiącu maj" );
         e = sc.nextDouble();
        System.out.println( "Podaj twoje przychody w miesiącu czerwiec" );
         f = sc.nextDouble();
        System.out.println( "Podaj twoje przychody w miesiącu lipiec" );
         g = sc.nextDouble();
        System.out.println( "Podaj twoje przychody w miesiącu sierpień" );
         h = sc.nextDouble();
        System.out.println( "Podaj twoje przychody w miesiącu wrzesień" );
         i = sc.nextDouble();
        System.out.println( "Podaj twoje przychody w miesiącu październik" );
         j = sc.nextDouble();
        System.out.println( "Podaj twoje przychody w miesiącu listopad" );
         k = sc.nextDouble();
        System.out.println( "Podaj twoje przychody w miesiącu grudzień" );
         l = sc.nextDouble();
         for ( double z = a; z<=l; z ++){
             
            if(pierwszyOdczyt){
                
                max = a;
                min = a;
               pierwszyOdczyt= false; 
              }else{
                max = a;
                min = a;
                
                 if (b < min){ 
                     min = b;}
                 if (b > max){
                     max = b;}
                 if (c < min){
                     min = c;}
                 if (c > max){
                    max = c;}
                if (d < min){ 
                     min = d;}
                 if (d > max){
                     max = d;}
                 if (e < min){ 
                     min = e;}
                 if (e > max){
                     max = e;}
                 if (f < min){ 
                     min = f;}
                 if (f > max){
                     max = f;}
                 if (g < min){ 
                     min = g;}
                 if (g > max){
                     max = g;}
                 if (h < min){ 
                     min = h;}
                 if (h > max){
                     max = h;}
                 if (i < min){ 
                     min = i;}
                 if (i > max){
                     max = i;}
                 if (j < min){ 
                     min = j;}
                 if (j > max){
                     max = j;}
                 if (k < min){ 
                     min = k;}
                 if (k > max){
                     max = k;}
                 if (l < min){ 
                     min = l;}
                 if (l > max){
                     max = l;}
            }       
            }
             //DoubleStream.iterate(a, l).max();
         double sum = a+b+c+d+e+f+g+h+i+j+k+l;
         double average = sum/12;
        System.out.println("Suma przychodłów ze wszytskich miesięcy wynosi: " + sum);
        System.out.println("Średni przychód miesięczny wynosi: " + average); 
        System.out.println( "Przychód minimalny wynosi: " + min + "\nPrzychód maksymalny wynosi: " + max);
                    
        System.out.println("Czy chcesz powtórzyć przeliczenia? \nNaciśnij 1 jeśli tak \nNaciśnij 0 jeśli nie ");
         agree = sc.nextInt();
         }while(agree == 1);
         System.out.println("Koniec");
         }      
  }  
 /*  Scanner sc = new Scanner(System.in);
        int agree;
        double a, b, c, d, e, f, g, h, i, j, k, l, min = 0, max = 0;
        boolean pierwszyOdczyt = true;
        System.out.println("Program wyswietla roczne przychody" );
  
            do{
             System.out.println("Podaj ilość miesięcy :");
              int number = sc.nextInt();
              while (number<=0){
            System.out.println("Podaj wartość dodatnią");}
        System.out.println( "Podaj twoje przychody w miesiącu styczeń" );
         a = sc.nextDouble();
        System.out.println( "Podaj twoje przychody w miesiącu luty" );
         b = sc.nextDouble();
        System.out.println( "Podaj twoje przychody w miesiącu marzec" );
         c = sc.nextDouble();
        System.out.println( "Podaj twoje przychody w miesiącu kwiecień" );
         d = sc.nextDouble();
        System.out.println( "Podaj twoje przychody w miesiącu maj" );
         e = sc.nextDouble();
        System.out.println( "Podaj twoje przychody w miesiącu czerwiec" );
         f = sc.nextDouble();
        System.out.println( "Podaj twoje przychody w miesiącu lipiec" );
         g = sc.nextDouble();
        System.out.println( "Podaj twoje przychody w miesiącu sierpień" );
         h = sc.nextDouble();
        System.out.println( "Podaj twoje przychody w miesiącu wrzesień" );
         i = sc.nextDouble();
        System.out.println( "Podaj twoje przychody w miesiącu październik" );
         j = sc.nextDouble();
        System.out.println( "Podaj twoje przychody w miesiącu listopad" );
         k = sc.nextDouble();
        System.out.println( "Podaj twoje przychody w miesiącu grudzień" );
         l = sc.nextDouble();
         for ( double z = a; z<=l; z ++){
             
            if(pierwszyOdczyt){
                max = a;
                min = a;
               pierwszyOdczyt= false; 
              }else{
                max = a;
                min = a;
                
                 if (b < min){ 
                     min = b;}
                 if (b > max){
                     max = b;}
                 if (c < min){
                     min = c;}
                 if (c > max){
                    max = c;}
                if (d < min){ 
                     min = d;}
                 if (d > max){
                     max = d;}
                 if (e < min){ 
                     min = e;}
                 if (e > max){
                     max = e;}
                 if (f < min){ 
                     min = f;}
                 if (f > max){
                     max = f;}
                 if (g < min){ 
                     min = g;}
                 if (g > max){
                     max = g;}
                 if (h < min){ 
                     min = h;}
                 if (h > max){
                     max = h;}
                 if (i < min){ 
                     min = i;}
                 if (i > max){
                     max = i;}
                 if (j < min){ 
                     min = j;}
                 if (j > max){
                     max = j;}
                 if (k < min){ 
                     min = k;}
                 if (k > max){
                     max = k;}
                 if (l < min){ 
                     min = l;}
                 if (l > max){
                     max = l;}
            }       
            }
             //DoubleStream.iterate(a, l).max();
         double sum = a+b+c+d+e+f+g+h+i+j+k+l;
         double average = sum/12;
        System.out.println("Suma przychodłów ze wszytskich miesięcy wynosi: " + sum);
        System.out.println("Średni przychód miesięczny wynosi: " + average); 
        System.out.println( "Przychód minimalny wynosi: " + min + "\nPrzychód maksymalny wynosi: " + max);
                    
        System.out.println("Czy chcesz powtórzyć przeliczenia? \nNaciśnij 1 jeśli tak \nNaciśnij 0 jeśli nie ");
         agree = sc.nextInt();
         }while(agree == 1);
         System.out.println("Koniec");
         }      
  } */