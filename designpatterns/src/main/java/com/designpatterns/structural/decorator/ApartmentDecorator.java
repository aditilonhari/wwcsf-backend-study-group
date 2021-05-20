package com.designpatterns.structural.decorator;

import java.util.List;

public abstract class ApartmentDecorator implements Apartment {

    public Apartment apartment;

    public ApartmentDecorator(Apartment apartment) {
        this.apartment = apartment;
    }

    @Override
    public void decorate(List<String> decorationItemsList, String name) {
        System.out.println("\nLet's decorate a " + name + "!");
        apartment.decorate(decorationItemsList, name);
    }
}