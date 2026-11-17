import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Write {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            FileWriter writer = new FileWriter("40.FileIO/src/text.txt");
            System.out.println("Enter a text to write: ");
            writer.write(scanner.nextLine());
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred!");
        }
    }
}
