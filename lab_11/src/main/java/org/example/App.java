package org.example;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        System.out.println("=== ДЕМОНСТРАЦИЯ ПЕРЕГРУЗКИ ===");
        Institution demo = new Institution("Тест", "Тест", 0);
        demo.teach();
        demo.teach("Математика");
        demo.teach(6);

        System.out.println("\n=== ДЕМОНСТРАЦИЯ ПЕРЕОПРЕДЕЛЕНИЯ ===");
        List<Institution> institutions = new ArrayList<>();

        institutions.add(new School("Школа №1", "ул. Ленина, 10", 600, "1-11"));
        institutions.add(new School("Гимназия №5", "ул. Пушкина, 5", 850, "5-11"));
        institutions.add(new School("Лицей №2", "ул. Гагарина, 2", 450, "10-11"));
        institutions.add(new University("БГУ", "пр. Независимости, 4", 25000, 18));
        institutions.add(new University("БНТУ", "пр. Независимости, 65", 19000, 15));

        for (Institution inst : institutions) {
            inst.displayInfo();
            inst.teach();
            inst.teach("Информатика");
            inst.teach(2);
        }
    }
}