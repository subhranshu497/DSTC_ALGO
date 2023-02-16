package com.algo.animalShelter;

import java.util.LinkedList;

public class AnimalShelter {
    LinkedList<Dog> dogs = new LinkedList<>();
    LinkedList<Cat> cats = new LinkedList<>();
    int order =0;

    public void enqueue(Animal a){
        a.setOrder(order);
        order++;
        if(a instanceof Cat)
            cats.addLast((Cat)a);
        if(a instanceof Dog)
            dogs.addLast((Dog)a);
    }
    public Animal dequeueAny(){
        if(dogs.size()== 0 && cats.size() == 0)
            return null;
        if(dogs.size() == 0)
            return cats.poll();
        if (cats.size() == 0)
            return dogs.poll();
        Dog dog = dogs.peek();
        Cat cat = cats.peek();

        if(cat.isOlderThan(dog))
            return  cats.poll();
        else
            return dogs.poll();
    }
}
