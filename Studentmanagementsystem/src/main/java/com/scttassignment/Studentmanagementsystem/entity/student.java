package com.scttassignment.Studentmanagementsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class student {
    @Id
    private int id;
    private String firstname;
    private String lastname;
    private long nic;
    private String dob;
    private String address;
    private String email;
    private String kduemail;
    private int intake;
    private String indexno;
    private int semester;


}
