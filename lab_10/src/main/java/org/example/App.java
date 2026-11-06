package org.example;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Educable> institutions = new ArrayList<>();

        institutions.add(new School("Школа №1", 600, "1-11"));
        institutions.add(new School("Гимназия №5", 850, "5-11"));
        institutions.add(new School("Лицей №2", 450, "10-11"));

        institutions.add(new University("БГУ", 25000, 18));
        institutions.add(new University("БНТУ", 19000, 15));

        for (Educable inst : institutions) {
            inst.educate();
            System.out.println("Количество учащихся: " + inst.getStudents());

            if (inst instanceof Graduable) {
                Graduable grad = (Graduable) inst;
                grad.graduate();
                System.out.println("Количество выпускников в этом году: " + grad.getGraduates());
            }
        }
    }
}