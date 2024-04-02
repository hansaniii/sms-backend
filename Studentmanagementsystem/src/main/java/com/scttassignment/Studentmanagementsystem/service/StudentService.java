package com.scttassignment.Studentmanagementsystem.service;

import com.scttassignment.Studentmanagementsystem.dto.StudentDTO;
import com.scttassignment.Studentmanagementsystem.entity.student;
import com.scttassignment.Studentmanagementsystem.repository.StudentRepository;

import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private ModelMapper modelMapper;

    public boolean registerStudent(StudentDTO studentDTO) {
        Optional<student> existingStudent = studentRepository.findByEmail(studentDTO.getEmail());
        if (existingStudent.isPresent()) {
            return false; // Email already exists
        }
        student stud = modelMapper.map(studentDTO, student.class);
        studentRepository.save(stud);
        return true;
    }
   @Transactional
    public boolean authenticateStudent(String email, String password) {
        Optional<student> studentOptional = studentRepository.findByEmail(email);
        return studentOptional.isPresent();
    }
    @Transactional
    public List<StudentDTO> getAllStudents() {
        List<student> studentList = studentRepository.findAll();
        return modelMapper.map(studentList, new TypeToken<List<StudentDTO>>() {
        }.getType());
    }
    @Transactional
    public StudentDTO updateStudent(StudentDTO studentDTO) {
        studentRepository.save(modelMapper.map(studentDTO, student.class));
        return studentDTO;
    }
    @Transactional
    public void removeStudentByindexno(String indexno) {
        studentRepository.deleteByIndexno(indexno);
    }
}


