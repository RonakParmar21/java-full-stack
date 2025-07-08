package TypeCasting;

class Parent {
    void show() {
        System.out.println("This is parent class method");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("This is child class method");
    }
}

public class UpCastingDownCastingDemo {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.show();

        parent = (Parent) new Child(); // upcasting
        parent.show();

        Child child = (Child) parent; // downcasting
        child.show();
    }
}
