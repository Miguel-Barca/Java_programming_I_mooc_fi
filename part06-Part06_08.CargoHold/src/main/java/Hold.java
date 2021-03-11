
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
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        int presentWeight = 0;
        
        for(Suitcase element : this.suitcases) {
            presentWeight += element.totalWeight();
        }
        
        if(presentWeight + suitcase.totalWeight() <= this.maxWeight) {
            suitcases.add(suitcase);
        }
    }
    
    public String toString() {
        int presentWeight = 0;
        
        for(Suitcase element : this.suitcases) {
            presentWeight += element.totalWeight();
        }
        
        if(suitcases.size() == 0) {
            return "no suitcases (" + presentWeight + " kg)" ; 
        }
        if(suitcases.size() == 1) {
            return suitcases.size() + " suitcase (" + presentWeight + " kg)" ;
        }
        return suitcases.size() + " suitcases (" + presentWeight + " kg)" ;
    }
    
    public void printItems() {
        for(Suitcase element : suitcases) {
            element.printItems();
        }
    }
}
