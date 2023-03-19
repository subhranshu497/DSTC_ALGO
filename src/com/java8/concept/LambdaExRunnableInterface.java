package com.java8.concept;

public class LambdaExRunnableInterface {
    public static void main(String[] args) {
        /*
        Implementation of Runnable interface Before java 8
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Impl of Runnable interface in old fashioned way");
            }
        };
        new Thread(runnable).start();

        /*
        Impl of Runnable interface using lambda Exp of Java 8
         */
        Runnable runnable1 = () ->{
            System.out.println("Impl of runnable interface using lambda exp of java 8");
        };
        new Thread(runnable1).start();

        /**
         * More concise coding with lambda
         */
        new Thread(()-> System.out.println("Concise programming with Lambda")).start();
    }
}
