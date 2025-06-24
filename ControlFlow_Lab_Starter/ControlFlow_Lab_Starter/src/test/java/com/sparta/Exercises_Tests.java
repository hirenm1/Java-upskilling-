package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Exercises_Tests {
    @Test
    @DisplayName("Given a temperature less than 15, getForecast returns It's cold")
    public void getForecast_Cold() {
        Assertions.assertEquals("It's cold", Exercises.getForecast(14) );
    }

    @Test
    @DisplayName("Given a temperature of 15, getForecast returns It's hot")
    public void getForecast_Hot() {
        Assertions.assertEquals("It's hot", Exercises.getForecast(15) );
    }

    @Test
    @DisplayName("Given a temperature over 15, getForecast returns It's hot")
    public void getForecast_Over15_Hot() {
        Assertions.assertEquals("It's hot", Exercises.getForecast(125));
    }
    @Test
    @DisplayName("Average returns correct average")
    public void Average_ReturnsCorrectAverage()
    {
        int[] nums = { 3, 8, 1, 7, 3 };
        Assertions.assertEquals(4.4, Exercises.average(nums));
    }

    @Test
    @DisplayName(("When the Array is empty average returns zero"))
    public void WhenArrayIsEmpty_Average_ReturnsZero()
    {
        int[] nums = {  };
        Assertions.assertEquals(0, Exercises.average(nums));
    }

    @ParameterizedTest
    @CsvSource( {
            "100, OAP",
            "60, OAP",
            "59, Standard",
            "18, Standard",
            "17, Student",
            "13, Student",
            "12, Child",
            "5, Child",
            "4, Free",
            "0, Free"
    })
    @DisplayName("Testing ticket types by age")
    public void TicketTypeTest(int age, String expected)
    {
        var result = Exercises.ticketType(age);
        Assertions.assertEquals(expected, result);
    }

    // write unit tests for the 'Grade' method here

    @ParameterizedTest
    @CsvSource({
            "100, Pass with Distinction",
            "75, Pass with Distinction",
            "74, Pass with Merit",
            "60, Pass with Merit",
            "59, Pass",
            "40, Pass",
            "39, Fail",
            "0, Fail"
    })
    public void gradeTest(int mark, String expected) {
        assertEquals(expected, Exercises.grade(mark));
    }


    // write unit tests for the Scottish wedding example here

    public class ScottishWeddingTest {

        @Test
        public void testLevel4() {
            assertEquals(20, ScottishWedding.getMaxAttendees(4));
        }

        @Test
        public void testLevel3() {
            assertEquals(50, ScottishWedding.getMaxAttendees(3));
        }

        @Test
        public void testLevel2() {
            assertEquals(50, ScottishWedding.getMaxAttendees(2));
        }

        @Test
        public void testLevel1() {
            assertEquals(100, ScottishWedding.getMaxAttendees(1));
        }

        @Test
        public void testLevel0() {
            assertEquals(200, ScottishWedding.getMaxAttendees(0));
        }

        @Test
        public void testInvalidLevelThrowsException() {
            assertThrows(IllegalArgumentException.class, () -> ScottishWedding.getMaxAttendees(-1));
            assertThrows(IllegalArgumentException.class, () -> ScottishWedding.getMaxAttendees(5));
        }
    }

}
