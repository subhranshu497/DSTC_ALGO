package com.java8.concept;

import com.example.data.Student;
import com.example.data.StudentDatabase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p1 = (s) -> s.getGradeLevel() >=3;
    static Predicate<Student> p2 = (s) -> s.getGpa() > 3.9;

    public static void predicateGradeLevel(){
        System.out.println("=======predicateGradeLevel===================");
        List<Student> studentList = StudentDatabase.getAllStudents();
        studentList.forEach((student ->{
            if(p1.test(student)){
                System.out.println(student);
            }
        }));
    }
    public static void predicateGpa(){
        System.out.println("========predicateGpa=========");
        List<Student> studentList = StudentDatabase.getAllStudents();
        studentList.forEach((student -> {
            if(p2.test(student)){
                System.out.println(student.getName() + "  "+student.getGpa());
            }
        }));
    }
    public static void main(String[] args) {
        predicateGradeLevel();
        predicateGpa();
    }
}
