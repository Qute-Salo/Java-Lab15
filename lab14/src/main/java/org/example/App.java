package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        File file = new File("plant.txt");
        try (FileWriter writer = new FileWriter(file)) {
            writer.write("Название: Роза\nТип: Многолетнее\nСемейство: Розовые\nЦвет: Красный");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("--- Задание 1 ---");
        System.out.println("Имя файла: " + file.getName());
        System.out.println("Абсолютный путь: " + file.getAbsolutePath());
        System.out.println("Размер: " + file.length() + " байт");
        System.out.println("Содержимое:");

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void task2() {
        System.out.println("\n--- Задание 2 ---");
        File file = new File("f_task2.txt");
        Scanner scanner = new Scanner(System.in);

        try (FileWriter writer = new FileWriter(file)) {
            System.out.println("Введите 10 целых чисел:");
            for (int i = 0; i < 10; i++) {
                int num = scanner.nextInt();
                writer.write(num + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int count = 0;
        System.out.print("Числа из файла: ");
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextInt()) {
                int num = fileScanner.nextInt();
                System.out.print(num + " ");
                if (num % 2 == 0 || num % 3 == 0) {
                    count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\nКоличество чисел, кратных 2 или 3: " + count);
    }

    public static void task3() {
        System.out.println("\n--- Задание 3 ---");
        File fileF = new File("f_task3.txt");
        File fileG = new File("g_task3.txt");
        File fileH = new File("h_task3.txt");
        Random random = new Random();

        try (FileWriter writerF = new FileWriter(fileF)) {
            for (int i = 0; i < 20; i++) {
                writerF.write((random.nextInt(200) - 100) + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Scanner scannerF = new Scanner(fileF);
             FileWriter writerG = new FileWriter(fileG);
             FileWriter writerH = new FileWriter(fileH)) {

            while (scannerF.hasNextInt()) {
                int num = scannerF.nextInt();
                if (num % 5 == 0 && num % 7 == 0) {
                    writerG.write(num + " ");
                } else {
                    writerH.write(num + " ");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Файлы g и h успешно сформированы.");
    }

    public static void task4() {
        System.out.println("\n--- Задание 4 ---");
        File file = new File("radiation.txt");
        Scanner scanner = new Scanner(System.in);

        try (FileWriter writer = new FileWriter(file)) {
            System.out.println("Введите 15 вещественных значений уровня радиации:");
            for (int i = 0; i < 15; i++) {
                double val = scanner.nextDouble();
                writer.write(val + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        double sum = 0;
        int count = 0;
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextDouble()) {
                sum += fileScanner.nextDouble();
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (count > 0) {
            System.out.println("Средний уровень радиации: " + (sum / count));
        }
    }

    public static void task5() {
        System.out.println("\n--- Задание 5 ---");
        File file = new File("f_task5.txt");
        Random random = new Random();

        try (FileWriter writer = new FileWriter(file)) {
            for (int i = 0; i < 10; i++) {
                writer.write(random.nextInt(150) + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int count = 0;
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextInt()) {
                if (fileScanner.nextInt() > 75) {
                    count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Количество чисел больших 75: " + count);
    }
}
