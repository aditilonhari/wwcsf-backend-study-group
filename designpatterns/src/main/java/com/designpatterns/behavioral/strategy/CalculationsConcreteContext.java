package com.designpatterns.behavioral.strategy;

public class CalculationsConcreteContext {

  private OperationStrategy operationStrategy;

  public CalculationsConcreteContext(OperationStrategy operationStrategy) {
    this.operationStrategy = operationStrategy;
  }

  public Integer executeOperationStrategy(Integer x, Integer y) {
    return operationStrategy.performOperation(x, y);
  }
}