package org.example.model;

public class Table extends Thing {
    public Table(int inventoryId) {
        super(inventoryId);
    }

    @Override
    public String getType() {
        return "Table";
    }
}
