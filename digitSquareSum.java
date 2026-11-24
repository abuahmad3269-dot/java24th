import java.util.Scanner;

public class DigitSquareSum {
    public static void main(String... args) {

        Scanner input = new Scanner(System.in);

        for (int n = 100; n < 1000; n++) {
            int a = n / 100;
            int b = (n / 10) % 10;
            int c = n % 10;

            if (a*a + b*b + c*c == n) {
                System.out.println(n);
            }
        }
    }
}
