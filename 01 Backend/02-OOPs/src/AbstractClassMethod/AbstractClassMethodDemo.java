package AbstractClassMethod;

abstract class Vehicle {
    public abstract void engine();
}

public class AbstractClassMethodDemo extends Vehicle {
    public void engine() {
        System.out.println("Abstract Engine");
    }

    public static void main(String[] args) {
        Vehicle vehicle = new AbstractClassMethodDemo();
        vehicle.engine();
    }
}
