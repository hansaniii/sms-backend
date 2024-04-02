package com.scttassignment.Studentmanagementsystem.repository;

import com.scttassignment.Studentmanagementsystem.entity.student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<student, Long> {

    Optional<student> findByEmail (String kduemail);

    void deleteByIndexno(String indexno);
}
