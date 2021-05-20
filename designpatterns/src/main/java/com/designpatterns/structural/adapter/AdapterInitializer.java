package com.designpatterns.structural.adapter;

/**
 * @author prachi.shah
 */
public class AdapterInitializer {

    public static void main(String[] args) {
        HealthMetrics healthMetrics = new HealthMetrics();

        // Apple Watch
        healthMetrics.getHealthData(MediaType.APPLE_WATCH);
        healthMetrics.getUserAccountDetails(MediaType.APPLE_WATCH);

        // Fitbit
        healthMetrics.getHealthData(MediaType.FITBIT);
        healthMetrics.getUserAccountDetails(MediaType.FITBIT);
    }
}