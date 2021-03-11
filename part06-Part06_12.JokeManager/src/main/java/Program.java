
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> jokes = new ArrayList<>();
        JokeManager manager = new JokeManager();

UserInterface ui = new UserInterface(manager, scanner);
ui.start();
        
    }
}
