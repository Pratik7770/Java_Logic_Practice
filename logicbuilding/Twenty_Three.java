package logicbuilding;
//(Diamond Pattern)
/*

         *
       * * *
     * * * * *
   * * * * * * *
 * * * * * * * * *
   * * * * * * *
     * * * * *
       * * *
         *


*/
public class Twenty_Three {
    public static void main(String[] args) {

        int rows = 5;

        // ✅ Upper Pyramid
        for (int i = 1; i <= rows; i++) {

            // spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }

            // stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // ✅ Lower Inverted Pyramid
        for (int i = rows - 1; i >= 1; i--) {

            // spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }

            // stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
