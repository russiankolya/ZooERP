package org.example.model;

public class Computer extends Thing {
    public Computer(int inventoryId) {
        super(inventoryId);
    }

    @Override
    public String getType() {
        return "Computer";
    }
}
