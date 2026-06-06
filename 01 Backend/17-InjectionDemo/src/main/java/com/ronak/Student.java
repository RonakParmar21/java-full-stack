package com.ronak;

public class Student {

    public Course course; // I want object of course type

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student() {

    }

    public Student(Course course) {
        this.course = course;
    }

    public void study() {
        int start = course.enroll();
        if(start >= 1) {
            System.out.println("Journey Started...");
        } else {
            System.out.println("Payment Failed...");
        }
    }
}
