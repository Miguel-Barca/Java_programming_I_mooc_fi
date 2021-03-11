
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
public class Package {
    private ArrayList<Gift> collection;

    public Package() {
        this.collection = new ArrayList<>();
    }
    
    public void addGift(Gift gift) {
        collection.add(gift);
    }
    
    public int totalWeight() {
        int sum = 0;
        for(Gift gift : collection) {
            sum += gift.getWeight();
        }
        return sum;
    }
}
