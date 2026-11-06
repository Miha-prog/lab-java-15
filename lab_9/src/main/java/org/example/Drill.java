package org.example;

public class Drill extends Tool {
    private int speed;

    public Drill(String name, double power, double weight, int speed) {
        super(name, power, weight);
        this.speed = speed;
    }

    @Override
    public void use() {
        System.out.println(getName() + " сверлит отверстия со скоростью " + speed + " об/мин.");
    }

    @Override
    public String getSafetyClass() {
        return "Класс I";
    }

    public int getSpeed() { return speed; }
}