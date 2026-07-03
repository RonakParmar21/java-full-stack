package com.ronak.revise;

public class App {
    public static void main(String[] args) {

        // setter dependency injection
        // =================================================================================================
        // -- Student student = new Student();

        // this two line is called dependency injection
        // (setter dependency injection)
        // this is manual dependency injection
        // in spring project I do not required to do this manually spring automatically done by itself.
        // -- Course course = new DSA();
        // -- student.setCourse(course);

        // -- student.study();

        // ========================================== CONSTRUCTOR DEPENDECY INJECTION ==============================================

        // constructor dependency injection
        // no required to do manually
        Student student = new Student(new DSA());
        student.study();

        // Field injection
        // NOTE :- in manual injection we need to make variable public otherwise it will not available outside the class.
        // but in spring core we don't have to make field public because spring uses reflection api to access private fields
    }
}
