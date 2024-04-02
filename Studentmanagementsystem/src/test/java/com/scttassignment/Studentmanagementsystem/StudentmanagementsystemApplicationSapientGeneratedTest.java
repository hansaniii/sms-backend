package com.scttassignment.Studentmanagementsystem;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class StudentmanagementsystemApplicationSapientGeneratedTest {

    //Sapient generated method id: ${c429d1dc-d862-3023-be0b-28224bb13859}, hash: 61DA1D2DEF3D0902D262E720A86DCD16
    @Test()
    void modelMapperTest() {
        //Arrange Statement(s)
        StudentmanagementsystemApplication target = new StudentmanagementsystemApplication();

        //Act Statement(s)
        ModelMapper result = target.modelMapper();

        //Assert statement(s)
        //TODO: Please implement equals method in ModelMapper for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
