package com.designpatterns.creational.singleton;

public class SingletonEagerInitialization {

  public static SingletonEagerInitialization INSTANCE = new SingletonEagerInitialization();

  private SingletonEagerInitialization() { // private constructor
    System.out.println("Singleton is created and initialized on class load");
  }

  public static SingletonEagerInitialization getInstance() {
    return INSTANCE;
  }
}