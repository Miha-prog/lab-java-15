package org.example;

public class School extends Institution {
    private String grades;

    public School(String name, String address, int students, String grades) {
        super(name, address, students);
        this.grades = grades;
    }

    @Override
    public String getType() {
        return "Школа";
    }

    public String getGrades() { return grades; }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Классы: " + grades);
    }
}