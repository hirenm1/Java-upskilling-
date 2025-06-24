package MoreJunit;

import com.sparta.hm.basics.oop.Member;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class memberTest {

    //First
    //F- Fast
    //I - Independent
    //R - Repeatable
     //S - Self Checking
     //T - Timely

    //@BeforeAll - methods with this annotation will run before all your tests (run once and then all tests run)
     //@AfterAll - your tests will run, Then the method with @Afterall annotation will then run
     //@BeforeEach - methods with this attribute will run BEFORE each Test method
     //@AfterEach methpds with this attribute will run AFTER each test method

    @Test
    @DisplayName("getMemberDays return the correct number of days since joining")
    //@Disabled
    public void getMemberDaysTest(){
        // Arrange
        var today = LocalDate.now();
        var joinDate = today.minusDays(4);
        Member sut = new Member("Nish", "Mandal",joinDate.getYear(), joinDate.getMonth().getValue(), joinDate.getDayOfMonth());
        // Act (call the method under tests)
        var result = sut.getMemberDays();
        Assertions.assertEquals(1, result);
    }


}
