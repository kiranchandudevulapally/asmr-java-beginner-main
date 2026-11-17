import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();

        System.out.println(reversedApproach(string) ? "Palindrome" : "NOT Palindrome");
        System.out.println(isPalindrome(string) ? "Palindrome" : "NOT Palindrome");
;

        scanner.close();
    }

    // Check for Palindrome -> By reversing a string
    static boolean reversedApproach(String string) {
        return string.equals(reversed(string));
    }

    static String reversed(String string) {
        String res = "";
        for (int i = 0; i < string.length(); i++) {
            res = string.charAt(i) + res;
        }
        return res;
    }

    // Iterative Approach
    static boolean isPalindrome(String string) {
        int start = 0;
        int end = string.length() - 1;
        while(start < end) {
            if (string.charAt(start) != string.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
