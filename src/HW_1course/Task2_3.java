package HW_1course;

public class Task2_3 {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        // Задача 2
        System.out.println("Задача 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        // Задача 3
        System.out.println("Задача 3");
        var dog1 = 8.0;
        dog1 = dog1 - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("dog = " + dog1);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        // Задача 4
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println("friend = " + friend);
        friend = friend + 2;
        System.out.println("friend = " + friend);
        friend = friend / 7;
        System.out.println("friend = " + friend);

        // Задача 5
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println("frog = " + frog);
        frog = frog / 3.5;
        System.out.println("frog = " + frog);
        frog = frog + 4;
        System.out.println("frog = " + frog);

        // Задача 6
        System.out.println("Задача 6");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        System.out.println("Общий вес двух бойцов - " + (boxer1 + boxer2) + "кг");
        System.out.println("Разница между весами 2-х бойцов - " + (boxer2 - boxer1) + "кг");

        // Задача 7
        System.out.println("Задача 7");
        System.out.println("Разница между весами 2-х бойцов(1способ) - " + (boxer2 - boxer1) + "кг");
        System.out.println("Разница между весами 2-х бойцов(2способ) - " + (boxer2 % boxer1) + "кг");

        // Задача 8
        System.out.println("Задача 8");
        var totalHours = 640;
        var workHours = 8;
        var totalStaff = totalHours / workHours;
        System.out.println("Всего работников в компании - " + totalStaff + " человек");
        totalStaff = totalStaff + 94;
        totalHours = totalStaff * workHours;
        System.out.println("Если в компании работает " + totalStaff + " человека, то всего " + totalHours + " часов работы может быть поделено между сотрудниками");
    }
}