package logicbuilding;

//Find the factorial of a given number.

public class Eleven {

	
	    public static void main(String[] args) {

	        int n = 5;        // number to find factorial
	        int fact = 1;     // result variable

	        while (n > 0) {
	            fact = fact * n;
	            n--;
	        }

	        System.out.println("Factorial is " + fact);
	    }
	

}
