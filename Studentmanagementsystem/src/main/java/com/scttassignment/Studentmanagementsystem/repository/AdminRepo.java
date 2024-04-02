package com.scttassignment.Studentmanagementsystem.repository;
import com.scttassignment.Studentmanagementsystem.entity.admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminRepo extends JpaRepository <admin,Long> {
    Optional<admin> findByEmailAndPassword (String kduemail, String password);
    Optional<admin> findByEmail(String kduemail);


}
