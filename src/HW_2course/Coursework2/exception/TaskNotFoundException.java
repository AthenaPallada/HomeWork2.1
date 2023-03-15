package HW_2course.Coursework2.exception;

public class TaskNotFoundException extends Exception {
    private final int id;

    public TaskNotFoundException(int id) {
        this.id = id;
    }

    @Override
    public String getMessage() {
        return "Задача с id - " + id + " не найдена";
    }
}
