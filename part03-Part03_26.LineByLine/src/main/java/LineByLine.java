
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Boolean helper = true;
        
        while (helper) {
            
            String input = scanner.nextLine();
            String[] pieces = input.split(" ");
            
            if (input.equals("")) {
                break;
            } else {
                for (int i = 0; i < pieces.length; i++) {
                    
                        System.out.println(pieces[i]);
                    
                }
            }
        }    
    }
}
