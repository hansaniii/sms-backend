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
public class course {
    @Id
    private String moduleid;
    private String modulename;
    private int semester;
    private String elective;
}
