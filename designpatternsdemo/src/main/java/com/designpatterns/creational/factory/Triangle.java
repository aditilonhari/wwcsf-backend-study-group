package com.designpatterns.creational.factory;

public class Triangle implements Shape {

  @Override
  public String getName() {
    return "Right-angled Triangle";
  }

  @Override
  public String getAreaFormula() {
    return "1/2 * (Base * Height)";
  }
}
