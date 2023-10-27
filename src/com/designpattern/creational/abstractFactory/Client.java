package com.designpattern.creational.abstractFactory;

public class Client {
    public Service service;
    public Response response;

    public Client(DatasourceAbstractFactory factory){
        this.service = factory.createService();
        this.response = factory.createResponse();
    }
    public void communicate(){
        if(service !=null && response !=null){
            System.out.println(service.runService());
            System.out.println(response.getResponse());
        }
    }
}
