package com.scttassignment.Studentmanagementsystem.controller;

import com.scttassignment.Studentmanagementsystem.dto.CourseDTO;
import com.scttassignment.Studentmanagementsystem.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/course")
@CrossOrigin
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/getCourse")
    public String getUser() {
        return "Simple-Root";
    }

    @PostMapping("/saveCourse")
    public CourseDTO saveCourse(@RequestBody CourseDTO courseDTO) {
        return courseService.saveCourse(courseDTO);
    }

    @PutMapping("/updateCourse")
    public String updateCourse() {
        return "user Updated!";
    }

    @DeleteMapping("/deleteCourse")
    public String deleteCourse() {
        return "User Deleted!";
    }

}
