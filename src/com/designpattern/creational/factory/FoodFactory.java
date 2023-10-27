package com.designpattern.creational.factory;

public class FoodFactory {
    /**
     * factory method for object creation based on user input
     */
    public Shape getFood(String type){
        if(type == null) return null;
    switch(type){
        case "round": return new Pizza();
        case "cylinder": return new Burrito();
        default: throw new IllegalArgumentException("Invalid shape type");
        }
    }
}
