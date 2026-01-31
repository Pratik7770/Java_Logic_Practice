package logicbuilding;
//Hollow Pyramid
/*

      *
    *    *
   *       *
  *           *
* * * * * * * * *


*/ 
public class Twenty_Four {
    public static void main(String[] args) {

        int rows = 5;

        for (int i = 1; i <= rows; i++) {

            // spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }

            // first row
            if (i == 1) {
                System.out.println("*");
            }

            // last row
            else if (i == rows) {
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            // middle rows
            else {
                System.out.print("* ");

                // inside spaces
                for (int k = 1; k <= (2 * i - 3); k++) {
                    System.out.print("  ");
                }

                System.out.println("*");
            }
        }
    }
}
