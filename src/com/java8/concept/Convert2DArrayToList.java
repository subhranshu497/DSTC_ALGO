package com.java8.concept;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Convert2DArrayToList {
    public static void main(String[] args) {
        String [][] array = new String[][]{{"a","b"},{"c","d"},{"e","f"}};
        List<String> result = Stream.of(array).flatMap(Stream::of)
                .filter(x->!x.equals("a"))
                .collect(Collectors.toList());
       result.forEach(System.out::print);

    }
}
