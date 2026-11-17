import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        String reversed = reverseString(text);
        System.out.println("Reversed: " + reversed);
        String reversed2 = reverseString2(text);
        System.out.println("Reversed2: " + reversed2);

        scanner.close();
    }

    static String reverseString(String text) {
        String res = "";
        char ch;
        for (int i = 0; i < text.length(); i++) {
            ch = text.charAt(i);
            res = ch + res;
        }
        return res;
    }

    static String reverseString2(String text) {
        char[] res = text.toCharArray();
        int start = 0;
        char temp;
        int last = text.length() - 1;
        while (start < last) {
            temp = res[start];
            res[start] = res[last];
            res[last] = temp;
            start++;
            last--;
        }
        return String.copyValueOf(res);
    }
}
