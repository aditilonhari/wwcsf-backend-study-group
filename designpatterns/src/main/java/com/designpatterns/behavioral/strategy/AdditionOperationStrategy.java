package com.designpatterns.behavioral.strategy;

public class AdditionOperationStrategy implements OperationStrategy {

  @Override
  public Integer performOperation(Integer x, Integer y) {
    return x + y;
  }
}