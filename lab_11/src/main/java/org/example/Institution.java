package org.example;

public class Institution {
    private String name;
    private String address;
    private int students;

    public Institution(String name, String address, int students) {
        this.name = name;
        this.address = address;
        this.students = students;
    }

    public void teach() {
        System.out.println("Учу");
    }

    public void teach(String subject) {
        System.out.println("Учу предмету " + subject);
    }

    public void teach(int hours) {
        System.out.println("Учу " + hours + " часов");
    }

    public String getType() {
        return "Учебное заведение";
    }

    public String getName() { return name; }
    public String getAddress() { return address; }
    public int getStudents() { return students; }

    public void displayInfo() {
        System.out.println("Название: " + name);
        System.out.println("Адрес: " + address);
        System.out.println("Количество учащихся: " + students);
        System.out.println("Тип: " + getType());
    }
}