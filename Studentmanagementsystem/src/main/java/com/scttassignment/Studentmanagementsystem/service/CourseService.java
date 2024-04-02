package com.scttassignment.Studentmanagementsystem.service;

import com.scttassignment.Studentmanagementsystem.dto.CourseDTO;
import com.scttassignment.Studentmanagementsystem.entity.course;
import com.scttassignment.Studentmanagementsystem.repository.CourseRepo;

import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CourseService {
    @Autowired
    private CourseRepo courseRepo;
    @Autowired
    private ModelMapper modelMapper;
    public CourseDTO saveCourse(CourseDTO courseDTO){
        courseRepo.save(modelMapper.map(courseDTO, course.class));
        return courseDTO;
    }
}

