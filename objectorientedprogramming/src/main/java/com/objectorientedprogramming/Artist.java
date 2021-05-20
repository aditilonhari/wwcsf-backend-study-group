package com.objectorientedprogramming;

public class Artist extends Person {

    private String industry;
    private String locationCity;

    public Artist(String name, int age, String industry, String locationCity) {
        super(name, age);
        this.industry = industry;
        this.locationCity = locationCity;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getLocationCity() {
        return locationCity;
    }

    public void setLocationCity(String locationCity) {
        this.locationCity = locationCity;
    }

    public String getSalary() {
        return "$52000 per year";
    }
}