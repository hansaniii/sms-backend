package com.scttassignment.Studentmanagementsystem.service;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.mockito.MockitoAnnotations;
import com.scttassignment.Studentmanagementsystem.entity.admin;

import java.util.Optional;

import com.scttassignment.Studentmanagementsystem.repository.AdminRepo;
import com.scttassignment.Studentmanagementsystem.dto.AdminDTO;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class AdminServiceSapientGeneratedTest {

    private final AdminRepo adminRepoMock = mock(AdminRepo.class, "adminRepo");

    private final ModelMapper modelMapperMock = mock(ModelMapper.class, "modelMapper");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private AdminService target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${f2f9d975-3344-3592-8df1-e3423138bee3}, hash: FADE7D60CCAE32BDD189EC9AF5D82910
    @Test()
    void registerAdminWhenExistingAdminIsPresent() {
        /* Branches:* (existingAdmin.isPresent()) : true*/
        //Arrange Statement(s)
        target = new AdminService();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        admin adminMock = mock(admin.class);
        doReturn(Optional.of(adminMock)).when(adminRepoMock).findByEmail("email1");
        AdminDTO adminDTO = new AdminDTO();
        adminDTO.setEmail("email1");

        //Act Statement(s)
        boolean result = target.registerAdmin(adminDTO);

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(adminRepoMock).findByEmail("email1");
        });
    }

    //Sapient generated method id: ${3e8bfd5c-7fd0-33a9-a878-4cf4a270ba9b}, hash: 16269370592E18AA15131D5458861B04
    @Test()
    void registerAdminWhenExistingAdminNotIsPresent() {
        /* Branches:* (existingAdmin.isPresent()) : false*/
        //Arrange Statement(s)
        target = new AdminService();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(Optional.empty()).when(adminRepoMock).findByEmail("email1");
        admin adminMock = mock(admin.class);
        AdminDTO adminDTO = new AdminDTO();
        adminDTO.setEmail("email1");
        doReturn(adminMock).when(modelMapperMock).map(adminDTO, admin.class);
        Object object = new Object();
        doReturn(object).when(adminRepoMock).save(adminMock);

        //Act Statement(s)
        boolean result = target.registerAdmin(adminDTO);

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(adminRepoMock).findByEmail("email1");
            verify(modelMapperMock).map(adminDTO, admin.class);
            verify(adminRepoMock).save(adminMock);
        });
    }
}
