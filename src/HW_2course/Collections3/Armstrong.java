package HW_2course.Collections3;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
//        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Enter a number");
//        int num = Integer.parseInt(br.readLine());
        Scanner input = new Scanner(System.in);
        System.out.println("Ведите число или числа для проверки: ");
        int num = input.nextInt();
        int number, digit, sum = 0;
        number = num;
        while (number != 0) {
            digit = number % 10;
            sum = sum + digit * digit * digit;
            number /= 10;
        }
        if(sum == num) {
            System.out.println(num + " это число Армстронга");
        } else {
            System.out.println(num + " это нечисло Армстронга");
        }
    }
}