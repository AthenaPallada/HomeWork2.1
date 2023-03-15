package HW_2course.Coursework2.model;

import java.time.LocalDateTime;

public interface Repeatability {
    LocalDateTime nextTime(LocalDateTime currentDateTime);
}
