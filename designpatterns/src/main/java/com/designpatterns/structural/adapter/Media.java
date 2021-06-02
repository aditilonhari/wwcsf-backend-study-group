package com.designpatterns.structural.adapter;

public interface Media {

    // Functionality shared across media type
    String getHealthData(MediaType mediaType);

    String getUserAccountDetails(MediaType mediaType);
}