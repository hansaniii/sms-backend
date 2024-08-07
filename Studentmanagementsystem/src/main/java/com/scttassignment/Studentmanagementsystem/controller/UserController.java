package com.scttassignment.Studentmanagementsystem.controller;

import com.scttassignment.Studentmanagementsystem.dto.UserDTO;
import com.scttassignment.Studentmanagementsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public String getUser() {
        return "Simple-Root";
    }

    @PostMapping("/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO) {
        return userService.saveUser(userDTO);
    }

    @PutMapping("/updateUser")
    public String updateUser() {
        return "user Updated!";
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser() {
        return "User Deleted!";
    }

}
