package logicbuilding;

//Question 19 (Reverse Star Pattern)
/*
  
 
* * * * *
* * * *
* * *
* *
*

*/
public class Nineteen {
	public static void main(String[] args) {
		int rows = 5;
		for (int i=1;i<=rows;i++) {
			for (int j=5;j>=i;j--) {
				System.out.print("* ");

			}
			System.out.println();
		}
	}

}
