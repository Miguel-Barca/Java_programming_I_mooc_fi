
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        Grades grades = new Grades();
        
        System.out.println("Enter point totals, -1 stops:");
        
        
        while (true) {
           int number = Integer.valueOf(scanner.nextLine());
           
           if(number == -1) {
               System.out.println("Point average (all): " + grades.average());
               
               if(grades.getPassingGradesList().size() > 0) {
                   System.out.println("Point average (passing): " + grades.passingGradeAverage());
               } else {
                   System.out.println("Point average (passing): -");
               }
               
               System.out.println("Pass percentage: " + grades.passPercentage());
               grades.gradeDistribution();
               break;
           } else {
               grades.add(number);
           }
        }
        
    }
}
