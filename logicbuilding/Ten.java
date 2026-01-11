package logicbuilding;
//Check whether a number is an ARMSTRONG number


public class Ten {
    public static void main(String[] args) {

        int number = 153;
        int original = number;

        // STEP 1: Count digits
        int count = 0;
        int temp = number;

        while (temp > 0) {
            temp = temp / 10;
            count++;
        }

        // STEP 2: Calculate Armstrong sum
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;

            int power = 1;
            for (int i = 1; i <= count; i++) {
                power = power * digit;
            }

            sum = sum + power;
            number = number / 10;
        }

        // STEP 3: Compare
        if (sum == original) {
            System.out.println(original + " is an ARMSTRONG number");
        } else {
            System.out.println(original + " is NOT an ARMSTRONG number");
        }
    }
}

