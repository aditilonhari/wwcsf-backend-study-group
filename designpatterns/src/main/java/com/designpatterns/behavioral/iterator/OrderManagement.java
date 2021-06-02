package com.designpatterns.behavioral.iterator;

import java.util.List;

public interface OrderManagement {

  public OrderIterator getOrderIterator(List<Order> orderList);

}