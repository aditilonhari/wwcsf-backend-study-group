package com.designpatterns.behavioral.chainofresponsibility;

import java.time.LocalDate;

public class CaliforniaShippingHandler implements ShippingHandler {

  private final String shippingHandlerName = "California Shipping Handler";
  private ShippingHandler nextShippingHandler;

  @Override
  public void sendToNextShippingHandler(ShippingHandler nextShippingHandler) {
    this.nextShippingHandler = nextShippingHandler;
  }

  @Override
  public void getShippingStatusFromHandler(Package aPackage) {
    System.out.println(this.shippingHandlerName + " had a delivery exception on " + LocalDate.now()
        + " but we did a second attempt and successfully shipped a package with id="
        + aPackage.getPackageId() + " to " + this.nextShippingHandler.getShippingHandlerName());
  }

  @Override
  public String getShippingHandlerName() {
    return this.shippingHandlerName;
  }
}