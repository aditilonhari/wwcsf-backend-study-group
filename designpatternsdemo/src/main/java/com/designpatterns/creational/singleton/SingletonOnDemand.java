package com.designpatterns.creational.singleton;

// Class initialized when needed
public class SingletonOnDemand {

  private static SingletonOnDemand INSTANCE = null;

  private SingletonOnDemand() { // private constructor
    System.out.println("Singleton is created and initialized now");
  }

  public static SingletonOnDemand getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new SingletonOnDemand();
    }
    return INSTANCE;
  }
}