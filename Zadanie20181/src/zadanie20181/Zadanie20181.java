package zadanie20181;

public class Zadanie20181 {

    public static void main(String[] args) {
        int w = 5;
        int k = 8;

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < k; j++) {
//                System.out.println();
                if (i % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }

    }

}
