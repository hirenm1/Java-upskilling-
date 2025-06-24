package com.sparta.hm.basics.oop;

public class Baseballmember extends Member{
    public Baseballmember(String firstname, String lastname, int year, int month, int day) {
        super(firstname, lastname, year, month, day);
    }

    public Baseballmember(String firstname, String lastname) {
        super(firstname, lastname);
    }
}
