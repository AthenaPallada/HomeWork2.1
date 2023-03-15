package HW_1course;

public class Variable2 {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int booksCount = 1000;
        byte tigersCount = 13;
        short pensCount = 100;
        long boxesCount = 10000000L;
        float orangesWeight = 113.5f;
        double applesWeight = 1313.57;
        System.out.println("Значение переменной booksCount с типом int равно " + booksCount);
        System.out.println("Значение переменной tigersCount с типом byte равно " + tigersCount);
        System.out.println("Значение переменной pensCount с типом short равно " + pensCount);
        System.out.println("Значение переменной boxesCount с типом long равно " + boxesCount);
        System.out.println("Значение переменной orangesWeight с типом float равно " + orangesWeight);
        System.out.println("Значение переменной applesWeight с типом double равно " + applesWeight);

        // Задача 2
        char notebook = 569;
        byte whale = 67;
        short peas = 27897;
        long dollar = 987_678_965_549L;
        float saltWeight = 27.12f;
        int numberNegative  = -159;
        double num = 2.786;
        boolean whaleIsOld = whale > 100;

        // Задача 3
        System.out.println("Задача 3");
        int scholar1class = 23;
        int scholar2class = 27;
        int scholar3class = 30;
        int paperCount = 480;
        int sheetsNumber = paperCount / (scholar1class + scholar2class + scholar3class);
        System.out.println("На каждого ученика рассчитано " + sheetsNumber + " листов бумаги");

        // Задача 4
        System.out.println("Задача 4");
        int bottles = 16;
        int min = 2;
        int productivityPerMin = bottles / min;
        int time20min = 20;
        System.out.println("За " + time20min + " машина произвела бутылок " + time20min * productivityPerMin + " штук");
        int capacityDay = 24 * 60;
        System.out.println("За " + capacityDay + " машина произвела бутылок " + capacityDay * productivityPerMin + " штук");
        int minInThreeDays = 3 * capacityDay;
        System.out.println("За " + minInThreeDays + " машина произвела бутылок " + productivityPerMin * minInThreeDays + " штук");
        int minInMonth = minInThreeDays * 10;
        System.out.println("За "+ minInMonth + " машина произвела бутылок " + productivityPerMin * minInMonth + " штук");

        // Задача 5
        System.out.println("Задача 5");
        int totalTin = 120;
        int whiteTinPerClass = 2;
        int brownTinPerClass = 4;
        int totalClassrooms = totalTin / (whiteTinPerClass + brownTinPerClass);
        int totalTinWhite = totalClassrooms * whiteTinPerClass;
        int totalTinBrown = totalClassrooms * brownTinPerClass;
        System.out.println("В школе, где " + totalClassrooms + " классов, нужно " + totalTinWhite + " банок белой краски и " + totalTinBrown + " банок коричневой краски.");

        // Задача 6
        System.out.println("Задача 6");
        int bananasCount = 5;
        int totalWeightBananas = bananasCount * 80;
        int milkCount = 105;
        int totalWeightMilk = milkCount * 2;
        int iceCreamCount = 2;
        int totalWeightIceCream = iceCreamCount * 100;
        int eggsCount = 4;
        int totalWeightEggs = eggsCount * 70;
        int totalWeightGr = totalWeightBananas + totalWeightMilk + totalWeightIceCream + totalWeightEggs;
        float totalWeightKg = totalWeightGr / 1000f;
        System.out.println("Вес спорт-завтрака в граммах = " + totalWeightGr);
        System.out.println("Вес спорт-завтрака в килограммах = " + totalWeightKg);

        // Задача 7
        System.out.println("Задача 7");
        int weight = 7000;
        int weightLossMin = 250;
        int weightLossMax = 500;
        int weightLossMinInDay = weight / weightLossMin;
        int weightLossMaxInDay = weight / weightLossMax;
        int dayOnAverage = (weightLossMaxInDay + weightLossMinInDay) / 2;
        System.out.println("Столько дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм = " + weightLossMinInDay);
        System.out.println("Столько дней уйдёт на похудение, если спортсмен будет терять каждый день по 500 грамм = " + weightLossMaxInDay);
        System.out.println("Столько может потребоваться дней в среднем, чтобы добиться результата похудения = " + dayOnAverage);

        // Задача 8
        System.out.println("Задача 8");
        int salaryMaryInMoth = 67760;
        double higherSalaryMary = (salaryMaryInMoth * 0.1) + salaryMaryInMoth;
        double salaryInYearMary = (higherSalaryMary * 12) - (salaryMaryInMoth * 12);
        int salaryDenisInMoth = 83690;
        double higherSalaryDenis = (salaryDenisInMoth * 0.1) + salaryDenisInMoth;
        double salaryYearDenis = (higherSalaryDenis * 12) - (salaryDenisInMoth * 12);
        int salaryKristinaInMoth = 76230;
        double higherSalaryKristina = (salaryKristinaInMoth * 0.1) + salaryKristinaInMoth;
        double salaryYearKristina = (higherSalaryKristina * 12) - (salaryKristinaInMoth * 12);
        System.out.println("Маша теперь получает " + higherSalaryMary + "рублей. Годовой доход вырос на " + salaryInYearMary + "рублей");
        System.out.println("Маша теперь получает " + higherSalaryDenis + "рублей. Годовой доход вырос на " + salaryYearDenis + "рублей");
        System.out.println("Маша теперь получает " + higherSalaryKristina + "рублей. Годовой доход вырос на " + salaryYearKristina + "рублей");
    }
}