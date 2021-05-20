package com.designpatterns.structural.adapter;

public class MediaAdapter implements Media {

    public AdvancedMedia advancedMedia = null;

    public MediaAdapter(MediaType mediaType) {
        if (mediaType == MediaType.APPLE_WATCH) {
            advancedMedia = new AppleWatch();
        } else if (mediaType == MediaType.FITBIT) {
            advancedMedia = new Fitbit();
        }
    }

    @Override
    public String getHealthData(MediaType mediaType) {
        if (mediaType == MediaType.APPLE_WATCH) {
            return advancedMedia.getHealthDataForAppleWatch();
        } else if (mediaType == MediaType.FITBIT) {
            advancedMedia.getHealthDataForFitbit();
        }
        return null;
    }

    @Override
    public String getUserAccountDetails(MediaType mediaType) {
        if (mediaType == MediaType.APPLE_WATCH) {
            return advancedMedia.getUserAccountDetailsForAppleWatch();
        } else if (mediaType == MediaType.FITBIT) {
            advancedMedia.getUserAccountDetailsForFitbit();
        }
        return null;
    }
}
