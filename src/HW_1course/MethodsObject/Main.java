package HW_1course.MethodsObject;

public class Main {
    public static void main(String[] args) {
        Author carroll = new Author("Льюис","Кэрролл");
        Author gaiman = new Author("Нил", "Гейман");
        Book book1 = new Book("Алиса в Стране чудес", 1865, carroll);
        Book book2 = new Book("Никогде", 1996, gaiman);
        System.out.println(carroll);
        System.out.println(gaiman);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book1.equals(book2));
        System.out.println(gaiman.equals(carroll));
    }
}