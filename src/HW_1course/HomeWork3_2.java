package HW_1course;

public class HomeWork3_2 {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int age = 23;
        if(age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить дет сад");
        } else if (age > 6 && age <= 18 ) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age > 18 && age <= 24 ) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }  else if (age > 24 ) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }

        // Задание 2
        System.out.println("Задание 2");
        if(age < 5) {
            System.out.println("Ребенок не может кататься на аттракционе");
        } else if (age >= 5 && age < 14 ) {
            System.out.println("Ребенок может кататься только в сопровождении взрослого");
        } else {
            System.out.println("Ребенок может кататься без сопровождения взрослого");
        }

        // Задание 3
        System.out.println("Задание 3");
        int one = 3;
        int two = 1313;
        int three = 13;
        if(one > two) {
            if(one >= three) {
                System.out.println("Максимальное число - " + one);
            } else {
                System.out.println("Максимальное число - " + three);
            }
        } else if (two > one) {
            if (one >= three) {
                System.out.println("Максимальное число - " + two);
            } else {
                System.out.println("Максимальное число - " + three);
            }
        } else {
            if(one > three) {
                System.out.println("Максимальное число - " + one);
            } else if (three > one) {
                System.out.println("Максимальное число - " + three);
            } else {
                System.out.println("Все числа равны");
            }
        }
    }
}