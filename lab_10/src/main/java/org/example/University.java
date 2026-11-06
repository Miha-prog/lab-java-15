package org.example;

public class University implements Educable, Graduable {
    private String name;
    private int students;
    private int faculties;

    public University(String name, int students, int faculties) {
        this.name = name;
        this.students = students;
        this.faculties = faculties;
    }

    @Override
    public void educate() {
        System.out.println("Университет " + name + " проводит лекции на " + faculties + " факультетах.");
    }

    @Override
    public int getStudents() {
        return students;
    }

    @Override
    public void graduate() {
        System.out.println("Университет " + name + " выдает дипломы выпускникам.");
    }

    @Override
    public int getGraduates() {
        return students / 4;
    }

    public String getName() { return name; }
    public int getFaculties() { return faculties; }
}