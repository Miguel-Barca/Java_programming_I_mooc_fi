
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "";
        int sum = 0;
        int counter = 0;
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            String[] words = input.split(",");
            
            if(words[0].length()> name.length()) {
                name = words[0];
            }
            
            sum += Integer.valueOf(words[1]);
            counter++;
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + (1.0 * sum / counter));
    }
}
