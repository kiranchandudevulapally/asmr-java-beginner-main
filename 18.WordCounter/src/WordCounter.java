import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();

        System.out.println("The result: " + countWords(string));
        System.out.println("The result: " + algo(string));

        scanner.close();
    }

    static int countWords(String string) {
        return string.split(" ").length;
    }

    // Algorithmic approach
    static int algo(String string) {
        string += "\0";
        int wordCount = 0;
        boolean inWord = false;
        int i = 0;
        char ch = string.charAt(i);
        while(ch != '\0') {
            if (ch == ' ' || ch == '\n' || ch == '\t') {
                inWord = false;
            } else if (!inWord) {
                inWord = true;
                wordCount += 1;
            }

            ch = string.charAt(i);
            i++;
        }
        return wordCount;
    }
}
