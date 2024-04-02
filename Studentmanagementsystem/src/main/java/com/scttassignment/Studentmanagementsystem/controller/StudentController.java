package com.scttassignment.Studentmanagementsystem.controller;

import com.scttassignment.Studentmanagementsystem.dto.StudentDTO;
import com.scttassignment.Studentmanagementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/getStudent")
    public List<StudentDTO> getStudent() {
        return studentService.getAllStudents();
    }

    @PostMapping("/saveStudent")
    public ResponseEntity<String> saveStudent(@RequestBody StudentDTO studentDTO) {
        if (studentService.registerStudent(studentDTO)) {
            return ResponseEntity.ok("Registration successful");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Email already exists");
        }
    }


    @PutMapping("/updateStudent")
    public StudentDTO updateStudent(@RequestBody StudentDTO studentDTO) {
        return studentService.updateStudent(studentDTO);
    }

    @DeleteMapping("/removeStudent/{indexno}")
    public void removeStudentByindexno(String indexno) {
        studentService.removeStudentByindexno(indexno);

    }
}