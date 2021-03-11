
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How old are you?");
        String input = scan.nextLine();
        
        int age = Integer.parseInt(input);
        
        if (age >= 0 && age <= 120) {
            System.out.println("OK");
        }
        
        if (age < 0 || age > 120) {
            System.out.println("Impossible!");
        }
    }
}
