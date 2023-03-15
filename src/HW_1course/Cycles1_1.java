package HW_1course;

public class Cycles1_1 {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        // Задание 2
        System.out.println("Задание 2");
        for(int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        // Задание 3
        System.out.println("Задание 3");
        for(int i = 0; i <= 17; i += 2) {
            System.out.println("Четное число - " + i);
        }
        // Задание 4
        System.out.println("Задание 4");
        for(int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        // Задание 1
        System.out.println("Задание 1");
        for(int i = 1904; i <= 2096; i = i + 4) {
            if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                System.out.println(i + " - год является високосным");
            }
        }
        // Задание 2
        System.out.println("Задание 2");
        for(int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();
        // Задание 3
        System.out.println("Задание 3");
        for(int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }

        // Задание 1
        System.out.println("Задание 1");
        int savings = 29000;
        int sum = 0;
        for(int i = 1; i <= 12; i++) {
            sum = sum + savings;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей");
        }
        // Задание 2
        System.out.println("Задание 2");
        double percent = 0.01;
        double sumWithPercent = 0;
        for(int i = 1; i <= 12; i++) {
            sumWithPercent = (sumWithPercent + savings) * (1 + percent);
            System.out.println("Месяц " + i + " сумма накоплений равна " + sumWithPercent + " рублей");
        }
    }
}