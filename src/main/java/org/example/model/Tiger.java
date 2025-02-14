package org.example.model;


public class Tiger extends Predator {
    public Tiger(int inventoryId, int foodAmount, String name) {
        super(inventoryId, foodAmount, name);
    }

    @Override
    public String getType() {
        return "Tiger";
    }
}
