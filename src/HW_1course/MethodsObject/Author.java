package HW_1course.MethodsObject;

import java.util.Objects;
public class Author {
    private String authorName;
    private String lastName;
    public Author(String authorName, String lastName) {
        this.authorName = authorName;
        this.lastName = lastName;
    }
    public String getAuthorName() {
        return authorName ;
    }
    public String getLastName() {
        return lastName;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Author author = (Author) o;
        return getAuthorName().equals(author.getAuthorName())&& getLastName().equals(author.getLastName());
    }
    @Override
    public int hashCode() {
        return Objects.hash(authorName, lastName);
    }
    @Override
    public String toString() {
        return "Имя автора: " + authorName + "\nФамилия: " + lastName;
    }
}