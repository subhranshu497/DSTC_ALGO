package com.java8.concept;

import com.example.data.Student;
import com.example.data.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiconsumerExample {
    public static void printNameAndActivities(){
        BiConsumer<String, List<String>> bc1 = (name, activities)-> System.out.println(name +" : "+ activities);
        List<Student> studentList = StudentDatabase.getAllStudents();
        studentList.forEach((student -> bc1.accept(student.getName(), student.getActivities())));
    }
    public static void main(String[] args) {

        BiConsumer<String, String> bc2 = (s1, s2) -> System.out.println(s1+" : "+s2);
        bc2.accept("AWS", "GCP");

        printNameAndActivities();
    }
}
