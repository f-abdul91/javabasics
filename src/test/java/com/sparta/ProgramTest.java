package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {

    @Test
    @DisplayName("My First Test")
    public void firstTest(){
        Assertions.assertTrue(5 == 5);
    }

    @Test
    @DisplayName("For 21, return Good evening")
    public void given21_Greeting_ReturnsGoodEvening(){
        int time = 21;
        String expectedGreeting = "Good evening!";
        String result = Program.greeting(time);
        Assertions.assertEquals(expectedGreeting, result);
    }

    @Test
    @DisplayName("Boundary case: For 12, return Good afternoon")
    public void given12_Greeting_ReturnsGoodAfternoon(){
        int time = 12;
        String expectedGreeting = "Good afternoon!";
        String result = Program.greeting(time);
        Assertions.assertEquals(expectedGreeting, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 8, 11})
    @DisplayName("Given times that are before noon, greeting returns Good morning")
    public void GivenTimesThatAreBeforeNoon_Greeting_ReturnGoodMorning(int time){
        String expected = "Good morning!";
        String result = Program.greeting(time);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {12, 15, 17})
    @DisplayName("Given times that are after noon, greeting returns Good afternoon")
    public void GivenTimesThatAreAfterNoon_Greeting_ReturnGoodAfternoon(int time){
        String expected = "Good afternoon!";
        String result = Program.greeting(time);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {18, 21, 23})
    @DisplayName("Given times that are after five, greeting returns Good evening")
    public void GivenTimesThatAreAfterFive_Greeting_ReturnGoodEvening(int time){
        String expected = "Good evening!";
        String result = Program.greeting(time);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {-5, 25, 312})
    @DisplayName("Given times that outside the scope of the 24 hour clock, greeting returns empty String")
    public void GivenTimesThatAreOutsideScope_Greeting_ReturnEmptyString(int time){
        String expected = "Enter a real hour!";
        String result = Program.greeting(time);
        Assertions.assertEquals(expected, result);
    }
}