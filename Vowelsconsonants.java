import java.util.Scanner;

public class vowelsconsonants {
    public static void main(String... args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String word = input.next().toLowerCase();
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if ("aeiou".indexOf(ch) != -1) {
                vowels = vowels + 1;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants = consonants + 1;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
