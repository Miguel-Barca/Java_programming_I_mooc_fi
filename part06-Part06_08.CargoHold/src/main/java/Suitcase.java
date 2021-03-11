
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
public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;
    
    //private int weightOfItems;
    
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        items = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        if(totalWeight() + item.getWeight() <= this.maxWeight) {
          items.add(item);
          //this.weightOfItems = this.weightOfItems + item.getWeight();
        }
       
    }

    public String toString() {
        if(items.size() == 0) {
            return "no items (" + totalWeight() + " kg)" ; 
        }
        if(items.size() == 1) {
            return items.size() + " item (" + totalWeight() + " kg)" ;
        }
        return items.size() + " items (" + totalWeight() + " kg)" ;
    }
    
    public void printItems() {
        for(Item item : this.items) {
            System.out.println(item.toString());
        }
    }

    public int totalWeight() {
        int weightOfItems = 0;
        for(Item item : this.items) {
            weightOfItems += item.getWeight();
        }
        
        return weightOfItems;
    }
    
    public Item heaviestItem() {
        if(items.isEmpty()) {
            return null;
        }
        
        Item heaviest = items.get(0);
        
        for(Item item :  items) {
            if(heaviest.getWeight() < item.getWeight()) {
                heaviest = item;
            }
        }
        
        return heaviest;
    }
}
