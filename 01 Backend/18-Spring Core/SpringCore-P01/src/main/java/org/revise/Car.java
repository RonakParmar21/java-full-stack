package org.revise;

public class Car {
    private Engine carEngine;

    public Engine getCarEngine() {
        return carEngine;
    }

    public void setCarEngine(Engine carEngine) {
        this.carEngine = carEngine;
    }

    public void drive() {
        int start = carEngine.start();
        if(start >= 1) System.out.println("Let's drive...");
        else System.out.println("Engine not started yet...");
    }
}
