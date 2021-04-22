package com.designpatterns.creational.singleton;

public class SingletonEagerInitialization {

  public static SingletonEagerInitialization INSTANCE = new SingletonEagerInitialization();

  private SingletonEagerInitialization() { // private constructor
  }

  public static SingletonEagerInitialization getInstance() {
    return INSTANCE;
  }
}