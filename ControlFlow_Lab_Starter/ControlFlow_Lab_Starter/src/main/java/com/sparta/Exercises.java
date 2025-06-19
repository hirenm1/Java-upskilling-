package com.sparta;

public class Exercises {

    // Question 1 change this method so that it uses the ternary operator ?
    public static String getForecast(int temp) {
        return (temp < 15) ? "It's cold" : "It's hot";
    }

    // Question 2
    // returns the average of the array nums
    public static double average(int[] nums)
    {
        return -1;
    }

    // Question 3

    // returns the type of ticket a customer is eligible for based on their age
    // "Standard" if they are between 18 and 59 inclusive
    // "OAP" if they are 60 or over
    // "Student" if they are 13-17 inclusive
    // "Child" if they are 5-12
    // "Free" if they are under 5
    public static String ticketType(int age)
    {
        if (age >= 60){
            return "OAP";}
        else if (age >= 18)
            return "Standard";
        else if (age >= 13)
            return "Student";
        else if (age >= 5)
            return "Child";
        else
            return "Free";
    }

    // Question 4
    public static String grade(int mark)
    {
        var grade = "";

        if (mark >= 75 && mark <= 100)
            grade = "Pass with Distinction";
        else if (mark >= 60 && mark <= 74)
            grade = "Pass with Merit";
        else if (mark >= 40 && mark <= 59)
            grade = "Pass";
        else if (mark >= 0 && mark <= 39)
            grade = "Fail";
        else
            grade = "Invalid mark";

        return grade;
    }

    // Question 5
    public static int getScottishMaxWeddingNumber(int covidLevel)
    {
        return 0;
    }
}
