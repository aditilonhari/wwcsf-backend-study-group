package com.designpatterns.creational.factory;

public class Circle implements Shape {

  @Override
  public String getName() {
    return "Circle";
  }

  @Override
  public String getAreaFormula() {
    return "pi * r^2";  // Pi multiplied by radius square
  }
}
