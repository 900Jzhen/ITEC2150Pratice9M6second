package HomeWork;

import java.util.ArrayList;

public class Pastry {
       private String name;
       private double price;
       private String description;
       private ArrayList<Ingredient> ingredients;

               public Pastry(String name,double price,String description) {
                   this.name = name;
                   ingredients = new ArrayList<>();
                   this.price = price;
                   this.description = description;
               }

               public void addIngredient(Ingredient ingredient) {
                   ingredients.add(ingredient);
               }

               public void displayIngredients() {
                   System.out.println("Ingredients for " + name + ":");
                   for (Ingredient ingredient : ingredients) {
                           System.out.println(ingredient.getName());
                       }
               }

               public String getName() {
                   return name;
               }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
