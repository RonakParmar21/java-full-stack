package Inheritance;

public class TestInheritance {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.sound();
        animal.fly();

        Dog dog = new Dog();
        dog.eat();
        dog.sound();
        dog.fly();

        // This is valid BECAUSE PARENT CAN HOLD OBJECT OF CHILD CLASS.
        Animal a = new Dog();
        a.sound();

        // This is not valid because child can not hold object of parent class
        // Dog d = new Animal();
        // d.sound();
    }
}
