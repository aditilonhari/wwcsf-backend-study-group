package com.designpatterns.structural.adapter;

public interface AdvancedMedia {

    // Functionality shared across media type
    String getHealthDataForAppleWatch();

    String getHealthDataForFitbit();

    String getUserAccountDetailsForAppleWatch();

    String getUserAccountDetailsForFitbit();
}