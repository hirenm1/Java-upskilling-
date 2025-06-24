package com.sparta.hm.basics.oop;

public abstract class Shape implements Moveable {
    public abstract int calculateArea();

    @Override
    public String toString() {
        return getClass().getName() + " Area: " + calculateArea();
    }
}



