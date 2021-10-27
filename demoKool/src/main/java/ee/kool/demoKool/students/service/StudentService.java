package ee.kool.demoKool.students.service;

import ee.kool.demoKool.grades.dto.Grade;
import ee.kool.demoKool.students.dto.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class StudentService {

    public List<Student> GetGrades(Integer id)
    {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student(id, "Siim Sink");
        Grade grade1 = new Grade(0, 6, "inka", LocalDateTime.now(), 3);
        List<Grade> grades = new ArrayList<>();
        grades.add(grade1);
        student1.setGradeList(grades);
        students.add(student1);
        return students;
    }
    public Student PostGrade(Integer id, Integer grade, String subject, Integer semester)
    {
        List<Grade> grades = new ArrayList<>();
        Student student = new Student(id, "Siim Sink");
        Grade grade1 = new Grade(0, grade, subject, LocalDateTime.now(), semester);
        grades.add(grade1);
        student.setGradeList(grades);
        return student;
    }
    public Grade putStudentsGrade(int id, int id2, Grade gradeChange) {
        List<Grade> grades = new ArrayList<>();
        Student student1 = new Student(1, "Siim Sink");
        Grade grade1 = new Grade(0, 6, "inka", LocalDateTime.now(), 3);

        grade1.setGrade(gradeChange.getGrade());
        grade1.setSubject(gradeChange.getSubject());
        grades.add(grade1);
        student1.setGradeList(grades);
        return grade1;
    }
    public Student getStudentGradeFilter(int id, String subject) {

        List<Grade> grades = new ArrayList<>();

        Student student1 = new Student(id, "Siim Sink");
        Grade grade1 = new Grade(1, 4, Objects.requireNonNullElse(subject, "esta"), LocalDateTime.now(),1);
        Grade grade2 = new Grade(2, 5, Objects.requireNonNullElse(subject, "mata"), LocalDateTime.now(), 1);

        grades.add(grade1);
        grades.add(grade2);
        student1.setGradeList(grades);
        return student1;
    }
}
