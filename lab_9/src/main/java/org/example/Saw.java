package org.example;

public class Saw extends Tool {
    private double bladeLength;

    public Saw(String name, double power, double weight, double bladeLength) {
        super(name, power, weight);
        this.bladeLength = bladeLength;
    }

    @Override
    public void use() {
        System.out.println(getName() + " режет материалы лезвием длиной " + bladeLength + " см.");
    }

    @Override
    public String getSafetyClass() {
        return "Класс II";
    }

    public double getBladeLength() { return bladeLength; }
}