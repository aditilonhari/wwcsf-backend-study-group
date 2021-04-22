package com.designpatterns.creational.factory;

public class ShapeFactory {

  public Shape buildShape(Name name) {
    if (name == Name.CIRCLE) {
      return new Circle();
    }
    if (name == Name.TRIANGLE) {
      return new Triangle();
    }
    if (name == Name.RECTANGLE) {
      return new Rectangle();
    }
    return null;
  }
}
