
import java.util.Scanner;

public class AverageOfNumbers {

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
            } else {
                sumOfNumbers = sumOfNumbers + input;
                count = count + 1;
                average = (double)sumOfNumbers / count;
             
            }
        }
        System.out.println("Average of the numbers: " + average);
    }
}
