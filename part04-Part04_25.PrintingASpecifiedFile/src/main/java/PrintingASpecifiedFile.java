
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Which file should have its contents printed? ");
        String nameOfFile = scanner.nextLine();
       
        try (Scanner reader = new Scanner(Paths.get(nameOfFile))) {
            while(reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
