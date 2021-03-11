
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Container firstContainer = new Container();
        Container secondContainer = new Container();
        
        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.println("First: " + firstContainer.getAmountOfLiquid() + "/" + firstContainer.getMax());
            System.out.println("Second: " + secondContainer.getAmountOfLiquid() + "/" + secondContainer.getMax());

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if(command.equals("add")) {
                firstContainer.add(amount);
                
            }
            
            if(command.equals("move")) {
                if(firstContainer.getAmountOfLiquid() > 0 && amount > 0) {
                    if(amount >= firstContainer.getAmountOfLiquid() && amount + secondContainer.getAmountOfLiquid() <= secondContainer.getMax()) {
                             secondContainer.setAmountOfLiquid(secondContainer.getAmountOfLiquid() + firstContainer.getAmountOfLiquid());
                             firstContainer.setAmountOfLiquid(0);
                     } else if(amount >= firstContainer.getAmountOfLiquid() && amount  + secondContainer.getAmountOfLiquid() > secondContainer.getMax()) {
                             secondContainer.setAmountOfLiquid(secondContainer.getMax());
                             firstContainer.setAmountOfLiquid(0);
                     } else if(amount <= firstContainer.getAmountOfLiquid() && amount + secondContainer.getAmountOfLiquid() <= secondContainer.getMax()) {    
                             secondContainer.setAmountOfLiquid(secondContainer.getAmountOfLiquid() + amount);
                             firstContainer.setAmountOfLiquid(firstContainer.getAmountOfLiquid() - amount);
                     } if(amount <= firstContainer.getAmountOfLiquid() && amount + secondContainer.getAmountOfLiquid() > secondContainer.getMax()) {    
                             secondContainer.setAmountOfLiquid(secondContainer.getMax());
                             firstContainer.setAmountOfLiquid(firstContainer.getAmountOfLiquid() - amount);
                    }     
                }
            }
            
            if(command.equals("remove")) {
               secondContainer.remove(amount);
            }

        }
    }

}
