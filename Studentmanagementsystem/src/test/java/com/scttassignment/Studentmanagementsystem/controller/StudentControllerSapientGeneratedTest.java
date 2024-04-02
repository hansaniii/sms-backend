package com.scttassignment.Studentmanagementsystem.controller;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import com.scttassignment.Studentmanagementsystem.dto.StudentDTO;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;

import com.scttassignment.Studentmanagementsystem.service.StudentService;
import org.springframework.http.HttpStatus;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class StudentControllerSapientGeneratedTest {

    private final StudentService studentServiceMock = mock(StudentService.class, "studentService");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private StudentController target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${b16cf963-bd08-3c59-96d4-1049f90b3668}, hash: BF1025BBA8942AA98CC8FED71073B992
    @Test()
    void getStudentTest() {
        //Arrange Statement(s)
        target = new StudentController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        List<StudentDTO> studentDTOList = new ArrayList<>();
        doReturn(studentDTOList).when(studentServiceMock).getAllStudents();

        //Act Statement(s)
        List<StudentDTO> result = target.getStudent();

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(studentDTOList));
            verify(studentServiceMock).getAllStudents();
        });
    }

    //Sapient generated method id: ${45048d42-8595-3e6d-ab08-eb74afa5978e}, hash: 237A29F70409D9A698C7032FE55AD46C
    @Test()
    void saveStudentWhenStudentServiceRegisterStudentStudentDTO() {
        /* Branches:* (studentService.registerStudent(studentDTO)) : true*/
        //Arrange Statement(s)
        target = new StudentController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        StudentDTO studentDTOMock = mock(StudentDTO.class);
        doReturn(true).when(studentServiceMock).registerStudent(studentDTOMock);

        //Act Statement(s)
        ResponseEntity<String> result = target.saveStudent(studentDTOMock);
        ResponseEntity<String> responseEntity = ResponseEntity.ok("Registration successful");

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(responseEntity));
            verify(studentServiceMock).registerStudent(studentDTOMock);
        });
    }

    //Sapient generated method id: ${4cae9bc7-628b-3b46-ba85-b8cd20471533}, hash: 9F484B5F8708BAD28C3300A9A41FB055
    @Test()
    void saveStudentWhenStudentServiceNotRegisterStudentStudentDTO() {
        /* Branches:* (studentService.registerStudent(studentDTO)) : false*/
        //Arrange Statement(s)
        target = new StudentController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        StudentDTO studentDTOMock = mock(StudentDTO.class);
        doReturn(false).when(studentServiceMock).registerStudent(studentDTOMock);

        //Act Statement(s)
        ResponseEntity<String> result = target.saveStudent(studentDTOMock);
        ResponseEntity.BodyBuilder bodyBuilder = ResponseEntity.status(HttpStatus.BAD_REQUEST);
        ResponseEntity<String> responseEntity = bodyBuilder.body("Email already exists");

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(responseEntity));
            verify(studentServiceMock).registerStudent(studentDTOMock);
        });
    }

    //Sapient generated method id: ${e7caf34e-ce5b-31a9-94d0-abd5253c6d65}, hash: 8906E1CF0B60D909F4F68402FEB9B5E8
    @Test()
    void updateStudentTest() {
        //Arrange Statement(s)
        target = new StudentController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        StudentDTO studentDTOMock = mock(StudentDTO.class);
        StudentDTO studentDTOMock2 = mock(StudentDTO.class);
        doReturn(studentDTOMock).when(studentServiceMock).updateStudent(studentDTOMock2);

        //Act Statement(s)
        StudentDTO result = target.updateStudent(studentDTOMock2);

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(studentDTOMock));
            verify(studentServiceMock).updateStudent(studentDTOMock2);
        });
    }

    //Sapient generated method id: ${95afc210-99c9-307b-ba34-d62663ccfa84}, hash: 831F00D61D72613F42205A3A9D17E517
    @Test()
    void removeStudentByindexnoTest() {
        //Arrange Statement(s)
        target = new StudentController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doNothing().when(studentServiceMock).removeStudentByindexno("indexno1");

        //Act Statement(s)
        target.removeStudentByindexno("indexno1");

        //Assert statement(s)
        assertAll("result", () -> verify(studentServiceMock).removeStudentByindexno("indexno1"));
    }
}
