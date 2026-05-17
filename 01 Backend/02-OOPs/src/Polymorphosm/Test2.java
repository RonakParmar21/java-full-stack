package Polymorphosm;

class Shape {
    void draw() {
        System.out.println("Drawing Shape.");
    }
}

class  Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle.");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Rectangle.");
    }
}

public class Test2 {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.draw();

        Circle c = new Circle();
        c.draw();

        Rectangle r = new Rectangle();
        r.draw();
    }
}
