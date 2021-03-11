
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumOfNumbers = 0;
        int count = 0;
        double average = 0.0;
        
        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == 0) {
                break;
            } else if(input > 0) {
                sumOfNumbers = sumOfNumbers + input;
                count = count + 1;
                average = (double)sumOfNumbers / count;
            }
        }
        
        if (count == 0) {
            System.out.println("Cannot calculate average.");
        } else {
            System.out.println(average);
        }
    }
}
