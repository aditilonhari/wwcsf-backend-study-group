package com.designpatterns.behavioral.chainofresponsibility;

public interface ShippingHandler {

  public void sendToNextShippingHandler(ShippingHandler shippingHandler);

  public void getShippingStatusFromHandler(Package aPackage);

  public String getShippingHandlerName();

}