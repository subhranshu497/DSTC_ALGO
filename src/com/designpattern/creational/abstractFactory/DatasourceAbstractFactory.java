package com.designpattern.creational.abstractFactory;

public interface DatasourceAbstractFactory {
    Service createService();
    Response createResponse();
}
