package com.designpatterns.behavioral.chainofresponsibility;

public class NewYorkShippingHandler implements ShippingHandler {

  private final String shippingHandlerName = "New York Shipping Handler";
  private ShippingHandler nextShippingHandler;

  @Override
  public void sendToNextShippingHandler(ShippingHandler nextShippingHandler) {
    this.nextShippingHandler = nextShippingHandler;
  }

  @Override
  public void getShippingStatusFromHandler(Package aPackage) {
    System.out.println(this.shippingHandlerName + " has successfully delivered a package with id="
        + aPackage.getPackageId() + " to the destination address");
  }

  @Override
  public String getShippingHandlerName() {
    return this.shippingHandlerName;
  }
}