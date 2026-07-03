package com.ronak;

public class PetrolEngine implements Engine {
    public PetrolEngine() {
        System.out.println("Petrol engine constructor...");
    }

    @Override
    public int start() {
        return 1;
    }
}
