
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value = 0;
        
        while(true) {
            String input = scanner.nextLine();
            
            if(input.equals("end")){
                break;
            }
            
            value = Integer.valueOf(input);
            System.out.println(value * value * value);
        }
        
        
    }
}
