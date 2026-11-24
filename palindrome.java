import java.util.Scanner;

public class palindrome {
    public static void main(String... args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = input.next().toLowerCase();
        String check = "";

        for (int i = 0; i < word.length(); i++) {
            check = word.charAt(i) + check;
        }

        if (check.equals(word)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

    }
}
