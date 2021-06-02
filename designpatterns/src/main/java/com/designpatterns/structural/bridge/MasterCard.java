package com.designpatterns.structural.bridge;

public class MasterCard implements Payment {    // Interface and concrete implementation

    private String paymentType;

    @Override
    public String paymentType() {
        this.paymentType = "MASTERCARD";
        return this.paymentType;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
}