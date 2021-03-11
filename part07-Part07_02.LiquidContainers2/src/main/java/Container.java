/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miguel
 */
public class Container {
    private int amountOfLiquid;
    private int max;
    
    public Container() {
        this.amountOfLiquid = 0;
        this.max = 100;
    }
    
    public int contains() {
        return this.amountOfLiquid;
    }
    
    public void add(int amount) {
        if(amount > 0) {
            if(amount + this.amountOfLiquid <= this.max) {
                this.amountOfLiquid += amount;
            } else{
                this.amountOfLiquid = this.max;
            } 
        }
    }
        
    public void remove(int amount) {
        if(amount > 0) {
                    if(amount <= this.amountOfLiquid) {
                        this.amountOfLiquid -= amount;
                    } else {
                        this.amountOfLiquid = 0;
                    }
                }
    }
    
    
    
    public String toString() {
        return this.amountOfLiquid + "/" + this.max;
    }

    public int getAmountOfLiquid() {
        return amountOfLiquid;
    }

    public int getMax() {
        return max;
    }

    public void setAmountOfLiquid(int amountOfLiquid) {
        this.amountOfLiquid = amountOfLiquid;
    }
    
    
}
