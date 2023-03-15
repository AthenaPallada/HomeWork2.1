package HW_1course;

public class HWCycles2_1 {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        double sumWithPercent = 0;
        double savings = 15000;
        double percent = 0.01;
        int g = 0;
        while(sumWithPercent < 2_459_000) {
            sumWithPercent = (sumWithPercent + savings) * (1 + percent);
            g++;
            System.out.println("Месяц " + g + ", сумма накоплений равна = " + sumWithPercent + " рублей");
        }
        //Задача 2
        System.out.println("Задача 2");
        g = 0;
        while(g < 10) {
            g++;
            System.out.print(g + " ");
        }
        System.out.println();
        for(g = 10; g >= 1; g--) {
            System.out.print(g + " ");
        }
        //Задача 3
        System.out.println();
        System.out.println("Задача 3");
        int populationY = 12_000_000;
        int childBirth = 17;
        int mortality = 8;

        while(g < 10) {
            populationY = (populationY / 1000 * childBirth - populationY / 1000 * mortality) + populationY;
            g++;
            System.out.println("Год " + g + ", численность населения составляет = " + populationY);
        }

        //Задача 1
        System.out.println("Задача 1");
        double savings1 = 15000;
        double percent2 = 0.07;
        double sumWithPercent3 = 0;
        int i = 1;
        for(; sumWithPercent3 < 2_000_000; i++) {
            sumWithPercent3 = (sumWithPercent3 + savings1) * (1 + percent2);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sumWithPercent3 + " рублей");
        }
        //Задача 2
        System.out.println("Задача 2");
        double sumWithPercent3_1 = 0;
        i = 1;
        for(; sumWithPercent3_1 < 2_000_000; i++) {
            sumWithPercent3_1 = (sumWithPercent3_1 + savings) * (1 + percent);
            if(i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + sumWithPercent3_1 + " рублей");
            }
        }
        //Задача 3
        System.out.println("Задача 3");
        double sum = 0;
        i = 1;
        for(; i <= 108; i++) {
            sum = (sum + savings1) * (1 + percent2);
            if(i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей");
            }
        }
        //Задача 4
        System.out.println("Задача 4");
        int firstFriday = 1;
        for (int currentFriday = firstFriday; currentFriday <= 31; currentFriday += 7) {
            System.out.println("Сегодня пятница, " + currentFriday + "-ое число. " + "Необходимо подготовить отчет.");
        }

        //Задача 1
        System.out.println("Задача 1");
        int startYear = 1822;
        int endYear = 2122;
        for(; startYear <= endYear; startYear++) {
            if(startYear % 79 == 0) {
                System.out.println(startYear);
            }
        }
        //Задача 2
        System.out.println("Задача 2");
        byte a = 2;
        for(int r = 1; r <= 10; r++) {
            System.out.println(a + " * " + r + " = " + a * r);
        }
    }
}