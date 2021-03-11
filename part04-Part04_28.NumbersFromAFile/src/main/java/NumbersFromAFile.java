
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        ArrayList<Integer> numbers = new ArrayList<>();
        
        try (Scanner fileReader = new Scanner(Paths.get(file))){
            while (fileReader.hasNextLine()) {
                int row = Integer.valueOf(fileReader.nextLine());
                
                if(row >= lowerBound && row <= upperBound ) {
                    numbers.add(row);
                } 
            }
        } catch (IOException ex) {
            Logger.getLogger(NumbersFromAFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Numbers: " + numbers.size());
    }

}
