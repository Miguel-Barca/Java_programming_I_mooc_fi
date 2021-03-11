/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miguel
 */
public class Bird {
    private String name;
    private String latinName;
    private int numberOfObservations;

    public Bird(String name, String latinName, int numberOfObservations) {
        this.name = name;
        this.latinName = latinName;
        this.numberOfObservations = numberOfObservations;
    }

    public void increaseNumberOfObservations() {
        this.numberOfObservations++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatinName() {
        return latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public int getNumberOfObservations() {
        return numberOfObservations;
    }

    public void setNumberOfObservations(int numberOfObservations) {
        this.numberOfObservations = numberOfObservations;
    }
    
    
    @Override
    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.numberOfObservations + " observations"; //To change body of generated methods, choose Tools | Templates.
    }
   
}
