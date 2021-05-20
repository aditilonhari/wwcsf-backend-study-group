package com.designpatterns.structural.adapter;

public class Fitbit implements AdvancedMedia {

    private static final String FITBIT = "Fitbit";

    private String healthData;
    private String userAccountDetails;

    public Fitbit() {
        this.healthData = "Resting heart rate: 62 BPM. Age = 25";
        this.userAccountDetails = "First Name = Ms. Hello Fitness. Account status = ENROLLED";
    }

    @Override
    public String getHealthDataForFitbit() {
        System.out.println("\nHealth Data for " + FITBIT + ": " + this.healthData);
        return this.healthData;
    }

    @Override
    public String getUserAccountDetailsForFitbit() {
        System.out.println("User Account Details for " + FITBIT + ": " + this.userAccountDetails);
        return this.userAccountDetails;
    }

    // Another Media Type
    @Override
    public String getHealthDataForAppleWatch() {
        return null;
    }

    @Override
    public String getUserAccountDetailsForAppleWatch() {
        return null;
    }

    // Getter and Setter
    public void setHealthData(String healthData) {
        this.healthData = healthData;
    }

    public void setUserAccountDetails(String userAccountDetails) {
        this.userAccountDetails = userAccountDetails;
    }
}