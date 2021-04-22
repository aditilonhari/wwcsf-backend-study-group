package com.designpatterns.creational.factory;

public class Rectangle implements Shape {

  @Override
  public String getName() {
    return "Rectangle";
  }

  @Override
  public String getAreaFormula() {
    return "length * breadth";
  }
}
