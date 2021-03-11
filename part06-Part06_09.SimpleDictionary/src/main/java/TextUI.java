
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miguel
 */
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }
    
    public void start() {
        String input;
        
        while(true) {
            System.out.print("Command: ");
            input = scanner.nextLine();
            
            if(input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            
            if(input.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.println("Translation: ");
                String translation = scanner.nextLine();
                
                this.simpleDictionary.add(word, translation);
            } else if(input.equals("search")) {
                System.out.print("To be translated: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                
                if(simpleDictionary.translate(word) != null) {
                    System.out.print(" " + simpleDictionary.translate(word) + "\n");
                } else {
                    System.out.println("Word " + word + " was not found");
                }
            } else {
                System.out.println("Unknown command");
            }
            
        }
    }
    
}
