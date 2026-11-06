package org.example;

import java.util.*;

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Выберите номер задания (1 или 2): ");

    int choice = scanner.nextInt();

    switch (choice) {
      case 1:
        System.out.println("\nЗадания 1 ");
        runTask1();
        break;
      case 2:
        System.out.println("\nЗадания 2 ");
        runTask2();
        break;
      default:
        System.out.println("Ошибка: такого задания не существует. Введите 1 или 2.");
    }

    scanner.close();
  }

  public static void runTask1() {
    Map<String, SportsEquipment> equipmentMap = new HashMap<>();

    equipmentMap.put("Футбольный мяч", new Ball("Футбольный мяч", 1, 0.45, "Футбол"));
    equipmentMap.put("Баскетбольный мяч", new Ball("Баскетбольный мяч", 2, 0.60, "Баскетбол"));
    equipmentMap.put("Волейбольный мяч", new Ball("Волейбольный мяч", 3, 0.27, "Волейбол"));

    equipmentMap.put("Теннисная ракетка", new Racket("Теннисная ракетка", 4, 0.30, 25.5));
    equipmentMap.put("Ракетка для бадминтона", new Racket("Ракетка для бадминтона", 5, 0.09, 10.0));
    equipmentMap.put("Ракетка для сквоша", new Racket("Ракетка для сквоша", 6, 0.15, 12.0));

    equipmentMap.put("Велосипедный шлем", new Helmet("Велосипедный шлем", 7, 0.40, "L"));
    equipmentMap.put("Хоккейный шлем", new Helmet("Хоккейный шлем", 8, 1.20, "M"));

    for (Map.Entry<String, SportsEquipment> entry : equipmentMap.entrySet()) {
      System.out.println("Ключ: [" + entry.getKey() + "] --> Значение: " + entry.getValue());
    }
  }

  public static void runTask2() {
    List<Museum> museums = new ArrayList<>();

    museums.add(new Museum(1, "Лувр", "Париж", 5, Arrays.asList(5, 5, 4, 5)));
    museums.add(new Museum(2, "Эрмитаж", "Санкт-Петербург", 5, Arrays.asList(5, 4, 5, 4)));
    museums.add(new Museum(3, "Метрополитен", "Нью-Йорк", 4, Arrays.asList(4, 3, 4, 4)));
    museums.add(new Museum(4, "Британский музей", "Лондон", 4, Arrays.asList(3, 2, 3, 3)));
    museums.add(new Museum(5, "Музей Прадо", "Мадрид", 4, Arrays.asList(5, 5, 4)));
    museums.add(new Museum(6, "Уффици", "Флоренция", 4, Arrays.asList(4, 4, 3)));
    museums.add(new Museum(7, "Музей современного искусства", "Чикаго", 3, Arrays.asList(2, 3, 2)));
    museums.add(new Museum(8, "Городской музей", "Минск", 3, Arrays.asList(3, 3, 3)));

    MuseumUtils.printMuseumsWithRatingGreaterThan3(museums);
    MuseumUtils.raiseStarsForGoodMuseums(museums);
    MuseumUtils.printMuseums(museums, 5);
    MuseumUtils.sortAndPrintMuseums(museums);
  }
}