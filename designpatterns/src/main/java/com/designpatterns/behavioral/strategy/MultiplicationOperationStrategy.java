package com.designpatterns.behavioral.strategy;

public class MultiplicationOperationStrategy implements OperationStrategy {

  @Override
  public Integer performOperation(Integer x, Integer y) {
    if (x != 0 && y != 0) {
      return x * y;
    } else {
      throw new NumberFormatException("Exception: Cannot multiply by 0");
    }
  }
}