
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
       public String toString() {

        String printOutput = "The collection " + this.name;

        if (this.elements.isEmpty()) {
            return printOutput + " is empty.";
        }

        String howMany = "";

        for (String element: elements) {
            if(elements.size() > 1) {
                howMany = howMany + " has " + elements.size() + " elements:";
                break;
            }
            howMany = howMany + " has " + elements.size() + " element:";
        }

        String which = "";
        
        for(String element : elements) {
            if(elements.size() > 0) {
                which = which + "\n" + element;
            }
        }
        
        return printOutput + howMany + which;
    }
}
