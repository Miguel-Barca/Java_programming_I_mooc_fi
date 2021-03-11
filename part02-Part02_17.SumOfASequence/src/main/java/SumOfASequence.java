
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last number?");
        int input = Integer.valueOf(scanner.nextLine());
        int calc = 0;
        
        for (int i = input; i > 0; i--) {
            calc = calc + input;
            input--;
            
        }
        
        System.out.println("The sum is " + calc);
    }
}
