import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first word: ");
        String string1 = scanner.nextLine();
        System.out.print("Enter the second word: ");
        String string2 = scanner.nextLine();

        char[] arr1 = string1.toCharArray();
        char[] arr2 = string2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.printf("Words %s and %s ARE anagrams", string1, string2);
        } else {
            System.out.printf("Words %s and %s are NOT anagrams", string1, string2);
        }

        scanner.close();
    }
}
