package com.algo.animalShelter;

abstract public class Animal {
    private int order;
    protected String name;

    public  Animal(String n){
        name = n;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

//    Compare the order of animal to return the older item
    public boolean isOlderThan(Animal a){
        return this.order < a.getOrder();
    }
}
