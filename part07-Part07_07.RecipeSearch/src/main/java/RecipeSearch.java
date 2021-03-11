import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        //inputs variables - scanner and two lists 
        Scanner scanner = new Scanner(System.in);
        //1. list - for reading lines from the file
        ArrayList<String> list = new ArrayList<>();
        //2. list - list to store recipes
        ArrayList<Recipe> recipes = new ArrayList<>();

        System.out.print("File to read:");
        String filename = scanner.nextLine();

        //add the datas from file to arraylist until it reaches empty line
        try (Scanner readNames = new Scanner(Paths.get(filename))) {
            while (readNames.hasNextLine()) {
                String line = readNames.nextLine();
                list.add(line);
            }
            //catch an exception if error is found
        } catch (Exception e) {
            System.out.println("An error is found.");
        }

        //creates recipes from lines from read file
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).isEmpty()) {
                continue;
            }
            //gets the name of the recipe
            String name = list.get(i++);
            //gets the cooking time of the recipe
            int time = Integer.valueOf(list.get(i++));
            //creates list for ingredients and adds lines (ingredients) to it
            ArrayList<String> ingredients = new ArrayList<>();
            while (i < list.size() && !list.get(i).isEmpty()) {
                ingredients.add(list.get(i));
                i++;
            }
            //creates new Recipe object from the read lines
            Recipe newRecipe = new Recipe(name, time, ingredients);
            //adds newly created Recipe object to the list of recipes
            recipes.add(newRecipe);
        }

        //prints out the possible commands
        while (true) {
            System.out.println("Commands:");
            System.out.println("list - lists the recipes");
            System.out.println("stop - stops the program");
            System.out.println("find name - searches recipes by name");
            System.out.println("find cooking time - searches recipes by cooking time");
            System.out.println("find ingredient - searches recipes by ingredient");

            //asks user to enter the command
            System.out.println("Enter command: ");
            String command = scanner.nextLine();

            //if command is equal to "stop" the program stops performing
            if (command.equals("stop")) {
                break;
            }

            //prints out all the recipes in the file if command is "list"
            if (command.equals("list")) {
                for (Recipe r : recipes) {
                    System.out.println("Recipes");
                    System.out.println(r);
                }
            }

            //if command is "find name", searches recipes by name
            if (command.equals("find name")) {
                //user enters the name to search for
                System.out.print("Searched word: ");
                String search = scanner.nextLine();
                System.out.println("");
                //prints out all recipes who contain the given name
                System.out.println("Recipes:");
                for (Recipe r : recipes) {
                    if (r.getName().contains(search)) {
                        System.out.println(r);
                    }
                }
                System.out.println("");
            }

            //if command is "find cooking time", searches recipes by cooking time
            if (command.equals("find cooking time")) {
                //user enters the maximum cooking time
                System.out.println("Max cooking time:");
                int time = Integer.valueOf(scanner.nextLine());
                //prints out all the recipes with lower cooking time than maximum cooking time
                System.out.println("Recipes:");
                for (Recipe r : recipes) {
                    if (r.getTime() <= time) {
                        System.out.println(r);
                    }
                }
                System.out.println("");
            }

            //if command is "find ingredient", searches recipes by ingredient
            if (command.equals("find ingredient")) {
                //user enters the ingredient to search for
                System.out.println("Searched word:");
                String ingredient = scanner.nextLine();
                //prints out all recipes that contains searched ingredient
                System.out.println("Recipes:");
                for (Recipe r : recipes) {
                    if (r.getIngredients().contains(ingredient)) {
                        System.out.println(r);
                    }
                }
                System.out.println("");
            }
        }
    }
}