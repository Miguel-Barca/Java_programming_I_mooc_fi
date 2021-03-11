
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
public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }
    
    public void start() {
        while(true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();
            
            if(input.equals("stop")){
                break;
            }
            
            processCommand(input);
        }
    }
    
    public void processCommand(String command) {
        if (command.equals("add")) {
            add(); 
        } else if(command.equals("list")) {
                printAll();
        } else if(command.equals("remove")) {
            remove();
        } else {
            System.out.println("Unknown command");
        }
    }
    
    public void add() {
        System.out.print("To add: "); 
        String input = scanner.nextLine();
        todoList.add(input);
    }
    
    public void remove() {
        System.out.print("Which one is removed? ");
        String input = scanner.nextLine();
        int indexToRemove = Integer.valueOf(input);
        this.todoList.getList().remove(indexToRemove - 1);
    }
    
    public void printAll() {
        for(String element : this.todoList.getList()) {
            System.out.println(this.todoList.getList().indexOf(element) + 1 + ": " + element);
        }
    }
}
