package com.scttassignment.Studentmanagementsystem.repository;

import com.scttassignment.Studentmanagementsystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {

}
