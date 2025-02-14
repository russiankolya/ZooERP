package org.example.model;

public class Monkey extends Herbivore {
    public Monkey(int inventoryId, int foodAmount, String name, int kindness) {
        super(inventoryId, foodAmount, name, kindness);
    }

    @Override
    public String getType() {
        return "Monkey";
    }
}
