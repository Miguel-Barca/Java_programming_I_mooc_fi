
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String user1Name = "alex";
        String user2Name = "emma";
        
        String password1 = "sunshine";
        String password2 = "haskell";
        
        System.out.println("Enter user name: ");
        String nameInput = scanner.nextLine();
        
        System.out.println("Enter password: ");
        String passwordInput = scanner.nextLine();
        
        if ((nameInput.equals(user1Name) && passwordInput.equals(password1)) ||(nameInput.equals(user2Name) && passwordInput.equals(password2))) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
