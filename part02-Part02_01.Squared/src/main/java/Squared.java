
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.valueOf(scanner.nextLine());
        int squaredNumber = input * input;
        
        System.out.println(squaredNumber);
    }
}
