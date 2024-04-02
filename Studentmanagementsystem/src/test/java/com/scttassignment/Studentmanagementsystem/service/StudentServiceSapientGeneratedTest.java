package com.scttassignment.Studentmanagementsystem.service;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import com.scttassignment.Studentmanagementsystem.dto.StudentDTO;
import com.scttassignment.Studentmanagementsystem.repository.StudentRepository;
import org.modelmapper.ModelMapper;
import org.mockito.MockitoAnnotations;

import java.lang.reflect.Type;

import com.scttassignment.Studentmanagementsystem.entity.student;

import java.util.ArrayList;
import java.util.Optional;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class StudentServiceSapientGeneratedTest {

    private final StudentRepository studentRepositoryMock = mock(StudentRepository.class, "studentRepository");

    private final ModelMapper modelMapperMock = mock(ModelMapper.class, "modelMapper");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private StudentService target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${23b5bbcd-4651-34d2-b3de-84355653612a}, hash: 936C5068FFEFD52E190C32F603C30266
    @Test()
    void registerStudentWhenExistingStudentIsPresent() {
        /* Branches:* (existingStudent.isPresent()) : true*/
        //Arrange Statement(s)
        target = new StudentService();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        student studentMock = mock(student.class);
        doReturn(Optional.of(studentMock)).when(studentRepositoryMock).findByEmail("email1");
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setEmail("email1");
        //Act Statement(s)
        boolean result = target.registerStudent(studentDTO);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(studentRepositoryMock).findByEmail("email1");
        });
    }

    //Sapient generated method id: ${4fc19c98-6f82-3a74-9045-21466406c8a7}, hash: 3FAB9258B21882F94F2B3CC82D78457B
    @Disabled()
    @Test()
    void registerStudentWhenExistingStudentNotIsPresent() {
        /* Branches:* (existingStudent.isPresent()) : false*/
        //Arrange Statement(s)
        target = new StudentService();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(Optional.empty()).when(studentRepositoryMock).findByEmail("email1");
        student studentMock = mock(student.class);
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setEmail("email1");
        doReturn(studentMock).when(modelMapperMock).map(studentDTO, student.class);
        Object object = new Object();
        doReturn(object).when(studentRepositoryMock).save(studentMock);
        //Act Statement(s)
        boolean result = target.registerStudent(studentDTO);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(studentRepositoryMock).findByEmail("email1");
            verify(modelMapperMock).map(studentDTO, student.class);
            verify(studentRepositoryMock).save(studentMock);
        });
    }

    //Sapient generated method id: ${cf6a1aa4-4424-3389-8216-b48b53a7dfba}, hash: F0700CFE09692D76140EAF593AF0FFDF
    @Test()
    void authenticateStudentWhenStudentOptionalIsPresent() {
        /* Branches:* (studentOptional.isPresent()) : true*/
        //Arrange Statement(s)
        target = new StudentService();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        student studentMock = mock(student.class);
        doReturn(Optional.of(studentMock)).when(studentRepositoryMock).findByEmail("email1");
        //Act Statement(s)
        boolean result = target.authenticateStudent("email1", "password1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(studentRepositoryMock).findByEmail("email1");
        });
    }

    //Sapient generated method id: ${58e7abf6-0e82-30b1-9c0e-2bff628815df}, hash: EACAB003DF17B7FEF1C79D3A4E890C9D
    @Test()
    void authenticateStudentWhenStudentOptionalNotIsPresent() {
        /* Branches:* (studentOptional.isPresent()) : false*/
        //Arrange Statement(s)
        target = new StudentService();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(Optional.empty()).when(studentRepositoryMock).findByEmail("email1");
        //Act Statement(s)
        boolean result = target.authenticateStudent("email1", "password1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(studentRepositoryMock).findByEmail("email1");
        });
    }

    //Sapient generated method id: ${71ce3aad-56ee-3ddb-adbf-4ba562fdc64b}, hash: 7D24529967A2FC0FCF361FB6635BF4C8
    @Disabled()
    @Test()
    void getAllStudentsTest() {
        /**
         * TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: object of type StudentService.1*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        target = new StudentService();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        List<student> studentList = new ArrayList<>();
        doReturn(studentList).when(studentRepositoryMock).findAll();
        List list = new ArrayList<>();
        Type typeMock = mock(Type.class);
        doReturn(list).when(modelMapperMock).map(studentList, typeMock);
        //Act Statement(s)
        List<StudentDTO> result = target.getAllStudents();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(list));
            verify(studentRepositoryMock).findAll();
            verify(modelMapperMock).map(studentList, typeMock);
        });
    }

    //Sapient generated method id: ${e7caf34e-ce5b-31a9-94d0-abd5253c6d65}, hash: 8463A5A69FC9CC1A37A03BB94FB19F8A
    @Disabled()
    @Test()
    void updateStudentTest() {
        //Arrange Statement(s)
        target = new StudentService();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        student studentMock = mock(student.class);
        StudentDTO studentDTOMock = mock(StudentDTO.class);
        doReturn(studentMock).when(modelMapperMock).map(studentDTOMock, student.class);
        Object object = new Object();
        doReturn(object).when(studentRepositoryMock).save(studentMock);
        //Act Statement(s)
        StudentDTO result = target.updateStudent(studentDTOMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(studentDTOMock));
            verify(modelMapperMock).map(studentDTOMock, student.class);
            verify(studentRepositoryMock).save(studentMock);
        });
    }

    //Sapient generated method id: ${95afc210-99c9-307b-ba34-d62663ccfa84}, hash: 101BE03D384F1BA0661C0EFA9C2DC288
    @Test()
    void removeStudentByindexnoTest() {
        //Arrange Statement(s)
        target = new StudentService();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doNothing().when(studentRepositoryMock).deleteByIndexno("indexno1");
        //Act Statement(s)
        target.removeStudentByindexno("indexno1");
        //Assert statement(s)
        assertAll("result", () -> verify(studentRepositoryMock).deleteByIndexno("indexno1"));
    }
}
