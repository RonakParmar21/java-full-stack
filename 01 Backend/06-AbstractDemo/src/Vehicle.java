public abstract class Vehicle {
    String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    abstract void start();

    public void m1()
    {
        System.out.println("hello m1" + brand);
    }

}
