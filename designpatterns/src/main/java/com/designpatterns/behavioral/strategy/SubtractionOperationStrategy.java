package com.designpatterns.behavioral.strategy;

public class SubtractionOperationStrategy implements OperationStrategy {

  @Override
  public Integer performOperation(Integer x, Integer y) {
    return x - y;
  }
}