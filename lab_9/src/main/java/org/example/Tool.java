package org.example;

public abstract class Tool {
    private String name;
    private double power;
    private double weight;

    public Tool(String name, double power, double weight) {
        this.name = name;
        this.power = power;
        this.weight = weight;
    }

    public abstract void use();
    public abstract String getSafetyClass();

    public void displayInfo() {
        System.out.println("Инструмент: " + name + ", Мощность: " + power + " Вт, Вес: " + weight + " кг");
    }

    public String getName() { return name; }
    public double getPower() { return power; }
    public double getWeight() { return weight; }
}