
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        divisibleByThreeInRange(3, 6);
    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        int numberByThree = beginning;
        
        while (numberByThree <= end) {
            if(numberByThree % 3 == 0) {
                System.out.println(numberByThree);
            }
            numberByThree++;
        }
    }
}
