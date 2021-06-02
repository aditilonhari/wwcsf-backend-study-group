package com.designpatterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author prachi.shah
 */
public class IteratorInitializer {

  public static void main(String[] args) {
    IteratorInitializer iteratorInitializer = new IteratorInitializer();
    List<Order> orderList = iteratorInitializer.createOrderList();
    OrderManagementImplementation orderManagementImplementation = new OrderManagementImplementation();

    System.out.println("Here is the order list:");
    OrderIterator orderIterator = orderManagementImplementation.getOrderIterator(orderList);
    while (orderIterator.hasNext()) {
      orderIterator.next();
    }
  }

  private List<Order> createOrderList() {
    List<Order> orderList = new ArrayList<>();
    orderList.add(new Order("1010", "Big Mac, Fries"));
    orderList.add(new Order("1111", "Chicken McNuggets, Iced Coffee"));
    orderList.add(new Order("1212", "Sausage Burrito, Fries"));
    orderList.add(new Order("2222", "Fries, Chicken McNuggets"));
    orderList.add(new Order("3333", "Iced Coffee, Big Mac"));
    return orderList;
  }
}