package com.scttassignment.Studentmanagementsystem.repository;


import com.scttassignment.Studentmanagementsystem.entity.course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository <course,Integer> {
}
