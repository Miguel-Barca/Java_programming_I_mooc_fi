/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miguel
 */
public class Counter {
    private int number = 0;
    
    public Counter(int startValue) {
        number = startValue;
    }
    
    public Counter() {
        this(0);
    }
    
    public int value() {
        return number;
    }
    
    public void increase() {
        number++;
    }
    
    public void decrease() {
        number--;
    }
    
    public void increase(int increaseBy) {
        if(increaseBy < 0) {
            number = number;
        } else {
            number += increaseBy;
        }
    }
    
    public void decrease(int decreaseBy) {
        if(decreaseBy < 0) {
            number = number;
        } else {
            number -= decreaseBy;
        }
    }
}
