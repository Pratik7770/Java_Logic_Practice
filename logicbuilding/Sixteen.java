package logicbuilding;

// Check whether a number is a STRONG number
public class Sixteen {

    public static void main(String[] args) {

        int number = 145;
        int original = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;

            // calculate factorial of digit
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }

            sum = sum + fact;
            number = number / 10;
        }

        if (sum == original) {
            System.out.println(original + " is a STRONG number");
        } else {
            System.out.println(original + " is NOT a STRONG number");
        }
    }
}
