
package zadanie1.pkg2a;

import java.util.Scanner;


public class Zadanie12a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cal, jard, stopa, milaLadowa;
      double a, b, c, d, e, f;
      int p;
      cal = 39.37005;
      jard = 1.09361;
      stopa = 3.28083;
      milaLadowa = 0.00062;
      a = cal * p;
      b = jard * p;
      c = stopa * p;
      d = milaLadowa * p;
 System.out.println("Program ten wyświetla tabelę przeliczeniową na jednnostki odległości z metrów na: \n1. Cale \n2. Jardy \n3. Stopę \n4. Milę lądową");
        System.out.println("Podaj liczbę od której ma rozpocząć się program");
         p= sc.nextInt();
        while ( p <= 0 ){
            System.out.println("Podaj liczbę większą od zera");
            p = sc.nextInt();
        }
        System.out.println("O ile ma zwiększać się jednostka?");
        int h = sc.nextInt();
        while( h <= 0){
          System.out.println("Podaj wartość dodatnią");
          h = sc.nextInt();
        }
        System.out.println("Podaj wartość na jakiej ma zakończyć się tabelka");
        int k = sc.nextInt();   
        while (k <= 0 || k < p ){
           System.out.println("Podaj wartość dodatnią,większą od wartości rozpoczynającej program");
            k = sc.nextInt();}
        double[] tableOneDimension = new double[((k-p)+1)+p];
        //for(int i = p; i<= k; i=i+h){


        tableOneDimension[0] = %.4f, a;
        tableOneDimension[1] =         
// throw exception -> out of bound
        //tableOneDimension[5]= 4;
        //last position in table
       //tableOneDimension[4]= 4;
        for(int i = p; i<+k;i=i+h){
            System.out.println(tableOneDimension[i]);
        }

        /************************************************/
        //String[][] tableTwoDimension = new String[5][5];
        //tableTwoDimension[1][2] = "asdfasdf";
       // for(int i = 0; i<tableTwoDimension.length;i++){
           // for(int j = 0; j < tableTwoDimension[i].length; j++){
                  //  System.out.print(tableTwoDimension[i][j]);
            }
            //System.out.println();
        }
   
//}
    //}
    

