
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
public class JokeManager {
    private ArrayList<String> jokes;
    
    public JokeManager() {
        this.jokes = new ArrayList<>();
    }
    
    public void addJoke(String joke) {
        jokes.add(joke);
    }
    
    public String drawJoke() {
        String output ="";
        if(jokes.isEmpty()) {
            output = output + "Jokes are in short supply.";
        } else {
            output = "Drawing jokes: " + "\n";
            int max = jokes.size();
            int min = 0;
            output = jokes.get((int) Math.floor(Math.random() * (max - min) + min));
        }
        
        return output;
    }
    
    public void printJokes() {
        System.out.println("Printing jokes: ");
        for(String joke : jokes) {
            System.out.println(joke);
        }
    }
}
