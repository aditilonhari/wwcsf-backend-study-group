package com.designpatterns.structural.decorator;

import java.util.List;
import java.util.stream.Collectors;

public class Studio extends ApartmentDecorator {

    public List<String> decorationItemsList;

    public Studio(Apartment apartment) {
        super(apartment);
    }

    @Override
    public void decorate(List<String> decorationItemsList, String name) {
        super.decorate(decorationItemsList, name);
        System.out.println(name + " apartment is decorated with " + String.join(", ", decorationItemsList));
    }
}