import javax.swing.*;

class Shape {
    void draw() {
        System.out.println("Drawing");
    }
}
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Circle Drawing");
    }
}
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Rectangle Drawing");
    }
}
public class DynamicMethodDispatcher {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw(); // Drawing
        Circle circle = new Circle();
        circle.draw(); // Circle Drawind
        Rectangle rectangle = new Rectangle();
        rectangle.draw(); // Rectangle Drawing

        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();

        Shape shape3 = new Circle();
        shape1.draw();
        shape2.draw();
    }
}
