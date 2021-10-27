package ee.kool.demoKool.students.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import ee.kool.demoKool.grades.dto.Grade;
import lombok.Data;

import java.util.List;

@Data
public class Student {
    private int id;
    private String name;

    @JsonIgnoreProperties("student")
    private List<Grade> GradeList;


    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
