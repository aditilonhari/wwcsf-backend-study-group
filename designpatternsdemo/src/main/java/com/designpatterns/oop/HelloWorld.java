package com.designpatterns.oop;

public class HelloWorld {

  String hello = "Hello World";

  public static void main(String[] args) {
    HelloWorld helloThere = new HelloWorld();
    System.out.println(helloThere.sayHello());
  }

  private String sayHello() {
    return this.hello;
  }
}