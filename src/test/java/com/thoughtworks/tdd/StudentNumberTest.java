package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class StudentNumberTest {
    @Test
    public void shoulde_return_1_when_call_number_given_1(){
        //given
        String expectedResult="1";

        //when
        String actual=Student.number(1);

        //then
        assertThat(actual, is(expectedResult));
    }

    @Test
    public void should_return_Fizz_when_call_number_given_3() {
        //given
        String expectedResult="Fizz";

        //when
        String actual=Student.number(3);

        //then
        assertThat(actual, is(expectedResult));
    }



}
