public class Test {
    public static void main(String[] args) {
        Engine engine = EngineFactory.getEngine("Petrol");

        Car car = new Car(engine);

        car.drive();
    }
}
