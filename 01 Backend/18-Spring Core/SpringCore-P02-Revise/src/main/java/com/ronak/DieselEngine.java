package com.ronak;

public class DieselEngine implements Engine {
    public DieselEngine() {
        System.out.println("Diesel engine constructor...");
    }

    @Override
    public int start() {
        return 1;
    }
}
