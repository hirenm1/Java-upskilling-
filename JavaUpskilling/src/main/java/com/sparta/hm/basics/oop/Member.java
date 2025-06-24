package com.sparta.hm.basics.oop;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Member implements Moveable, Eatable {
    //private fields

    private String firstname;
    private String lastname;
    private LocalDate joinDate;

    //public methods to expose the private fields we want
    //Ctor - they are a special method
    // Must have the same name as the class
    // No return type is stated, because it returns the Class as a type

    public Member(String firstname, String lastname, int year, int month,int day){
        this.firstname = firstname;
        this.lastname = lastname;
        this.joinDate = LocalDate.of(year, month, day);
    }
// COMPARING THE JOIN DATE TO NOW, AND GIVING THE DIFFERENCE IN DAYS
    public long getMemberDays(){
        return joinDate.until(LocalDate.now(), ChronoUnit.DAYS);
    }

    public Member(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFullName() {
        return firstname + " " + lastname;
    }
        @Override
                public String toString() {
            return getFullName() + "has been a member for" + getMemberDays() + "days.";
        }


    @Override
    public String move() {
        return "I am moving!";
    }

    @Override
    public String eat() {
        return "I am eating fries";
    }
@Override
    public int hashCode() {
        return Objects.hash(firstname, lastname,joinDate);
}
}
