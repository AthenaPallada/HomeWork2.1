package HW_1course;

public class StringTask {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        //Задание 2
        System.out.println("Задание 2");
        String name = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета —  " + name);
        //Задание 3
        System.out.println("Задание 3");
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace( "ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}