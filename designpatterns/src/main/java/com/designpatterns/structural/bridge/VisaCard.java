package com.designpatterns.structural.bridge;

public class VisaCard implements Payment {

    private String paymentType;

    @Override
    public String paymentType() {
        this.paymentType = "VISA";
        return this.paymentType;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
}