package HW_1course.MethodsObject;

import java.util.Objects;
public class Book {
    private String name;
    private int yearPublication;
    private Author author;
    public Book(String name, int yearPublication, Author author) {
        this.name = name;
        this.yearPublication = yearPublication;
        this.author = author;
    }
    public String getName() {
        return name;
    }
    public int getYearPublication() {
        return yearPublication;
    }
    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }
    public Author getAuthor() {
        return author;
    }
    @Override
    public String toString() {
        return "Название книги: " + name + "\nГод публикации: " + yearPublication + "\n" + author;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return yearPublication == book.yearPublication && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, yearPublication, author);
    }
}