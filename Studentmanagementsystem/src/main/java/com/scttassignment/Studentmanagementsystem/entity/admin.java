package com.scttassignment.Studentmanagementsystem.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class admin {

    private String firstname;
    private String lastname;
    @Id
    private int nic;
    private String dob;
    private String address;
    private String email;
    private String kduemail;
    private String regdate;
    @Column(nullable = false)
    private String password;
}
