package HW_1course.HWObjectsClass;

public class Main {
    public static void main(String[] args) {
        Author carroll = new Author("Льюис","Кэрролл");
        Author gaiman = new Author("Нил", "Гейман");
        Book book1 = new Book("Алиса в Стране чудес", 1865, carroll);
        Book book2 = new Book("Никогде", 1996, gaiman);
        book1.setYearPublication(1866);
        System.out.println("Изменненый год книги - " + book1.getYearPublication());
        System.out.println("Год " + book2.getYearPublication() + ", название книги - " + book2.getName());
    }
}