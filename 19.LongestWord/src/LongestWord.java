import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String string = scanner.nextLine();
        String longest = longestString(string);
        System.out.println("The longest word is: " + longest);

        scanner.close();
    }

    static String longestString(String string) {
        String longest = "";
        for (String word : string.split(" ")) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        System.out.println(longest.length());
        return longest;
    }
}
