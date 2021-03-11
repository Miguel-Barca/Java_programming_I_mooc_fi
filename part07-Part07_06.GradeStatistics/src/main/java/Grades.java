
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
public class Grades {
    private ArrayList<Integer> list;
    private ArrayList<Integer> passingGradesList;
    private int numberFailed = 0;
    private int grade1 = 0;
    private int grade2 = 0;
    private int grade3 = 0;
    private int grade4 = 0;
    private int grade5 = 0;

    public Grades() {
        this.list = new ArrayList<>();
        this.passingGradesList = new ArrayList<>();
    }
        
    public void add(int number) {
        if(number <= 100 && number >= 0) {
            this.list.add(number);
            if(number >= 50) {
                this.passingGradesList.add(number);
            }
            
            if(number < 50) {
                numberFailed++;
            } else if( number >= 50 && number < 60) {
                this.grade1++;
            } else if( number >= 60 && number < 70) {
                this.grade2++;
            } else if( number >= 70 && number < 80) {
                this.grade3++;
            } else if( number >= 80 && number < 90) {
                this.grade4++;
            } else {
                this.grade5++;
            }
        } 
    }
    
    public double average() {
        int size = this.list.size();
        int sum = 0;
        
        for(int element : list) {
            sum += element;
        }
        
        return 1.0 * sum / size;
    }

    public double passingGradeAverage() {
        int size = this.passingGradesList.size();
        int sum = 0;
        
        for(int element : this.passingGradesList) {
            sum += element;
        }
        
        return 1.0 * sum / size;
    }

    public ArrayList<Integer> getPassingGradesList() {
        return passingGradesList;
    }
    
    public double passPercentage() {
        return 100.0 * this.passingGradesList.size() / this.list.size();
    }
    
    public void gradeDistribution() {
        System.out.println("Grade distribution:");
        System.out.println("5: " + printStars(this.grade5));
        System.out.println("4: " + printStars(this.grade4));
        System.out.println("3: " + printStars(this.grade3));
        System.out.println("2: " + printStars(this.grade2));
        System.out.println("1: " + printStars(this.grade1));
        System.out.println("0: " + printStars(this.numberFailed));
    }
    
     public String printStars(int number) {
        String finalString = "";
        for (int count = 0; count < number; count++) {   // while count less than gradeLevel, print a star
            finalString += "*";   // print star
        }
        return finalString;
    }
}
