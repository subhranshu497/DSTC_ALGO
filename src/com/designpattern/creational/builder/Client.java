package com.designpattern.creational.builder;

public class Client {
    public static void main(String[] args) {
        ApartmentBuilder builder = new ApartmentBuilder();
        Apartment ap = builder.setSqm(1600)
                .setRooms(3)
                .setCity("Phoenix")
                .setArea("Tempe")
                .setKitchen(true)
                .build();
        ap.display();
    }
}
