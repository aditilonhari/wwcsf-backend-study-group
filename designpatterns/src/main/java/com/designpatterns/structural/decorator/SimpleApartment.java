package com.designpatterns.structural.decorator;

import java.util.List;

public class SimpleApartment implements Apartment {

    @Override
    public void decorate(List<String> decorationItemsList, String name) {
        System.out.println(name + " apartment has simple furniture setup with required utilities.");
    }
}
