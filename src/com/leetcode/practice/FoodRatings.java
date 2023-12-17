package com.leetcode.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FoodRatings {
    private String[] foods;
    private String[] cuisines;
    private int[] ratings;
    private Map<String, Integer> foodRatingMap;
    private Map<String, String> foodCuisineMap;
    private Map<String, PriorityQueue<Food>> cuisneFoodMapQueue;
    public FoodRatings(String[] foods, String[] cuisines, int[] ratings){
        foodRatingMap = new HashMap<>();
        foodCuisineMap = new HashMap<>();
        cuisneFoodMapQueue = new HashMap<>();
        for(int i=0;i<foods.length;i++){
            foodRatingMap.put(foods[i], ratings[i]);
            foodCuisineMap.put(foods[i], cuisines[i]);
            cuisneFoodMapQueue.computeIfAbsent(cuisines[i], k -> new PriorityQueue<>()).add(new Food(ratings[i], foods[i]));
        }
        this.foods = foods;
        this.cuisines = cuisines;
        this.ratings = ratings;
    }
    public void changeRating(String food, int newRating){
        foodRatingMap.put(food, newRating);
        //insert the new food rating and food name into cuisine priority queue
        String cuisineName = foodCuisineMap.get(food);
        cuisneFoodMapQueue.get(cuisineName).add(new Food(newRating, food));
    }
    public String highestRated(String cuisine){
        Food highestScore = cuisneFoodMapQueue.get(cuisine).peek();
        while (foodRatingMap.get(highestScore.foodName) != highestScore.foodRating) {
            cuisneFoodMapQueue.get(cuisine).poll();
            highestScore = cuisneFoodMapQueue.get(cuisine).peek();
        }
        return highestScore.foodName;
    }
}
class Food implements Comparable<Food> {
    public int foodRating;
    public String foodName;
    public Food(int foodRating, String foodName){
        this.foodName = foodName;
        this.foodRating = foodRating;
    }
    //compare food
    @Override
    public int compareTo(Food foodProvided){
        if(foodRating == foodProvided.foodRating){
            return foodName.compareTo(foodProvided.foodName);
        }
        return -1 * Integer.compare(foodRating, foodProvided.foodRating);
    }
}

class Solution1{
    public static void main(String[] args) {
        FoodRatings foodRatings = new FoodRatings(new String[]{"kimchi", "miso", "sushi", "moussaka", "ramen", "bulgogi"},
                                    new String[]{"korean", "japanese", "japanese", "greek", "japanese", "korean"},
                                        new int[]{9, 12, 8, 15, 14, 7});
        System.out.println(foodRatings.highestRated("japanese"));
        foodRatings.changeRating("sushi", 16);
        System.out.println(foodRatings.highestRated("japanese"));
        foodRatings.changeRating("ramen", 16);
        System.out.println(foodRatings.highestRated("japanese"));

    }
}
