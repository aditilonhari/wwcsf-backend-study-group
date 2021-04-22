package com.designpatterns.creational.builder;

public class Employee {

  private String firstName;
  private String lastName;
  private String street1;
  private String street2;
  private String city;
  private String state;
  private String zipCode;
  private String department;
  private String manager;

  public Employee(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public Employee(String firstName, String lastName, String department, String manager) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.department = department;
    this.manager = manager;
  }

  public Employee(String firstName, String lastName, String street1, String street2,
      String city, String state, String zipCode) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.street1 = street1;
    this.street2 = street2;
    this.city = city;
    this.state = state;
    this.zipCode = zipCode;
  }

  public Employee(String firstName, String lastName, String street1, String street2,
      String city, String state, String zipCode, String department, String manager) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.street1 = street1;
    this.street2 = street2;
    this.city = city;
    this.state = state;
    this.zipCode = zipCode;
    this.department = department;
    this.manager = manager;
  }

  public String getEmployeeDetails() {
    return this.toString();
  }

  @Override
  public String toString() {
    return "Employee: "
        + this.firstName
        + ", " + this.lastName
        + ", " + this.street1
        + ", " + this.street2
        + ", " + this.city
        + ", " + this.state
        + ", " + this.zipCode
        + ", " + this.department
        + ", " + this.manager;
  }
}
