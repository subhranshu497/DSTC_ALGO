package com.java8.concept.functionalInterfaceDemo;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    static List<Student> studentList = StudentDataBase.getAllStudents();
    static Consumer<Student> c1 = (student) -> System.out.println(student);
    static Consumer<Student> c2 = (student)-> System.out.print(student.getName());
    static Consumer<Student> c3 = (student)-> System.out.println(student.getActivities());
    public static void printStudentData(){

        studentList.forEach(c1);
    }
    //print student name and the activities
    public static void printNameAndActivities(){

        studentList.forEach(c2.andThen(c3));
    }

    public static void printStudentBasedonCondition(){
        studentList.forEach((student)->{
            if(student.getGradeLevel() >=3){
                c2.andThen(c3).accept(student);
            }
        });
    }

    public static void main(String[] args) {
        Consumer<String> consumer = (s)-> System.out.println(s.toUpperCase());
        consumer.accept("lori mohapatra");
        printStudentData();
        System.out.println("================Student Name and Activities==========");
        printNameAndActivities();
        System.out.println("================Student Name and Activities based on condition==========");
        printStudentBasedonCondition();
    }
}
