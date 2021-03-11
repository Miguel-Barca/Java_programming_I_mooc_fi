
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miguel
 */
public class TodoList {
    private ArrayList<String> list;

    public TodoList() {
        this.list = new ArrayList<>();
    }
    
    
    public void add(String task) {
        this.list.add(task);
    }
    
    public void print() {
        if(!list.isEmpty()) {
           for(String eachExercise : list) {
                System.out.println(list.indexOf(eachExercise) + 1 + ": " + eachExercise);
            } 
        }
        
    }
            
    public void remove(int number) {
        int index = 0;
        
        if(!list.isEmpty()) {
            list.remove(number - 1);
        }
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }
    
    
}
