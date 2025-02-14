package org.example.model;


public class Wolf extends Predator {
    public Wolf(int inventoryId, int foodAmount, String name) {
        super(inventoryId, foodAmount, name);
    }

    @Override
    public String getType() {
        return "Wolf";
    }
}
