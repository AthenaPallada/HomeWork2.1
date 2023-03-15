package HW_1course;

import java.time.LocalDate;
public class Methods {
    public static void checksYear(int year) {
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " номер года — високосный год");
        } else {
            System.out.println(year + " номер года — не високосный год");
        }
    }
    public static String getType(int type) {
        if(type == 1) {
            return "Андроид";
        } else {
            return "IOS";
        }
    }
    public static String getTypeOfVersion(int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        if(deviceYear == currentYear) {
            return "обычную";
        } else {
            return "lite";
        }
    }
    public static void installationOS(int type, int deviceYear) {
        String os = getType(type);
        String typeOfVersion = getTypeOfVersion(deviceYear);
        System.out.println("Установите " + typeOfVersion + " версию для приложения " + os);
    }
    public static int calcDistance(int deliveryDistance) {
        int deliveryDays = 1;
        int interval = 40;
        int startInterval = 20;
        if (deliveryDistance > startInterval) {
            deliveryDays = deliveryDays + (int) Math.ceil((deliveryDistance - startInterval) / (double) interval);
        }
        return deliveryDays;
    }
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int year = 2023;
        checksYear(year);
        // Задание 2
        System.out.println("Задание 2");
        int clientOS = 0;
        int clientDeviceYear = 2015;
        installationOS(clientOS, clientDeviceYear);
        // Задание 3
        System.out.println("Задание 3");
        int deliveryDistance = 95;
        int deliveryDays = calcDistance(deliveryDistance);
        calcDistance(deliveryDistance);
        System.out.println("Потребуется дней: " + deliveryDays);
    }
}