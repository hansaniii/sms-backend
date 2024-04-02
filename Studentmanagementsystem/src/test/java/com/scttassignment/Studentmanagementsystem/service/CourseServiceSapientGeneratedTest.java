package com.scttassignment.Studentmanagementsystem.service;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import com.scttassignment.Studentmanagementsystem.entity.course;
import com.scttassignment.Studentmanagementsystem.dto.CourseDTO;
import org.modelmapper.ModelMapper;
import org.mockito.MockitoAnnotations;
import com.scttassignment.Studentmanagementsystem.repository.CourseRepo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CourseServiceSapientGeneratedTest {

    private final ModelMapper modelMapperMock = mock(ModelMapper.class, "modelMapper");

    private final CourseRepo courseRepoMock = mock(CourseRepo.class, "courseRepo");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private CourseService target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${79460233-83cf-3d23-b1a5-33a0e06ec78c}, hash: 9382D367EF191DCC83A2FF09975E2BF3
    @Disabled()
    @Test()
    void saveCourseTest() {
        //Arrange Statement(s)
        target = new CourseService();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        course courseMock = mock(course.class);
        CourseDTO courseDTOMock = mock(CourseDTO.class);
        doReturn(courseMock).when(modelMapperMock).map(courseDTOMock, course.class);
        Object object = new Object();
        doReturn(object).when(courseRepoMock).save(courseMock);
        //Act Statement(s)
        CourseDTO result = target.saveCourse(courseDTOMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(courseDTOMock));
            verify(modelMapperMock).map(courseDTOMock, course.class);
            verify(courseRepoMock).save(courseMock);
        });
    }
}
