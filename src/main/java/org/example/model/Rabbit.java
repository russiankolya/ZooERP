package org.example.model;

public class Rabbit extends Herbivore {
    public Rabbit(int inventoryId, int foodAmount, String name, int kindness) {
        super(inventoryId, foodAmount, name, kindness);
    }

    @Override
    public String getType() {
        return "Rabbit";
    }
}
