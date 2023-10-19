package com.java8.concept;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class FuctionalProgrammingDemo {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,3);
        // print cubes of odd number
        //nums.stream().filter(i->i%2!=0).map(i->i*i*i).forEach(System.out::println);

        List<String> courses = List.of("Spring","Spring boot", "AWS");
        //courses.stream().map(s->s+ "  "+s.length()).forEach(System.out::println);
        //find courses starts with A

        Predicate<? super String> predicate = course ->course.startsWith("x");
        //String optional = String.valueOf(courses.stream().filter(predicate).findFirst());
        Optional<String> optional = courses.stream().filter(predicate).findFirst();
        System.out.println(optional);
    }
}
