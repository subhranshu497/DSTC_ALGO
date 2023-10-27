package com.designpattern.creational.abstractFactory;

public class DatabaseResponse implements Response{

    @Override
    public String getResponse() {
        return "Database Service is rendered";
    }
}
