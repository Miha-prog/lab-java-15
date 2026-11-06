package org.example;

public class Helmet extends SportsEquipment {
    private String size;

    public Helmet(String name, int id, double weight, String size) {
        super(name, id, weight);
        this.size = size;
    }

    public String getSize() { return size; }

    @Override
    public String toString() {
        return "Helmet{" + super.toString() + ", size='" + size + "'}";
    }
}