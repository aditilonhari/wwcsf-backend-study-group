package com.designpatterns.structural.decorator;

import java.util.Arrays;
import java.util.List;

/**
 * @author prachi.shah
 */
public class DecoratorInitializer {

    public static void main(String[] args) {
        List<String> studioDecorationItemsList = Arrays.asList("Television", "Desk");
        Apartment studio = new Studio(new SimpleApartment());
        studio.decorate(studioDecorationItemsList, "Studio");

        List<String> oneBedroomDecorationItemsList = Arrays.asList("Bookshelf", "Paintings");
        Apartment oneBedroom = new OneBedroom(new SimpleApartment());
        oneBedroom.decorate(oneBedroomDecorationItemsList, "One Bedroom");
    }
}