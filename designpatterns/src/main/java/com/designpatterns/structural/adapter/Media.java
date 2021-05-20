package com.designpatterns.structural.adapter;

public interface Media {

    String getHealthData(MediaType mediaType);

    String getUserAccountDetails(MediaType mediaType);
}