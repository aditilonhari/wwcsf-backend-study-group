package com.designpatterns.behavioral.strategy;

/**
 * @author prachi.shah
 */
public class StrategyInitializer {

  public static void main(String[] args) {
    Integer x = 400;
    Integer y = 200;

    AdditionOperationStrategy additionOperationStrategy = new AdditionOperationStrategy();
    System.out.println("Addition of " + x + " and " + y + " = " + additionOperationStrategy
        .performOperation(x, y));

    SubtractionOperationStrategy subtractionOperationStrategy = new SubtractionOperationStrategy();
    System.out.println("Subtraction of " + x + " and " + y + " = " + subtractionOperationStrategy
        .performOperation(x, y));

    MultiplicationOperationStrategy multiplicationOperationStrategy = new MultiplicationOperationStrategy();
    System.out
        .println("Multiplication of " + x + " and " + y + " = " + multiplicationOperationStrategy
            .performOperation(x, y));

    DivisionOperationStrategy divisionOperationStrategy = new DivisionOperationStrategy();
    System.out.println("Division of " + x + " and " + y + " = " + divisionOperationStrategy
        .performOperation(x, y));

    // Exception
    y = 0;
    try {
      multiplicationOperationStrategy.performOperation(x, y);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    try {
      divisionOperationStrategy.performOperation(x, y);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}