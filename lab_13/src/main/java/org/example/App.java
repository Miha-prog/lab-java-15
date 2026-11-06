package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pet> clinic = new ArrayList<>();

        try {
            clinic.add(expressCreatePet("Барсик", "Кот", 3, 4.5, "Иван"));
            clinic.add(expressCreatePet("Рекс", "Собака", 5, 18.0, "Алексей"));
            clinic.add(expressCreatePet("Кеша", "Попугай", 1, 0.1, "Ольга"));
        } catch (InvalidPetDataException e) {
            System.out.println("Ошибка при создании питомца: " + e.getMessage());
        }

        System.out.println("1. Просмотреть всех питомцев");
        System.out.println("2. Посетить ветеринара");
        System.out.println("3. Обновить вес питомца");
        System.out.println("4. Проверить исключение при неверных данных");
        System.out.print("Выберите действие (1-4): ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.println("\nСписок пациентов клиники");
                for (Pet p : clinic) {
                    System.out.println(p);
                }
                break;

            case 2:
                System.out.println("\nОсмотр у ветеринара");
                try {
                    Pet patient = findPetByName(clinic, "Кеша");
                    patient.visitVet();
                } catch (PetNotFoundException | VetException e) {
                    System.out.println("Ошибка ветеринара: " + e.getMessage());
                }
                break;

            case 3:
                System.out.println("\nОбновление веса");
                try {
                    Pet patient = findPetByName(clinic, "Барсик");
                    patient.updateWeight(5.0);
                } catch (PetNotFoundException | InvalidPetDataException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }
                break;

            case 4:
                System.out.println("\nПроверка обработки некорректных данных");
                try {
                    Pet badPet = new Pet("Ошибка", "Кот", -2, 0, "Тест");
                } catch (InvalidPetDataException e) {
                    System.out.println("Перехвачено ожидаемое исключение: " + e.getMessage());
                }
                break;

            default:
                System.out.println("Неверный выбор меню.");
        }

        scanner.close();
    }

    private static Pet expressCreatePet(String name, String species, int age, double weight, String owner) throws InvalidPetDataException {
        return new Pet(name, species, age, weight, owner);
    }

    private static Pet findPetByName(List<Pet> pets, String name) throws PetNotFoundException {
        for (Pet p : pets) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        throw new PetNotFoundException("Питомец с именем '" + name + "' не найден в базе клиники.");
    }
}