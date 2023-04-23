package com.java8.concept.mapVsflatMap;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlapMap {

    public static void main(String[] args) {

        /**
         * To get all the Employees
         */
        List<Customer> customers = EkartDataBase.getAll();

        /**
         * To get all the email addresses using map()
         */
        List<String> emails =  customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
        System.out.println(emails);

        /**
         * To get all the phone number from the customer
         */
        List<String> phoneNo = customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println(phoneNo);
    }
}
