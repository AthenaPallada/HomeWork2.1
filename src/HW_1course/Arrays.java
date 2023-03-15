package HW_1course;

public class Arrays {
    public static void main(String[] args) {
        //1 задача
        int[] weight = new int [3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        double[] number = {1.57, 7.654, 9.986};
        byte[] age = {14, 18, 20, 45};
        //2 задача
        System.out.println("2 задача");
        for(int i = 0; i < weight.length; i++) {
            System.out.print(weight[i]);
            if(i < weight.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for(int i = 0; i < number.length; i++) {
            System.out.print(number[i]);
            if(i < number.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for(int i = 0; i < age.length; i++) {
            System.out.print(age[i]);
            if (i < age.length - 1) {
                System.out.print(", ");
            }
        }
        //3 задача
        System.out.println("\n3 задача");
        for (int i = weight.length - 1; i >= 0; i--) {
            System.out.print(weight[i]);
            if(i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i]);
            if(i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = age.length - 1; i >= 0; i--) {
            System.out.print(age[i]);
            if(i > 0) {
                System.out.print(", ");
            }
        }
        //4 задача
        System.out.println("\n4 задача");
        for(int i = 0; i < weight.length; i++) {
            if(i % 2 == 0) {
                weight[i] += 1;
            }
        System.out.print(weight[i] + " ");
        }

        //Задание 1
        System.out.println("Задание 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        //Задание 2
        System.out.println("Задание 2");
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
        //Задание 3
        System.out.println("Задание 3");
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            avg += arr[i]/arr.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + avg + " рублей");
        // double avg = (double) sum / arr.length; В задание было приведение к дабл, но дз засчитали
        //Задание 4
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}