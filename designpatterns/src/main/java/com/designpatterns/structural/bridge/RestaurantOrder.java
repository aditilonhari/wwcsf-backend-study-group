package com.designpatterns.structural.bridge;

import java.util.Map;
import org.springframework.util.CollectionUtils;

public class RestaurantOrder extends Order {

    public Map<Double, String> itemList;

    public RestaurantOrder(Payment payment) {
        super(payment);
    }

    @Override
    public void addItems(Map<Double, String> itemList) {
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
        System.out.println("\nRestaurant order total price= $" + totalPrice);
        return totalPrice;
    }
}