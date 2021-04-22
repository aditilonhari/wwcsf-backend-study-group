package com.designpatterns.creational.singleton;

// Class initialized when needed
public class SingletonOnDemand {

  private SingletonOnDemand() { // private constructor
  }

  private static class SingletonOnDemandHolder {

    private static final SingletonOnDemand INSTANCE = new SingletonOnDemand();
  }

  public static SingletonOnDemand getInstance() {
    return SingletonOnDemandHolder.INSTANCE;
  }
}