package com.designpatterns.structural.adapter;

public class AdapterInitializer {

  public static void main(String[] args) {
    HealthMetrics healthMetrics = new HealthMetrics();

    // Apple Watch
    System.out.println("======== " + MediaType.APPLE_WATCH + " ========");
    healthMetrics.getHealthData(MediaType.APPLE_WATCH);
    healthMetrics.getUserAccountDetails(MediaType.APPLE_WATCH);

    // Fitbit
    System.out.println("======== " + MediaType.FITBIT + " ========");
    healthMetrics.getHealthData(MediaType.FITBIT);
    healthMetrics.getUserAccountDetails(MediaType.FITBIT);
  }
}
