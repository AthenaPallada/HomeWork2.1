package HW_2course.Coursework2.model;

import java.time.LocalDateTime;

public class Daily implements Repeatability{
    @Override
    public LocalDateTime nextTime(LocalDateTime currentDateTime) {
        return currentDateTime.plusDays(1);
    }

    @Override
    public String toString() {
        return "ежедневная";
    }
}