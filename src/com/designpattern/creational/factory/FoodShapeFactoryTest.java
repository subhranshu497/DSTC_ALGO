package com.designpattern.creational.factory;

public class FoodShapeFactoryTest {

    public static void main(String[] args) throws Exception {
        //create object to invoke factory method
        FoodFactory factory = new FoodFactory();
        Shape pizza = factory.getFood("round");
        Shape burrito = factory.getFood("cylinder");
        if("round".equals(pizza.getShape())) System.out.println(pizza.getShape());
        if("cylinde".equals(burrito.getShape())) System.out.println(burrito.getShape());
        //else System.out.println("Invalid shape");
    }
}
