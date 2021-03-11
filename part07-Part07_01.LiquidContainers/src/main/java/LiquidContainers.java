
import java.util.ArrayList;
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] firstContainer = new int[] {0, 100};
        int[] secondContainer = new int[] {0,100};

        while (true) {
            System.out.println("First: " + firstContainer[0] + "/" + firstContainer[1]);
            System.out.println("Second: " + secondContainer[0] + "/" + secondContainer[1]);

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if(command.equals("add")) {
                if(amount >0) {
                   if(amount + firstContainer[0] <= firstContainer[1]) {
                        firstContainer[0] += amount;
                    } else{
                        firstContainer[0] = firstContainer[1];
                    } 
                }
                
            }
            
            if(command.equals("move")) {
                if(firstContainer[0] > 0 && amount > 0) {
                    if(amount >= firstContainer[0] && amount + secondContainer[0] <= secondContainer[1]) {
                             secondContainer[0] = firstContainer[0];
                             firstContainer[0] = 0;
                     } else if(amount >= firstContainer[0] && amount  + secondContainer[0] > secondContainer[1]) {
                             secondContainer[0] = secondContainer[1];
                             firstContainer[0] = 0;
                     } else if(amount <= firstContainer[0] && amount + secondContainer[0] <= secondContainer[1]) {    
                             secondContainer[0] = amount + secondContainer[0];
                             firstContainer[0] = firstContainer[0] - amount;
                     } if(amount <= firstContainer[0] && amount + secondContainer[0] > secondContainer[1]) {    
                             secondContainer[0] = secondContainer[1];
                             firstContainer[0] = firstContainer[0] - amount;
                    }     
                }
            }
            
            if(command.equals("remove")) {
                if(amount > 0) {
                    if(amount <= secondContainer[0]) {
                        secondContainer[0] -= amount;
                    } else {
                        secondContainer[0] = 0;
                    }
                }
            }
    }
}
}
