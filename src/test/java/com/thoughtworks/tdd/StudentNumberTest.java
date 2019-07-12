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

    @Test
    public void should_return_Buzz_when_call_number_given_5() {
        //given
        String expectedResult="Buzz";

        //when
        String actual=Student.number(5);

        //then
        assertThat(actual, is(expectedResult));
    }
    @Test
    public void should_return_Whizz_when_call_number_given_7() {
        //given
        String expectedResult="Whizz";

        //when
        String actual=Student.number(7);

        //then
        assertThat(actual, is(expectedResult));
    }
    @Test
    public void should_return_Fizz_when_call_number_given_13() {
        //given
        String expectedResult="Fizz";

        //when
        String actual=Student.number(13);

        //then
        assertThat(actual, is(expectedResult));
    }
    @Test
    public void should_return_FizzBuzz_when_call_number_given_15() {
        //given
        String expectedResult="FizzBuzz";

        //when
        String actual=Student.number(15);

        //then
        assertThat(actual, is(expectedResult));
    }
    @Test
    public void should_return_FizzWhizz_when_call_number_given_21() {
        //given
        String expectedResult="FizzWhizz";

        //when
        String actual=Student.number(21);

        //then
        assertThat(actual, is(expectedResult));
    }
    @Test
    public void should_return_BuzzWhizz_when_call_number_given_35() {
        //given
        String expectedResult="BuzzWhizz";

        //when
        String actual=Student.number(35);

        //then
        assertThat(actual, is(expectedResult));
    }



}
