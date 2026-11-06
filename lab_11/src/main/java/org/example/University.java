package org.example;

public class University extends Institution {
    private int faculties;

    public University(String name, String address, int students, int faculties) {
        super(name, address, students);
        this.faculties = faculties;
    }

    @Override
    public String getType() {
        return "Университет";
    }

    public int getFaculties() { return faculties; }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Факультетов: " + faculties);
    }
}