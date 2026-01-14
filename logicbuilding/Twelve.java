package logicbuilding;

//Check whether a number is PRIME or NOT PRIME.

public class Twelve {
    public static void main(String[] args) {

        int n = 9;
        
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " is a PRIME number");
        } else {
            System.out.println(n + " is NOT a PRIME number");
        }
    }
}
