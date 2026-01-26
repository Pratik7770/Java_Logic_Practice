package logicbuilding;
//Inverted Pyramid
/*
* * * * * * * * *
 * * * * * * *
   * * * * *
    * * *
      *
*/


public class Twenty_Two {
    public static void main(String[] args) {

        int rows = 5;

        for (int i = 1; i <= rows; i++) {

            // spaces
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }

            // stars
            for (int k = 1; k <= (2 * (rows - i) + 1); k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
