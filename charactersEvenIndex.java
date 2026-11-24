import java.util.Scanner;

public class CharacterEvenIndex {
    public static void main(String... args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String word = input.next();

        for (int i = 0; i < word.length(); i++) {
            if (i % 2 == 0) {
                System.out.println(word.charAt(i));
            }
        }

    }
}
