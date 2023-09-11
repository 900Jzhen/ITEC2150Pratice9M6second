package HomeWork;

import java.util.ArrayList;

public class Bakery {
       private ArrayList<Pastry> pastries;

               public Bakery() {
                   pastries = new ArrayList<>();
               }

               public void addPastry(Pastry pastry) {
                   pastries.add(pastry);
               }

               public void displayPastries() {
                   System.out.println("Pastries in the bakery:");
                   for (Pastry pastry : pastries) {
                       if (pastry instanceof Cake) {
                           System.out.println("Cake: " + pastry.getName());
                           System.out.println(" Size: " + ((Cake)pastry).getSize());
                           System.out.println(" Flavor: " + ((Cake)pastry).getFlavor());
                           System.out.println("Layer: " + ((Cake)pastry).getLayer());
                           System.out.println("price: " + pastry.getPrice());
                           System.out.println("description: " + pastry.getDescription());

                       }
                       else {
                           System.out.println("Pastry: " + pastry.getName());
                           System.out.println("price: " + pastry.getPrice());
                           System.out.println("description: " + pastry.getDescription());
                       }
                           pastry.displayIngredients();
                           System.out.println();
                       }


               }
   }
