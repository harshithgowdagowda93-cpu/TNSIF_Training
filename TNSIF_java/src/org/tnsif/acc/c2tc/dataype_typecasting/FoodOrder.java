package org.tnsif.acc.c2tc.dataype_typecasting;

public class FoodOrder {

    public static void main(String[] args) {
        
        int orderId = 101;
        double price = 299.99;
        boolean isDelivered = false;
        char rating = 'A';
        float deliveryDistance = 5.3f;
        long deliveryBoyPhone = 9835365252L;
        byte deliveryTime = 45;  
        short restaurantId = 12;
        
        String customerName = "Anjali";   // corrected spelling
        String[] foodItems = {"Burger", "Fries", "Coke"};

        System.out.println("Order Summary");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Order Id: " + orderId);
        System.out.println("Restaurant Id: " + restaurantId);
        System.out.println("Delivery Boy Contact: " + deliveryBoyPhone);
        System.out.println("Food Items:");
        for (String item : foodItems) {
            System.out.println(" - " + item);
        }
        
        System.out.println("Total Price: ₹" + price);
        System.out.println("Delivery Distance: " + deliveryDistance + " km");
        System.out.println("Expected Time: " + deliveryTime + " minutes");
        System.out.println("Delivery Status: " + (isDelivered ? "Delivered" : "Pending"));
        System.out.println("Rating: " + rating);
    }
}
