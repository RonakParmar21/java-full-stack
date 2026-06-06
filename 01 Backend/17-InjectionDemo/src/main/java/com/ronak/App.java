package com.ronak;

public class App {
    public static void main(String[] args) {
        Student student = new Student();
        student.course = new DSA();
        student.study();

        // setter injection
        /*
            Course course = new DSA();
            student.setCourse(course);
         */

        // Constructor Injection
        /*
        Student student = new Student(new JavaFullStack());
         */

        // Field Injection


//        student.study();
    }
}
