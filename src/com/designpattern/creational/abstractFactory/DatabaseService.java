package com.designpattern.creational.abstractFactory;

public class DatabaseService implements Service{
    @Override
    public String runService() {
        return "Database Service is Running";
    }
}
