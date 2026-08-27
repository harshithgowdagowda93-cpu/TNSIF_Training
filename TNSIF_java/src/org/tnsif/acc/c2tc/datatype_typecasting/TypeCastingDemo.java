package org.tnsif.acc.c2tc.datatype_typecasting;

public class TypeCastingDemo {

    public static void main(String[] args) {
        // Shopping Cart

        // Widening (small → large)
        int quantity = 3;
        double pricePerItem = 99.50;
        double totalPrice = quantity * pricePerItem;

        // Narrowing (large → small)
        double discount = 10.75;
        int roundedDiscount = (int) discount; // truncates decimal part

        double finalAmount = totalPrice - roundedDiscount;

        // Output
        System.out.println("Online Shopping Summary");
        System.out.println("Items Bought: " + quantity);
        System.out.println("Price per item: " + pricePerItem);
        System.out.println("Final Amount to pay after discount: " + finalAmount);
    }
}
