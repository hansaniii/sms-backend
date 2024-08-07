package com.scttassignment.Studentmanagementsystem.service;

import com.scttassignment.Studentmanagementsystem.dto.UserDTO;
import com.scttassignment.Studentmanagementsystem.entity.User;
import com.scttassignment.Studentmanagementsystem.repository.UserRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ModelMapper modelMapper;
    public UserDTO saveUser(UserDTO userDTO){
        userRepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }
}
