package logicbuilding;
//Right Triangle with spaces (Right aligned)
/*
        *
      * *
    * * *
  * * * *
* * * * *

*/
public class Twenty
{
	public static void main(String[] args) {
		int rows=5;
		 for (int i = 1; i <= rows; i++) {

	            // print spaces
	            for (int j = rows; j > i; j--) {
	                System.out.print("  ");
	            }

	            // print stars
	            for (int k = 1; k <= i; k++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	}

}
}
