package org.tnsif.acc.c2tc.oops;

public class FoodItem {
    String name;
    double price;
    String category;

    void displayDetails() {
        System.out.println("Food Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Category: " + category);
        System.out.println("---");
        }

    public static void main(String[] args) {
        FoodItem fooditem1 = new FoodItem();

        fooditem1.name = "Burger";
        fooditem1.price = 299.99;
        fooditem1.category = "Fast Food";

        fooditem1.displayDetails();
        
        FoodItem fooditem2 = new FoodItem();

        fooditem2.name = "Pizza";
        fooditem2.price = 299.99;
        fooditem2.category = "Fast Food";
        
        fooditem2.displayDetails();
    }
}
