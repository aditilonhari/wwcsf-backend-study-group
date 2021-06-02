package com.designpatterns.behavioral.iterator;

public class Order {

  private String orderId;
  private String orderName;

  public Order(String orderId, String orderName) {
    this.orderId = orderId;
    this.orderName = orderName;
  }

  public String getOrderId() {
    return orderId;
  }

  public String getOrderName() {
    return orderName;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public void setOrderName(String orderName) {
    this.orderName = orderName;
  }
}