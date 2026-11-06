package org.example;

public class School implements Educable, Graduable {
    private String name;
    private int students;
    private String grades;

    public School(String name, int students, String grades) {
        this.name = name;
        this.students = students;
        this.grades = grades;
    }

    @Override
    public void educate() {
        System.out.println("Школа " + name + " обучает учеников по программе классов: " + grades + ".");
    }

    @Override
    public int getStudents() {
        return students;
    }

    @Override
    public void graduate() {
        System.out.println("Школа " + name + " проводит выпускной для учеников.");
    }

    @Override
    public int getGraduates() {
        return students / 10;
    }

    public String getName() { return name; }
    public String getGrades() { return grades; }
}