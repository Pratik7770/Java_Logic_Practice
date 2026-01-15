package logicbuilding;

//Print all prime numbers between 1 and 50.

public class Thirteen {
    public static void main(String[] args) {

        for (int num = 2; num <= 50; num++) {

            boolean isPrime = true;

            for (int i = 2; i <= num - 1; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num);
            }
        }
    }
}
