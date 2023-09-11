package HomeWork;

public class Main {
       public static void main(String[] args) {
           Ingredient flour = new Ingredient("Flour");
           Ingredient sugar = new Ingredient("Sugar");
           Ingredient strawberry = new Ingredient("Strawberry");
           Ingredient blueberry = new Ingredient("Blueberry");

           Pastry croissant = new Pastry("Croissant",10,"A baked bread and not any top ingredient.");
           croissant.addIngredient(flour);
           croissant.addIngredient(sugar);

           Pastry muffin = new Pastry("Blueberry Muffin",20,"A  small Muffin and blueberry in top.");
           muffin.addIngredient(flour);
           muffin.addIngredient(sugar);

           Cake cake = new Cake("Birthday Cake",40,"First layer is Cake,second layer is strawberry,third layer is blueberry.","Large","Fruit",3);
           cake.addIngredient(flour);
           cake.addIngredient(sugar);
           cake.addIngredient(strawberry);
           cake.addIngredient(blueberry);

           Bakery bakery = new Bakery();
           bakery.addPastry(croissant);
           bakery.addPastry(muffin);
           bakery.addPastry(cake);

           bakery.displayPastries();
               }
   }