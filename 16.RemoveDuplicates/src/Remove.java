import java.util.Scanner;

public class Remove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to remove its duplicates: ");
        String string = scanner.nextLine();
        String res = removeDuplicates(string);
        System.out.println("Result: " + res);
        scanner.close();
    }

    static String removeDuplicates(String string) {
        String res = "";
        for (char ch : string.toCharArray()) {
            if (!res.toLowerCase().contains(String.valueOf(ch).toLowerCase())) {
                res += ch;
            }
        }
        return res;
    }
}
