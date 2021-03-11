
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        ArrayList<Bird> birdList = new ArrayList<>();
        
        while(true) {
            System.out.print("? ");
            String inputCommand = scan.nextLine();
            
            //let's read the command
            if(inputCommand.equals("Quit")) {
                break;
            }
            
            if(inputCommand.equals("Add")) {
                    System.out.print("Name: ");
                    String nameInput = scan.nextLine();
                    System.out.print("Name in latin: ");
                    String latinNameInput = scan.nextLine();

                    //creating and adding new birds to our database
                    birdList.add(new Bird(nameInput, latinNameInput, 0));
                    
                } else if(inputCommand.equals("Observation")) {
                    System.out.print("Bird? ");
                    String nameInput = scan.nextLine();
                    
                    for(Bird bird : birdList) {
                        if(bird.getName().equals(nameInput)) {
                            System.out.println("success");
                            bird.increaseNumberOfObservations();
                        } else {
                            System.out.println("Not a bird!"); 
                        }
                    }
                } else if(inputCommand.equals("All")) {
                    for(Bird bird : birdList) {
                        System.out.println(bird.toString());
                    }
                } else if(inputCommand.equals("One")) {
                    System.out.print("Bird? ");
                    String nameInput = scan.nextLine();
                    
                    for(Bird bird : birdList) {
                        if(bird.getName().equals(nameInput)) {
                            System.out.println(bird.toString());
                        } else {
                            System.out.println("Not a bird!"); 
                        }
                    }
                }    
            }
    }

}
