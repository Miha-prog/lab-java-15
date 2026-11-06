package org.example;

public class Racket extends SportsEquipment {
    private double stringTension;

    public Racket(String name, int id, double weight, double stringTension) {
        super(name, id, weight);
        this.stringTension = stringTension;
    }

    public double getStringTension() { return stringTension; }

    @Override
    public String toString() {
        return "Racket{" + super.toString() + ", stringTension=" + stringTension + "}";
    }
}