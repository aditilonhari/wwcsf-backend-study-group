package com.designpatterns.behavioral.chainofresponsibility;

/**
 * @author prachi.shah
 */
public class ChainOfResponsibilityInitializer {

  public static void main(String[] args) {
    // Source -> Arizona -> California -> New York -> Destination
    Package aPackage = new Package("1234567890");
    NewYorkShippingHandler newYorkShippingHandler = new NewYorkShippingHandler();
    CaliforniaShippingHandler californiaShippingHandler = new CaliforniaShippingHandler();
    ArizonaShippingHandler arizonaShippingHandler = new ArizonaShippingHandler();

    arizonaShippingHandler.sendToNextShippingHandler(californiaShippingHandler);
    californiaShippingHandler.sendToNextShippingHandler(newYorkShippingHandler);

    arizonaShippingHandler.getShippingStatusFromHandler(aPackage);
    californiaShippingHandler.getShippingStatusFromHandler(aPackage);
    newYorkShippingHandler.getShippingStatusFromHandler(aPackage);
  }
}