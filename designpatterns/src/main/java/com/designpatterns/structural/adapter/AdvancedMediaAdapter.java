package com.designpatterns.structural.adapter;

public class AdvancedMediaAdapter implements Media {

    // Connects objects of different types
    // Wraps objects to hide complexity
    // Call adapter methods per object
    @Override
    public String getHealthData(MediaType mediaType) {
        return null;
    }

    @Override
    public String getUserAccountDetails(MediaType mediaType) {
        return null;
    }
}