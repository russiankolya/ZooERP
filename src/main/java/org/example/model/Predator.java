package org.example.model;

public class Predator extends Animal {
    public Predator(int InventoryId, int foodAmount, String name) {
        super(InventoryId, foodAmount, name);
    }

    @Override
    public String getType() {
        return "Predator";
    }
}
