package Inheritance;

class Species {
    void fly() {
        System.out.println("fly..");
    }
}

public class Animal extends Species {
    void eat() {
        System.out.println("Animal is eating...");
    }

    void sound() {
        System.out.println("Making sound");
    }

    @Override
    void fly() {
        System.out.println("Not supported..");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog is barking...");
    }
}

