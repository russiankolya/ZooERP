package org.example.model;

public abstract class Thing implements IInventory {
    protected int inventoryId;

    public Thing(int inventoryId) {
        this.inventoryId = inventoryId;
    }

    @Override
    public int getInventoryId(int inventory) {
        return inventoryId;
    }

    public abstract String getType();
}
