package com.designpatterns.structural.bridge;

import java.util.HashMap;
import java.util.Map;

/**
 * @author prachi.shah
 */
public class BridgeInitializer {

    public static void main(String[] args) {
        Map<Double, String> groceryOrderItems = createGroceryItemList();
        Order groceryOrderWithVisa = new GroceryOrder(new VisaCard());
        groceryOrderWithVisa.addItems(groceryOrderItems);
        Order groceryOrderWithMasterCard = new GroceryOrder(new MasterCard());
        groceryOrderWithMasterCard.addItems(groceryOrderItems);

        Map<Double, String> restaurantOrderItems = createRestaurantItemList();
        Order restaurantOrderWithVisa = new RestaurantOrder(new VisaCard());
        restaurantOrderWithVisa.addItems(restaurantOrderItems);
        Order restaurantOrderWithMasterCard = new RestaurantOrder(new MasterCard());
        restaurantOrderWithMasterCard.addItems(restaurantOrderItems);

        // Grocery order with Visa payment
        groceryOrderWithVisa.calculateOrderTotal();
        System.out.println("Payment type:" + groceryOrderWithVisa.payment.paymentType());

        // Grocery order with Mastercard payment
        groceryOrderWithMasterCard.calculateOrderTotal();
        System.out.println("Payment type:" + groceryOrderWithMasterCard.payment.paymentType());

        // Restaurant order with Visa payment
        restaurantOrderWithVisa.calculateOrderTotal();
        System.out.println("Payment type:" + restaurantOrderWithVisa.payment.paymentType());

        // Restaurant order with Mastercard payment
        restaurantOrderWithMasterCard.calculateOrderTotal();
        System.out.println("Payment type:" + restaurantOrderWithMasterCard.payment.paymentType());
    }

    private static Map<Double, String> createGroceryItemList() {
        HashMap<Double, String> itemList = new HashMap<>();
        itemList.put(4.99, "Milk");
        itemList.put(3.99, "Cheddar Cheese");
        itemList.put(1.99, "Avocado 1ct.");
        itemList.put(0.99, "Mint leaves");
        return itemList;
    }

    private static Map<Double, String> createRestaurantItemList() {
        HashMap<Double, String> itemList = new HashMap<>();
        itemList.put(12.99, "Big Mac");
        itemList.put(11.99, "Chicken McNuggets");
        itemList.put(10.99, "Sausage Burrito");
        itemList.put(9.99, "Fries");
        itemList.put(8.99, "Iced Coffee");
        return itemList;
    }
}