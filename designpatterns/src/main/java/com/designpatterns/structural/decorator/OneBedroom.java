package com.designpatterns.structural.decorator;

import java.util.List;

public class OneBedroom extends ApartmentDecorator {

    public List<String> decorationItemsList;

    public OneBedroom(Apartment apartment) {
        super(apartment);
    }

    @Override
    public void decorate(List<String> decorationItemsList, String name) {
        super.decorate(decorationItemsList, name);
        System.out.println(name + " apartment is decorated with " + String.join(", ", decorationItemsList));
    }
}