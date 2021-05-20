package com.designpatterns.structural.decorator;

import java.util.List;

public interface Apartment {

    public void decorate(List<String> decorationItemsList, String name);
}