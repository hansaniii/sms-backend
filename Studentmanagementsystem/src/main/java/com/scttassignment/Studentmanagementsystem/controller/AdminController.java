package com.scttassignment.Studentmanagementsystem.controller;

import com.scttassignment.Studentmanagementsystem.dto.AdminDTO;
import com.scttassignment.Studentmanagementsystem.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/admin")
@CrossOrigin
public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping("/getAdmin")
    public String getUser() {
        return "Simple-Root";
    }

    @PostMapping("/saveAdmin")
    ResponseEntity<String> saveAdmin(@RequestBody AdminDTO adminDTO) {
        if (adminService.registerAdmin(adminDTO)) {
            return ResponseEntity.ok("Registration successful");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Email already exists");
        }
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginAdmin(@RequestBody AdminDTO adminDTO) {
        String kduemail = adminDTO.getKduemail();
        String password = adminDTO.getPassword();
        if (adminService.authenticateAdmin (kduemail,password)) {
            return ResponseEntity.ok().body("Logged Successfully");
        }
        else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid email or password");
        }
    }

    @PutMapping("/updateAdmin")
    public String updateAdmin() {
        return "user Updated!";
    }

    @DeleteMapping("/deleteAdmin")
    public String deleteAdmin() {
        return "User Deleted!";
    }

}
