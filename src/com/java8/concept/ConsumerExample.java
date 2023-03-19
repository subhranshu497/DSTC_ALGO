package com.java8.concept;

import com.example.data.Student;
import com.example.data.StudentDatabase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static Consumer<Student> c1 = (student) -> System.out.println(student.toString());
    public static Consumer<Student> c2 = (student) -> System.out.print(student.getName()+" ");
    public static Consumer<Student> c3 = (student) -> System.out.print(student.getActivities()+"  ");
    public static Consumer<Student> c4 = (student) -> System.out.print(student.getGradeLevel()+" ");
    public static Consumer<Student> c5 = (student) -> System.out.println(student.getGpa());

    public static void printName(){
        List<Student> studentList = StudentDatabase.getAllStudents();
        studentList.forEach(c1);
    }

    /**
     * Print name and Activities
     * @param args
     */
    public static void printNameAndActivities(){
        System.out.println("=======================from printNameAndActivities=======================");
        List<Student> studentList = StudentDatabase.getAllStudents();
        studentList.forEach(c2.andThen(c3)); // Consumer chaining
    }

    /**
     * filtering student grade greater than and equal to 3
     * @param args
     */
    public static void printNameAndActivitiesFilter(){
        System.out.println("=======================from printNameAndActivitiesFilter=======================");
        List<Student> studentList = StudentDatabase.getAllStudents();
        studentList.forEach((student -> {
            if(student.getGradeLevel() >=3 && student.getGpa() >=3.9){
                c2.andThen(c3).andThen(c4).andThen(c5).accept(student);
            }
        }));
    }

    public static void main(String[] args) {
        //printName();
        //printNameAndActivities();
        printNameAndActivitiesFilter();
    }
}
