package org.example;

import java.util.ArrayList;
import java.util.List;

public class MuseumUtils {


    public static void printMuseumsWithRatingGreaterThan3(List<Museum> museums) {
        System.out.println("\nМузеи со средним рейтингом > 3");
        for (Museum m : museums) {
            if (m.getAverageRating() > 3.0) {
                System.out.println(m);
        System.out.println("\nПовышение звездности для музеев с рейтингом >= 4");
            }
        }
    }

    public static void raiseStarsForGoodMuseums(List<Museum> museums) {
        for (Museum m : museums) {
            if (m.getAverageRating() >= 4.0) {
                if (m.getStars() < 5) {
                    m.setStars(m.getStars() + 1);
                    System.out.println("Музей '" + m.getName() + "' улучшил звездность до: " + m.getStars());
                }
            }
        }
    }

    public static void printMuseums(List<Museum> museums, int targetStars) {
        System.out.println("\nПечать музеев с количеством звезд: " + targetStars );
        boolean found = false;
        for (Museum m : museums) {
            if (m.getStars() == targetStars) {
                System.out.println(m);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Музеев с " + targetStars + " звездами не найдено.");
        }
    }

    public static void sortAndPrintMuseums(List<Museum> museums) {
        System.out.println("\nСортировка по убыванию рейтинга");

        List<Museum> sortedList = new ArrayList<>(museums);

        sortedList.sort((m1, m2) -> {
            int cmp = Double.compare(m2.getAverageRating(), m1.getAverageRating());
            if (cmp == 0) {
                return m1.getName().compareTo(m2.getName());
            }
            return cmp;
        });

        for (Museum m : sortedList) {
            System.out.println("ID: " + m.getId() + ", Название: " + m.getName() + ", Средний рейтинг: " + String.format("%.2f", m.getAverageRating()));
        }
    }
}