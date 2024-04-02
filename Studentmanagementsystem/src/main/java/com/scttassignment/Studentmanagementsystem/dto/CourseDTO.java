package com.scttassignment.Studentmanagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CourseDTO {
    private String moduleid;
    private String modulename;
    private int semester;
    private String elective;
}

