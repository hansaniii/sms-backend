package com.scttassignment.Studentmanagementsystem.controller;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import com.scttassignment.Studentmanagementsystem.dto.CourseDTO;
import org.mockito.MockitoAnnotations;
import com.scttassignment.Studentmanagementsystem.service.CourseService;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CourseControllerSapientGeneratedTest {

    private final CourseService courseServiceMock = mock(CourseService.class, "courseService");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private CourseController target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${44f00673-e6a8-39d4-849c-3bc2696304ce}, hash: EC2F2B4FDFBCFCFBEF5D720239F3FB03
    @Test()
    void getUserTest() {
        //Arrange Statement(s)
        target = new CourseController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);

        //Act Statement(s)
        String result = target.getUser();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("Simple-Root")));
    }

    //Sapient generated method id: ${79460233-83cf-3d23-b1a5-33a0e06ec78c}, hash: 94D88C6A4B5CA72330A8966996CB6DC6
    @Test()
    void saveCourseTest() {
        //Arrange Statement(s)
        target = new CourseController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        CourseDTO courseDTOMock = mock(CourseDTO.class);
        CourseDTO courseDTOMock2 = mock(CourseDTO.class);
        doReturn(courseDTOMock).when(courseServiceMock).saveCourse(courseDTOMock2);

        //Act Statement(s)
        CourseDTO result = target.saveCourse(courseDTOMock2);

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(courseDTOMock));
            verify(courseServiceMock).saveCourse(courseDTOMock2);
        });
    }

    //Sapient generated method id: ${330c65d9-c121-333c-9889-48d4a6e83aee}, hash: 70A81C6BAD6CD908394E5B5541ACD56E
    @Test()
    void updateCourseTest() {
        //Arrange Statement(s)
        target = new CourseController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);

        //Act Statement(s)
        String result = target.updateCourse();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("user Updated!")));
    }

    //Sapient generated method id: ${77bcbf42-26b6-34af-9aab-6b0562137b40}, hash: 14EE82B347B0CE6E92E39C3762BACF92
    @Test()
    void deleteCourseTest() {
        //Arrange Statement(s)
        target = new CourseController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);

        //Act Statement(s)
        String result = target.deleteCourse();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("User Deleted!")));
    }
}
