package com.designpatterns.behavioral.strategy;

public class DivisionOperationStrategy implements OperationStrategy {

  @Override
  public Integer performOperation(Integer x, Integer y) {
    if (x != 0 && y != 0) {
      return x / y;
    } else {
      throw new NumberFormatException("Exception: Cannot divide by 0");
    }
  }
}