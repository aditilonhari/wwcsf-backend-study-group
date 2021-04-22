package com.oop;

public class Chef extends Person {

  private String restaurantName;
  private String restaurantLocationCity;

  public String getRestaurantName() {
    return restaurantName;
  }

  public void setRestaurantName(String restaurantName) {
    this.restaurantName = restaurantName;
  }

  public String getRestaurantLocationCity() {
    return restaurantLocationCity;
  }

  public void setRestaurantLocationCity(String restaurantLocationCity) {
    this.restaurantLocationCity = restaurantLocationCity;
  }

  public Chef(String name, int age, String restaurantName, String restaurantLocationCity) {
    super(name, age);
    this.restaurantName = restaurantName;
    this.restaurantLocationCity = restaurantLocationCity;
  }

  public String getSalary() {
    return "$72000 per year";
  }
}
