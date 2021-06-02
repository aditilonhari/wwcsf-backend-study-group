package com.designpatterns.behavioral.iterator;

import java.util.List;

public class OrderManagementImplementation implements OrderManagement {

  @Override
  public OrderIterator getOrderIterator(List<Order> orderList) {
    return new CreateIterator(orderList);
  }
}