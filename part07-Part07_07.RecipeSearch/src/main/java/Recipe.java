
import java.util.ArrayList;
import java.util.List;

public class Recipe {
    //inputs the variables
    private String name;
    private int time;
    private List<String> ingr;
    
    //constructor for class "Recipe"
    public Recipe(String name, int time, List<String> ingr) {
        this.name = name;
        this.time = time;
        this.ingr = ingr;
    }
    
    //returns the name of the recipe
    public String getName() {
        return this.name;
    }
    
    //returns the cooking time of the recipe
    public int getTime() {
        return this.time;
    }
    
    //returns the ingredients of the recipe
    public List<String> getIngredients() {
        return this.ingr;
    }
    
    //sets the name of the recipe
    public void setName(String name) {
        this.name = name;
    }
    
    //sets the cooking time of the recipe
    public void setTime(int time) {
        this.time = time;
    }
    
    //sets the ingredients of the recipe
    public void setIngredients(ArrayList<String> ingr) {
        this.ingr = ingr;
    }
    
    //returns the name and cooking time of the recipe in the given form
    @Override
    public String toString() {
        return this.name + ", cooking time: " + this.time;
    }
}