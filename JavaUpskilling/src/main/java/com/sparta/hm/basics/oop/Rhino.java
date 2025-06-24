package com.sparta.hm.basics.oop;

public class Rhino extends Animal{

    private int weight;
    public Rhino(String petname, int weight, int year, int month, int day) {
        super(petname, year, month, day);
        this.weight = weight;

    }

    public String getWeight(){
        return weight + "KG";
    }

    @Override
    public String Speak() {
        return "mooo";


    }

    @Override
    public String toString() {
        return super.toString() + "My favourite sound is" + Speak();
    }

    @Override
    public String eat() {
        return "I am eating cows";
    }
}
