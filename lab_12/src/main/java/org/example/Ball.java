package org.example;

public class Ball extends SportsEquipment {
    private String sportType;

    public Ball(String name, int id, double weight, String sportType) {
        super(name, id, weight);
        this.sportType = sportType;
    }

    public String getSportType() { return sportType; }

    @Override
    public String toString() {
        return "Ball{" + super.toString() + ", sportType='" + sportType + "'}";
    }
}