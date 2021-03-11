
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        
        
        Statistics statistics = new Statistics();
        Statistics evenNumbers = new Statistics();
        Statistics oddNumbers = new Statistics();
        
        System.out.println("Enter numbers:");
        int input = 0;
        Boolean helper = true;
        
        while(helper) {
            input = Integer.valueOf(scanner.nextLine());
            
            if(input == -1) {
                helper = false;
                break;
            } else {
                statistics.addNumber(input);
                if(input % 2 == 0) {
                    evenNumbers.addNumber(input);
                } else if(input % 2 != 0) {
                    oddNumbers.addNumber(input);
                }
            }
        }
        
        //statistics.addNumber(3);
        ////statistics.addNumber(5);
        //statistics.addNumber(1);
        //statistics.addNumber(2);
        //System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + evenNumbers.sum());
        System.out.println("Sum of odd numbers: " + oddNumbers.sum());
    }
}
