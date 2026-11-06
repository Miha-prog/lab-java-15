package org.example;

public class SportsEquipment {
    protected String name;
    protected int id;
    protected double weight;

    public SportsEquipment(String name, int id, double weight) {
        this.name = name;
        this.id = id;
        this.weight = weight;
    }

    public String getName() { return name; }
    public int getId() { return id; }
    public double getWeight() { return weight; }

    @Override
    public String toString() {
        return "name='" + name + "', id=" + id + ", weight=" + weight;
    }
}