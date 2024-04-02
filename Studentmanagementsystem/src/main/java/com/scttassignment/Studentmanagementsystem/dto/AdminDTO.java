package com.scttassignment.Studentmanagementsystem.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AdminDTO {

    private String firstname;
    private String lastname;
    private int nic;
    private String dob;
    private String address;
    private String email;
    private String kduemail;
    private String regdate;
    @Column(nullable = false)
    private String password;
}
