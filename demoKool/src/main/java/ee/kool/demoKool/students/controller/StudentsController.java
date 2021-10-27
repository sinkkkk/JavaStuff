package ee.kool.demoKool.students.controller;


import ee.kool.demoKool.grades.dto.Grade;
import ee.kool.demoKool.students.dto.Student;
import ee.kool.demoKool.students.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class StudentsController {

    @Autowired
    StudentService studentService;

    @GetMapping("/v1/student/{id}/grades")
    Student getGrades(@PathVariable Integer id) {
        return (Student) studentService.GetGrades(id);
    }
    @PostMapping("/v1/student/{id}/grades")
    Student postGrade(@PathVariable Integer id, @RequestParam int grade, @RequestParam String subject, @RequestParam Integer semester){
        return (Student) studentService.PostGrade(id, grade, subject, semester);
    }
    @PutMapping("v1/student/{id}/grade/{id2}")
    Grade putGrade(@PathVariable int id, @PathVariable int id2, @RequestParam Grade gradeChange) {
        return studentService.putStudentsGrade(id, id2, gradeChange);
    }
    @DeleteMapping("/v1/student/{id}/grade/{id2}")
    String deleteGrade(@PathVariable Integer id, @PathVariable Integer id2) {
        return "grade "+id+" deleted";
    }
    @GetMapping("v1/students/{id}")
    Student getStudentFilter(@PathVariable int id, @RequestParam String subject) {
        return studentService.getStudentGradeFilter(id, subject);
    }
}
