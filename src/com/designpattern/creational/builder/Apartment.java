package com.designpattern.creational.builder;

public class Apartment {
    private int sqm;
    private int rooms;
    private String city;
    private String area;
    private boolean kitchen;

    public Apartment(int sqm, int rooms, String city, String area, boolean kitchen) {
        this.sqm = sqm;
        this.rooms = rooms;
        this.city = city;
        this.area = area;
        this.kitchen = kitchen;
    }
    public void display(){
        System.out.println();
        if(sqm !=-1) System.out.println("sqm "+sqm);
        if(rooms !=-1) System.out.println("Rooms "+rooms);
        if(city !="") System.out.println("City "+city);
        if(area !="") System.out.println("Area "+area);
        if(kitchen) System.out.println("Apartment has a kitchen");
        System.out.println();
    }

    public int getSqm() {
        return sqm;
    }

    public int getRooms() {
        return rooms;
    }

    public String getCity() {
        return city;
    }

    public String getArea() {
        return area;
    }

    public boolean isKitchen() {
        return kitchen;
    }
}
