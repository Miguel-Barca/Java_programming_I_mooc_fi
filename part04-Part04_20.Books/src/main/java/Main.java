import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Title: ");
            String name = scanner.nextLine();
            
            if(name.isEmpty()) {
                break;
            }
            
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            
            System.out.print("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(name, pages, year));
        }
        
        System.out.print("What information will be printed? "); 
        
        String whatToPrint = scanner.nextLine();
        
        for(Book book : books) {
            if(whatToPrint.equals("everything")){
                System.out.println(book);
            } else if(whatToPrint.equals("name")){
                System.out.println(book.getTitle());
            }
        }
        
    }
}
