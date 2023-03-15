package HW_1course;

public class HomeWork3_1 {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int age = 23;
        if(age >= 18) {
            System.out.println("Поздравляем пользователя с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать)");
        }

        // Задание 2
        System.out.println("Задание 2");
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу!");
        } else if (age >= 18 && age < 24) {
            System.out.println("Человек уже закончил школу и отправляться в университет или он студент");
        } else if (age >= 24) {
            System.out.println("Человек окончил университет и ищет первую работу или работает");
        }

        // Задание 3
        System.out.println("Задание 3");
        int tonnage1Wagon = 102;
        int seats = 60;
        int standingRooms = tonnage1Wagon - seats;

        int seatsUsed = 47;
        int standingRoomsUsed = 39;
        if(seatsUsed < seats) {
            System.out.println("Есть сидячие места - " + (seats - seatsUsed));
        } else {
            System.out.println("Нет сидячих мест");
        }
        if (standingRoomsUsed < standingRooms) {
            System.out.println("Есть стоячие места - " + (standingRooms - standingRoomsUsed));
        } else {
            System.out.println("Нет стоячих мест");
        }
    }
}