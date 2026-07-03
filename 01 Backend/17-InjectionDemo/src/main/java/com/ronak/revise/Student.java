package com.ronak.revise;

public class Student {
    private Course course;

    // setter dependency injection use
    // this dependency injection is manually injection
    public void setCourse(Course course) {
        this.course = course;
    }

    // construction dependecy injection use
    // this DI is not manually injection
    public Student(Course course) {
        this.course = course;
    }

    // create because other wise error will be generate
    // because java thinks you already create a parameterized constructor (you already create own constructor)
    // then why java will create default constructor for this (Student student = new Student())
    public Student() {
    }

    public void study() {
        int studyStart = course.enroll();
        if(studyStart >= 1)
            System.out.println("Journey started...");
        else
            System.out.println("Payment failed...");


    }
}
