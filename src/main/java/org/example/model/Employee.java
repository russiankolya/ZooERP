package org.example.model;

public class Employee implements IAlive {
    private final String name;
    private final int foodAmount;

    public Employee(String name, int foodAmount) {
        this.name = name;
        this.foodAmount = foodAmount;
    }

    @Override
    public int getFoodAmount() {
        return foodAmount;
    }

    public String getName() {
        return name;
    }

}
