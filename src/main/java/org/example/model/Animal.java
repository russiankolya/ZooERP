package org.example.model;

public abstract class Animal implements IAlive, IInventory {
    protected String name;
    protected int foodAmount;
    protected int inventoryId;

    public Animal(int inventoryId, int food, String name) {
        this.name = name;
        this.foodAmount = food;
        this.inventoryId = inventoryId;
    }

    @Override
    public int getInventoryId(int inventory) {
        return inventoryId;
    }

    @Override
    public int getFoodAmount() {
        return foodAmount;
    }

    public String getName() {
        return name;
    }

    public abstract String getType();
}
