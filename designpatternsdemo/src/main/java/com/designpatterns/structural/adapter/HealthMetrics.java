package com.designpatterns.structural.adapter;

public class HealthMetrics implements Media {

  public MediaAdapter mediaAdapter;

  @Override
  public String getHealthData(MediaType mediaType) {
    if (mediaType == MediaType.APPLE_WATCH || mediaType == MediaType.FITBIT) {
      mediaAdapter = new MediaAdapter(mediaType);
      return mediaAdapter.getHealthData(mediaType);
    }
    return null;
  }

  @Override
  public String getUserAccountDetails(MediaType mediaType) {
    if (mediaType == MediaType.APPLE_WATCH || mediaType == MediaType.FITBIT) {
      return mediaAdapter.getUserAccountDetails(mediaType);
    }
    return null;
  }
}
