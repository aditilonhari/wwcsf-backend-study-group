package com.designpatterns.behavioral.chainofresponsibility;

public class ArizonaShippingHandler implements ShippingHandler {

  private final String shippingHandlerName = "Arizona Shipping Handler";
  private ShippingHandler nextShippingHandler;

  @Override
  public void sendToNextShippingHandler(ShippingHandler nextShippingHandler) {
    this.nextShippingHandler = nextShippingHandler;
  }

  @Override
  public void getShippingStatusFromHandler(Package aPackage) {
    System.out.println(this.shippingHandlerName + " has successfully shipped a package with id="
        + aPackage.getPackageId() + " to " + this.nextShippingHandler.getShippingHandlerName());
  }

  @Override
  public String getShippingHandlerName() {
    return this.shippingHandlerName;
  }
}