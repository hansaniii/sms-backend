package com.scttassignment.Studentmanagementsystem.controller;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import com.scttassignment.Studentmanagementsystem.service.AdminService;
import org.springframework.http.ResponseEntity;
import org.mockito.MockitoAnnotations;
import com.scttassignment.Studentmanagementsystem.dto.AdminDTO;
import org.springframework.http.HttpStatus;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class AdminControllerSapientGeneratedTest {

    private final AdminService adminServiceMock = mock(AdminService.class, "adminService");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private AdminController target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${44f00673-e6a8-39d4-849c-3bc2696304ce}, hash: 064F7B458F01BC7FEB6C37648ADB21EF
    @Test()
    void getUserTest() {
        //Arrange Statement(s)
        target = new AdminController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);

        //Act Statement(s)
        String result = target.getUser();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("Simple-Root")));
    }

    //Sapient generated method id: ${d132b5ec-c137-390d-a389-0ea5e3ffedf1}, hash: DAE0820EA25398EF34574FC20BF22901
    @Test()
    void saveAdminWhenAdminServiceRegisterAdminAdminDTO() {
        /* Branches:* (adminService.registerAdmin(adminDTO)) : true*/
        //Arrange Statement(s)
        target = new AdminController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        AdminDTO adminDTOMock = mock(AdminDTO.class);
        doReturn(true).when(adminServiceMock).registerAdmin(adminDTOMock);

        //Act Statement(s)
        ResponseEntity<String> result = target.saveAdmin(adminDTOMock);
        ResponseEntity<String> responseEntity = ResponseEntity.ok("Registration successful");

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(responseEntity));
            verify(adminServiceMock).registerAdmin(adminDTOMock);
        });
    }

    //Sapient generated method id: ${9828baba-9a49-3162-9d48-db12edb95ac7}, hash: D5ECE6EF38B98DE5B6AAC240AC8A8CBB
    @Test()
    void saveAdminWhenAdminServiceNotRegisterAdminAdminDTO() {
        /* Branches:* (adminService.registerAdmin(adminDTO)) : false*/
        //Arrange Statement(s)
        target = new AdminController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        AdminDTO adminDTOMock = mock(AdminDTO.class);
        doReturn(false).when(adminServiceMock).registerAdmin(adminDTOMock);

        //Act Statement(s)
        ResponseEntity<String> result = target.saveAdmin(adminDTOMock);
        ResponseEntity.BodyBuilder bodyBuilder = ResponseEntity.status(HttpStatus.BAD_REQUEST);
        ResponseEntity<String> responseEntity = bodyBuilder.body("Email already exists");

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(responseEntity));
            verify(adminServiceMock).registerAdmin(adminDTOMock);
        });
    }

    //Sapient generated method id: ${7c2a5400-a846-3701-9d1a-238eeeedf98e}, hash: 6C07B0EEB17D2CFE1536449D3FE19C2E
    @Test()
    void loginAdminWhenAdminServiceAuthenticateAdminKduemailPassword() {
        /* Branches:* (adminService.authenticateAdmin(kduemail, password)) : true*/
        //Arrange Statement(s)
        target = new AdminController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(true).when(adminServiceMock).authenticateAdmin("kduemail1", "password1");
        AdminDTO adminDTO = new AdminDTO();
        adminDTO.setPassword("password1");
        adminDTO.setKduemail("kduemail1");

        //Act Statement(s)
        ResponseEntity<String> result = target.loginAdmin(adminDTO);
        ResponseEntity.BodyBuilder bodyBuilder = ResponseEntity.ok();
        ResponseEntity<String> responseEntity = bodyBuilder.body("Logged Successfully");

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(responseEntity));
            verify(adminServiceMock).authenticateAdmin("kduemail1", "password1");
        });
    }

    //Sapient generated method id: ${ad5cf4ed-fc1d-3b39-b5ac-032d866c32d2}, hash: F52A077ED0716EC00C4BF2BB21C8D606
    @Test()
    void loginAdminWhenAdminServiceNotAuthenticateAdminKduemailPassword() {
        /* Branches:* (adminService.authenticateAdmin(kduemail, password)) : false*/
        //Arrange Statement(s)
        target = new AdminController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(false).when(adminServiceMock).authenticateAdmin("kduemail1", "password1");
        AdminDTO adminDTO = new AdminDTO();
        adminDTO.setPassword("password1");
        adminDTO.setKduemail("kduemail1");

        //Act Statement(s)
        ResponseEntity<String> result = target.loginAdmin(adminDTO);
        ResponseEntity.BodyBuilder bodyBuilder = ResponseEntity.status(HttpStatus.UNAUTHORIZED);
        ResponseEntity<String> responseEntity = bodyBuilder.body("Invalid email or password");

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(responseEntity));
            verify(adminServiceMock).authenticateAdmin("kduemail1", "password1");
        });
    }

    //Sapient generated method id: ${3245ff6f-060f-38e1-8ad3-d4224ece5568}, hash: 7D3A3C148A89BC94A4D219B17F680F25
    @Test()
    void updateAdminTest() {
        //Arrange Statement(s)
        target = new AdminController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);

        //Act Statement(s)
        String result = target.updateAdmin();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("user Updated!")));
    }

    //Sapient generated method id: ${950841ef-fd83-3b8d-b1d6-7ec5259b7fb7}, hash: C9AC208F73B1D4235DEEFED3D382461A
    @Test()
    void deleteAdminTest() {
        //Arrange Statement(s)
        target = new AdminController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);

        //Act Statement(s)
        String result = target.deleteAdmin();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("User Deleted!")));
    }
}
