import java.util.Scanner;

public class RunningAverageSum {
    public static void main(String... args) {

        Scanner input = new Scanner(System.in);

        double total = 0;
        int count = 0;

        while (true) {
            System.out.print("Enter number (-1 to stop): ");
            int num = input.nextInt();

            if (num == -1) break;

            total = total + num;
            count = count + 1;

            System.out.println("Average = " + (total / count));
        }

    }
}
