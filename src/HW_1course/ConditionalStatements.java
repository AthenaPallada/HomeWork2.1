package HW_1course;

public class ConditionalStatements {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int clientOS = 1;
        if(clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        // Задание 2
        System.out.println("Задание 2");
        int clientDeviceYear = 2015;
        if(clientDeviceYear >= 2015 && clientDeviceYear <= 2022) {
            System.out.println("Приложение будет работать корректно");
        } else if (clientDeviceYear < 2015) {
            if(clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }

        // Задание 3
        System.out.println("Задание 3");
        int year = 1988;
        if(year % 4 == 0 && year % 100 > 0) {
            System.out.println(year + "год является високосным(количество дней в году: 366)");
        } else if (year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + "год является високосным(количество дней в году: 366)");
        } else {
            System.out.println(year + "год не является високосным(количество дней в году: 365)");
        }

        // Задание 4
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        if(deliveryDistance < 20) {
            System.out.println("Потребуется сутки для доставки");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60 ) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: 3");
        }

        // Задание 5
        System.out.println("Задание 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Принадлежит к зимнему сезону");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Принадлежит к весеннему сезону");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Принадлежит к летнему сезону");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Принадлежит к осеннему сезону");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}