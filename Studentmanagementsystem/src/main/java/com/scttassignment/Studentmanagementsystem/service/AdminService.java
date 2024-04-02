package com.scttassignment.Studentmanagementsystem.service;

import com.scttassignment.Studentmanagementsystem.dto.AdminDTO;
import com.scttassignment.Studentmanagementsystem.entity.admin;
import com.scttassignment.Studentmanagementsystem.entity.student;
import com.scttassignment.Studentmanagementsystem.repository.AdminRepo;


import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
@Transactional
public class AdminService {
    @Autowired
    private AdminRepo adminRepo;
    @Autowired
    private ModelMapper modelMapper;

    public boolean registerAdmin(AdminDTO adminDTO) {
        Optional<admin> existingAdmin = adminRepo.findByEmail(adminDTO.getEmail());
        if (existingAdmin.isPresent()) {
            return false; // Email already exists
        }
        admin adm = modelMapper.map(adminDTO, admin.class);
        adminRepo.save(adm);
        return true;
    }
    private static final Logger logger = LoggerFactory.getLogger(AdminService.class);
    public boolean authenticateAdmin(String kduemail, String password) {
        try {
            Optional<admin> adminOptional = adminRepo.findByEmailAndPassword(kduemail, password);
            return adminOptional.isPresent();
        } catch (Exception e) {
            logger.error("An error occurred while authenticating admin", e);
            return false; // Return false in case of any exception
        }
    }
}
