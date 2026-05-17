package MethodHiding;

class Parent {
    static void display() {
        System.out.println("Parent's Display Method.");
    }
}

class Child extends Parent {
    static void display() {
        System.out.println("Child's Display Method.");
    }
}

public class MethodHiding {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.display();

        Child c = new Child();
        c.display();

        Parent parent = new Child();
        parent.display();
    }
}
