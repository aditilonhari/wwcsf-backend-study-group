package com.designpatterns.creational.singleton;

/**
 * @author prachi.shah
 */
public class SingletonInitializer {

    public static void main(String[] args) {
        SingletonEagerInitialization singletonEagerInitialization = SingletonEagerInitialization
                .getInstance();
        SingletonEagerInitialization singletonEagerInitializationInstance = SingletonEagerInitialization.INSTANCE;

        System.out.println("Singleton Eager Initialization ==> " + singletonEagerInitialization
                .toString()); // Hex value of object hashcode
        System.out.println(
                "Singleton Eager Initialization ==> " + singletonEagerInitializationInstance.toString());

        SingletonOnDemand singletonOnDemand = SingletonOnDemand.getInstance();
        System.out.println("Singleton On Demand ==> " + singletonOnDemand.toString());
    }
}