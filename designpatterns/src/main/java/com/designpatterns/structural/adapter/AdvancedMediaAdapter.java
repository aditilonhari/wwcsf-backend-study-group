package com.designpatterns.structural.adapter;

public class AdvancedMediaAdapter implements Media {

    @Override
    public String getHealthData(MediaType mediaType) {
        return null;
    }

    @Override
    public String getUserAccountDetails(MediaType mediaType) {
        return null;
    }
}