package com.designpatterns.structural.bridge;

import java.util.Map;
import org.springframework.util.CollectionUtils;

public class GroceryOrder extends Order {

    public Map<Double, String> itemList;

    public GroceryOrder(Payment payment) {  // reference the interface
        super(payment);
    }

    @Override
    public void addItems(Map<Double, String> itemList) {    // Operations
        this.itemList = itemList;
    }

    @Override
    public Double calculateOrderTotal() {
        Double totalPrice = 0.0;
        if (!CollectionUtils.isEmpty(this.itemList)) {
            for (Double price : this.itemList.keySet()) {
                totalPrice += price;
            }
        }
        System.out.println("\nGrocery order total price= $" + totalPrice);
        return totalPrice;
    }
}