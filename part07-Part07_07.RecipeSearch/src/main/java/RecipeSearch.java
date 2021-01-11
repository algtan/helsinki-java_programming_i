
// import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create an ArrayList of recipes
        ArrayList<Recipe> recipes = new ArrayList<>();
        
        // Ask the user for file
        System.out.print("File to read: ");
        String file = scanner.nextLine();
        System.out.println("");
        
        // we create a scanner for reading the file
        // Store data from the file
        // we create a scanner for reading the file
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                // Store name of recipe
                String name = fileScanner.nextLine();

                // Store cooking time of recipe
                int cookTime = Integer.valueOf(fileScanner.nextLine());

                // Create ArrayList of ingredients for recipe
                ArrayList<String> ingredients = new ArrayList<>();

                // we read the file until all lines have been read
                while (fileScanner.hasNextLine()) {
                    // we read one line
                    String row = fileScanner.nextLine();

                    if (row.isEmpty()) {
                        break;
                    }

                    // add to ingredients ArrayList
                    ingredients.add(row);
                }

                // Create recipe object
                Recipe recipe = new Recipe(name, cookTime, ingredients);
                // Add recipe to recipes list
                recipes.add(recipe);
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
        
        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe recipe: recipes) {
                    System.out.println(recipe);
                }
            } else if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String searched = scanner.nextLine();
                
                System.out.println("");
                System.out.println("Recipes:");
                // Go through each recipe in recipes list
                for (Recipe recipe: recipes) {
                    if (recipe.getName().contains(searched)) {
                        System.out.println(recipe);
                    }
                }
            } else if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxCookTime = Integer.valueOf(scanner.nextLine());
                
                System.out.println("");
                System.out.println("Recipes:");
                // Go through each recipe in recipes list
                for (Recipe recipe: recipes) {
                    if (recipe.getCookTime() <= maxCookTime) {
                        System.out.println(recipe);
                    }
                }
            } else if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredientSearch = scanner.nextLine();
                System.out.println("");
                
                // Go through each recipe in recipes list
                for (Recipe recipe: recipes) {
                    if (recipe.getIngredients().contains(ingredientSearch)) {
                        for (Object ingredient: recipe.getIngredients()) {
                            if (ingredient.equals(ingredientSearch)) {
                                System.out.println(recipe);
                            }
                        }
                    }
                }
            }
            
            System.out.println("");
        }

    }

}
