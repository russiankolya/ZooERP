package org.example.model;

public class Herbivore extends Animal {
    private final int kindness;

    public Herbivore(int inventoryId, int foodAmount, String name, int kindness) {
        super(inventoryId, foodAmount, name);
        this.kindness = kindness;
    }

    public boolean canBeInContactZoo() {
        return kindness > 5;
    }

    @Override
    public String getType() {
        return "Herbivore";
    }
}
