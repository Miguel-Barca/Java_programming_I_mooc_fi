/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miguel
 */
public class Fitbyte {
    private int age;
    private int restingHeartRate;

    public Fitbyte(int age, int RestingHeartRate) {
        this.age = age;
        this.restingHeartRate = RestingHeartRate;
    }
    
    public double targetHeartRate(double percentageOfMaximum) {
        double maximumHeartRate = 206.3 - (0.711 * age); 
        
        return (maximumHeartRate - restingHeartRate) * (percentageOfMaximum) + restingHeartRate;
    }
}
