package org.example;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Информация о любимом животном");
        System.out.println("2. 10 целых чисел (четные и > 10)");
        System.out.println("3. Разделение случайных чисел (нечетные < 100 в g, остальные в h)");
        System.out.println("4. 10 вещественных значений КПД и среднее");
        System.out.println("5. 10 целых чисел (диапазон от 10 до 90)");
        System.out.print("Выберите номер задания (от 1 до 5): ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        try {
            switch (choice) {
                case 1:
                    runTask1();
                    break;
                case 2:
                    runTask2(scanner);
                    break;
                case 3:
                    runTask3();
                    break;
                case 4:
                    runTask4(scanner);
                    break;
                case 5:
                    runTask5();
                    break;
                default:
                    System.out.println("Ошибка: неверный номер задания.");
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e.getMessage());
        }

        scanner.close();
    }

    public static void runTask1() throws IOException {
        String fileName = "animal_info.txt";
        Path path = Paths.get(fileName);

        String info = "Любимое животное: Кот.\n" +
                "Порода: Британская короткошерстная." +
                "\nОсобенности: Спокойный, независимый характер.";
        Files.writeString(path, info);

        System.out.println("\nИнформация о файле");
        System.out.println("Имя файла: " + path.getFileName());
        System.out.println("Размер файла: " + Files.size(path) + " байт");
        System.out.println("Абсолютный путь: " + path.toAbsolutePath());
        System.out.println("Файл существует: " + Files.exists(path));

        System.out.println("\nСодержимое файла");
        String content = Files.readString(path);
        System.out.println(content);
    }

    public static void runTask2(Scanner scanner) throws IOException {
        String fileName = "f.txt";
        System.out.println("\nВведите 10 целых чисел через пробел или Enter:");

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (int i = 0; i < 10; i++) {
                writer.println(scanner.nextInt());
            }
        }

        System.out.println("\nСчитанные числа из файла:");
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int num = Integer.parseInt(line);
                System.out.print(num + " ");
                if (num % 2 == 0 && num > 10) {
                    count++;
                }
            }
        }
        System.out.println("\nКоличество чисел, являющихся чётными и большими 10: " + count);
    }

    public static void runTask3() throws IOException {
        String fileF = "f_random.txt";
        String fileG = "g.txt";
        String fileH = "h.txt";

        Random random = new Random();
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileF))) {
            for (int i = 0; i < 20; i++) {
                writer.println(random.nextInt(150) - 20);
            }
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileF));
             PrintWriter writerG = new PrintWriter(new FileWriter(fileG));
             PrintWriter writerH = new PrintWriter(new FileWriter(fileH))) {

            String line;
            while ((line = reader.readLine()) != null) {
                int num = Integer.parseInt(line);
                if (num % 2 != 0 && num < 100) {
                    writerG.println(num);
                } else {
                    writerH.println(num);
                }
            }
        }
        System.out.println("\nФайлы 'f_random.txt', 'g.txt' и 'h.txt' успешно созданы и заполнены по условию!");
    }

    public static void runTask4(Scanner scanner) throws IOException {
        String fileName = "efficiency.txt";
        System.out.println("\nВведите 10 вещественных значений КПД (например, 0.75):");

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (int i = 0; i < 10; i++) {
                writer.println(scanner.nextDouble());
            }
        }

        double sum = 0;
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                sum += Double.parseDouble(line);
                count++;
            }
        }

        double average = count > 0 ? sum / count : 0;
        System.out.println("Средний КПД: " + average);
    }

    public static void runTask5() throws IOException {
        String fileName = "f.txt";
        Random random = new Random();

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (int i = 0; i < 10; i++) {
                writer.println(random.nextInt(120) - 10);
            }
        }

        System.out.println("\nСгенерированные числа в файле 'f.txt':");
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int num = Integer.parseInt(line);
                System.out.print(num + " ");
                if (num >= 10 && num <= 90) {
                    count++;
                }
            }
        }
        System.out.println("\nКоличество чисел, попадающих в диапазон от 10 до 90: " + count);
    }
}