//package com.sparta.HM;
//
//import com.sparta.hm.Main;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//public class GreetingTest {
//    @Test
//    @DisplayName("My first test")
//    public void firstTest() {
//        Assertions.assertTrue(true);
//
//    }
//
//    @Test
//    @DisplayName("Greating returns good evening with input of 21")
//    public void greeting_ReturnsGoodEvening_input21() {
//        // Arrange
//        int time = 21;
//        String expected = "Good evening!";
//
//        // Act - call method under test
//        String actual = Main.greeting(time);
//
//        // Assert
//        Assertions.assertEquals(expected, actual);
//
//    }
//
//    //Write a test for good morning
//
//    @Test
//    @DisplayName("Greating returns good morning with input of 11")
//    public void greeting_ReturnsGoodMorning_input11() {
//        // Arrange
//        int time = 11;
//        String expected = "Good morning!";
//
//        // Act - call method under test
//        String actual = Main.greeting(time);
//
//        // Assert
//        Assertions.assertEquals(expected, actual);
//
//
//
//
//
//    }
//}