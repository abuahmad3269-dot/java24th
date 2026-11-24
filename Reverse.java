import java.util.Scanner;

public class Reverse {
    public static void main(String... args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = input.next();
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            result = word.charAt(i) + result;
        }

        System.out.println(result);

    }
}
