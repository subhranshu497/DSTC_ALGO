package com.leetcode.practice;

import com.sun.source.doctree.SeeTree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DestinationCity {
    public static void main(String[] args) {
        List<String> city1 = new ArrayList<>();
        city1.add("London");
        city1.add("New York");
        List<String> city2 = new ArrayList<>();
        city2.add("New York");
        city2.add("Lima");
        List<String> city3 = new ArrayList<>();
        city3.add("Lima");
        city3.add("San Paulo");
        List<List<String>> paths = new ArrayList<>();
        paths.add(city1);
        paths.add(city2);
        paths.add(city3);
        System.out.println(destCity(paths));
    }

    private static String destCity(List<List<String>> paths) {
        Set<String> originCities = new HashSet<>();
        List<String> allCities = new ArrayList<>();
        for(List<String> cities: paths){
            originCities.add(cities.get(0));
        }
        for(List<String> cities:paths){
            allCities.add(cities.get(0));
            allCities.add(cities.get(1));
        }
        for(String city: allCities){
            if(!originCities.contains(city)) return city;
        }
        return "";
    }
}
