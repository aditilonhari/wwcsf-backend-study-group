package com.designpatterns.oop;

public class Doctor extends Person {

  private String department;
  private String hospitalLocationCity;

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getHospitalLocationCity() {
    return hospitalLocationCity;
  }

  public void setHospitalLocationCity(String hospitalLocationCity) {
    this.hospitalLocationCity = hospitalLocationCity;
  }

  public Doctor(String name, int age, String department, String hospitalLocationCity) {
    super(name, age);
    this.department = department;
    this.hospitalLocationCity = hospitalLocationCity;
  }

  public String getSalary() {
    return "$92000 per year";
  }
}