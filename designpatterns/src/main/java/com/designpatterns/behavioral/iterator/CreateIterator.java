package com.designpatterns.behavioral.iterator;

import java.util.List;
import org.springframework.util.CollectionUtils;

public class CreateIterator implements OrderIterator {

  private final List<Order> orderList;
  private int index = 0;

  public CreateIterator(List<Order> orderList) {
    this.orderList = orderList;
  }

  @Override
  public boolean hasNext() {
    return this.index < this.orderList.size();
  }

  @Override
  public Order next() {
    if (this.hasNext() && this.index < this.orderList.size()) {
      final Order order = this.orderList.get(this.index++);
      System.out.println("\nOrder Id: " + order.getOrderId());
      System.out.println("Order Details: " + order.getOrderName());
      return order;
    }
    return null;
  }
}