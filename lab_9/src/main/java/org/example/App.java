package org.example;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Tool> tools = new ArrayList<>();

        tools.add(new Drill("Ударная дрель", 850, 2.1, 3000));
        tools.add(new Drill("Аккумуляторная дрель", 500, 1.5, 1750));
        tools.add(new Drill("Мощная дрель", 1100, 3.0, 3500));

        tools.add(new Saw("Дисковая пила", 1400, 4.2, 190.0));
        tools.add(new Saw("Сабельная пила", 900, 2.8, 150.0));

        for (Tool tool : tools) {
            tool.displayInfo();
            tool.use();
            System.out.println("Класс безопасности: " + tool.getSafetyClass());

        }
    }
}