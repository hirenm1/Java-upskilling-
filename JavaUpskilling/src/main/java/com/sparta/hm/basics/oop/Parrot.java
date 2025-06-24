package com.sparta.hm.basics.oop;

public class Parrot extends Animal{
    private String favouriteFood;
    public Parrot(String petname, String favouriteFood, int year, int month, int day) {
        super(petname, year, month, day);
        this.favouriteFood = favouriteFood;
    }

public String getFavouriteFood() {
        return favouriteFood;

}

    @Override
    public String Speak() {
        return "Squark";
    }

    @Override
    public String toString() {
        return getPetname() + " is " + getAge() + "years old" + "My favourite sound is" + Speak();
    }

    @Override
    public String eat() {
        return "I am eating" + getFavouriteFood();
    }
}
