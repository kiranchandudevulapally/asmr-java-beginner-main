import java.util.Scanner;

public class StrLen {
    public static void main(String[] args) {
        // Different methods to find length of a string;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();
        int length1 = builtIn(string);
        System.out.println("Length 1: " + length1);

        int length2 = algo(string);
        System.out.println("Length 2: " + length2);

        int length3 = algo2(string);
        System.out.println("Length 3: " + length3);

        scanner.close();
    }

    static int builtIn(String string) {
        return string.length();
    }

    static int algo(String string) {
        int count = 0;
        for (char ch : string.toCharArray()) {
            count++;
        }
        return count;
    }
    static int algo2(String string) {
        string = string + "\0";
        int count = 0;
        while (string.charAt(count) != '\0') {
            count++;
        }
        return count;
    }
}
