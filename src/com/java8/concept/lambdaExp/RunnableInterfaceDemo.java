package com.java8.concept.lambdaExp;

import java.sql.SQLOutput;

public class RunnableInterfaceDemo {
    public static void main(String[] args) {
        runnableWithoutambda();
        runnableWithLambda();
    }

    private static void runnableWithLambda() {
        //Runnable run = ()-> System.out.println("Running with lambda Expression");
        new Thread(()-> System.out.println("Running with lambda Expression")).start();
    }

    private static void runnableWithoutambda() {
        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running without lambda");
            }
        };
        new Thread(run).start();
    }
}
