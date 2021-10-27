package ee.kool.demoKool.grades.dto;

import ee.kool.demoKool.students.dto.Student;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class Grade {
    private int id;
    private int grade;
    private String subject;
    private LocalDateTime date;
    private int semester;

    public Grade(int id, int grade, String subject, LocalDateTime date, int semester) {
        this.id = id;
        this.grade = grade;
        this.subject = subject;
        this.date = date;
        this.semester = semester;
    }
}
