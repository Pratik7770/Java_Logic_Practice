package logicbuilding;

//Hollow Diamond Pattern 💎
/*
           *
         *   *
       *       *
     *           *
   *               *
     *           *
       *       *
         *   *
           *


*/

public class Twenty_Five {
    public static void main(String[] args) {

        int rows = 5;

        // ✅ Upper half
        for (int i = 1; i <= rows; i++) {

            // spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }

            // first star
            System.out.print("*");

            // inside spaces
            if (i > 1) {
                for (int k = 1; k <= (2 * i - 3); k++) {
                    System.out.print("  ");
                }
                // second star
                System.out.print("*");
            }

            System.out.println();
        }

        // ✅ Lower half
        for (int i = rows - 1; i >= 1; i--) {

            // spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }

            // first star
            System.out.print("*");

            // inside spaces
            if (i > 1) {
                for (int k = 1; k <= (2 * i - 3); k++) {
                    System.out.print("  ");
                }
                // second star
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
