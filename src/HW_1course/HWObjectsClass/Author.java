package HW_1course.HWObjectsClass;

public class Author {
    private String authorName;
    private String lastName;
    public Author(String authorName, String lastName) {
        this.authorName = authorName;
        this.lastName = lastName;
    }
    public String getAuthorName() {
        return this.authorName ;
    }
    public String getLastName() {
        return this.lastName;
    }
}
