
package zadanie20184;


public class Zadanie20184 {


    public static void main(String[] args) {
        int w = 6;
        int k = 6;

        for (int i = 0; i < w; i++) {
            for (int j = 0;j < k; j++) {

                if ((i == 0 && j==5) || ( i ==1 && j >=4) || ( i ==2 && j >=3) || ( i == 3 && j>=2)  || (i ==4 && j>=1) || (i==5 && j>=0)) {
                    System.out.print("X");
              }else { System.out.print(".");   
                }
                }
            System.out.println();
      
        }
    }
    }
