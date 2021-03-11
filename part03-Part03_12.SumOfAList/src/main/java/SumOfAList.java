
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        int value = 0;
        
        for (int elementOfList : list) {
            value += elementOfList;
        }
        
        System.out.println("Sum: " + value);
        // toteuta listan lukujen summan laskeminen tänne
    }
}
