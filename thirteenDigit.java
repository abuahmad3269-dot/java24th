import java.util.Scanner;

public class ThirteenDigit {
    public static void main(String... args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 13 digits: ");
        String code = input.next();
        int total = 0;

        for (int i = 0; i < 12; i++) {
            int digit = code.charAt(i) - '0';

            if (i % 2 == 0) {
                total = total + digit;
            } else {
                total = total + 3 * digit;
            }
        }

        int expected = (10 - (total % 10)) % 10;

        if (expected == code.charAt(12) - '0') {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
