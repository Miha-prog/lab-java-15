package org.example;

import java.util.List;

public class Museum {
    private int id;
    private String name;
    private String city;
    private int stars;
    private List<Integer> visitorRatings;

    public Museum(int id, String name, String city, int stars, List<Integer> visitorRatings) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.stars = stars;
        this.visitorRatings = visitorRatings;
    }

    public double getAverageRating() {
        if (visitorRatings == null || visitorRatings.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (int rating : visitorRatings) {
            sum += rating;
        }
        return sum / visitorRatings.size();
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getCity() { return city; }

    public int getStars() { return stars; }
    public void setStars(int stars) { this.stars = stars; }

    public List<Integer> getVisitorRatings() { return visitorRatings; }

    @Override
    public String toString() {
        return "Museum{id=" + id + ", name='" + name + "', city='" + city +
                "', stars=" + stars + ", avgRating=" + String.format("%.2f", getAverageRating()) + "}";
    }
}