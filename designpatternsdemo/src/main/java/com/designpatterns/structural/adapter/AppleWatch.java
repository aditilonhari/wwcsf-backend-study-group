package com.designpatterns.structural.adapter;

public class AppleWatch implements AdvancedMedia {

  private static final String APPLE_WATCH = "Apple Watch";

  private String healthData;
  private String userAccountDetails;

  public AppleWatch() {
    this.healthData = "Body Temperature = 98.6 degrees F. Oxygen saturation level = 96%";
    this.userAccountDetails = "Username = helloFitness2021. Account creation date = 01-01-2021";
  }

  @Override
  public String getHealthDataForAppleWatch() {
    System.out.println("Health Data for " + APPLE_WATCH + ": " + this.healthData);
    return this.healthData;
  }

  @Override
  public String getUserAccountDetailsForAppleWatch() {
    System.out.println("User Account Details for " + APPLE_WATCH + ": " + this.userAccountDetails);
    return this.userAccountDetails;
  }

  // Another Media Type
  @Override
  public String getHealthDataForFitbit() {
    return null;
  }

  @Override
  public String getUserAccountDetailsForFitbit() {
    return null;
  }

  // Getter and Setters
  public String getHealthData() {
    return healthData;
  }

  public void setHealthData(String healthData) {
    this.healthData = healthData;
  }

  public String getUserAccountDetails() {
    return userAccountDetails;
  }

  public void setUserAccountDetails(String userAccountDetails) {
    this.userAccountDetails = userAccountDetails;
  }
}