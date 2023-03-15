package HW_2course.Human;

public class Main {
    public static void main(String[] args) {
        Human maksim = new Human(
                1988,
                "Максим",
                "Минск",
                "бренд-менеджера");
        Human anya = new Human(
                1993,
                "Аня",
                "Москва",
                "методиста образовательных программ");
        Human katya = new Human(
                1992,
                "Катя",
                "Калининград",
                "продакт-менеджера");
        Human artem = new Human(
                1995,
                "Артем",
                "Москва",
                "директора по развитию бизнеса");
        Human vladimir = new Human(
                2001,
                "Владимир",
                "Казань",
                null);
        maksim.printInfo();
        anya.printInfo();
        katya.printInfo();
        artem.printInfo();
        vladimir.printInfo();
    }
}