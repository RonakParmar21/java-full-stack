import java.util.concurrent.CopyOnWriteArraySet;

public class Car {

    // this all called field/property/attributes
    // this all are instance variables which used in local area of method
    String color;
    String brand;
    int speed; // this is instance variable

    public static void main(String[] args) {
        Car car1 = new Car();
        // we need to set speed value
        car1.speed = 100;
        car1.brand = "Mahindra XUV 700";
        car1.run();
    }

    // behaviour (methods) || actions
    public void run() {
        System.out.println("Car is running..." + speed + ", My faviourite brand is " + brand);
    }
}
