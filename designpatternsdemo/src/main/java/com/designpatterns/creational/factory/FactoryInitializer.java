package com.designpatterns.creational.factory;

public class FactoryInitializer {

  public static void main(String[] args) {
    ShapeFactory shapeFactory = new ShapeFactory();
    Shape circle = shapeFactory.buildShape(Name.CIRCLE);
    Shape triangle = shapeFactory.buildShape(Name.TRIANGLE);
    Shape rectangle = shapeFactory.buildShape(Name.RECTANGLE);

    System.out.println(circle.getName() + " has area: " + circle.getAreaFormula());
    System.out.println(triangle.getName() + " has area: " + triangle.getAreaFormula());
    System.out.println(rectangle.getName() + " has area: " + rectangle.getAreaFormula());
  }
}