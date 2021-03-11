
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String inputName = scanner.nextLine();
        System.out.println("What is their job?");
        String inputJob = scanner.nextLine();
        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was " + inputName + ", who was " + inputJob + ".");
        System.out.println("On the way to work, " + inputName + " reflected on life.");
        System.out.println("Perhaps " + inputName + " will not be " + inputJob + " forever.");

    }
}
