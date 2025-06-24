package com.sparta.hm.basics;
//

import java.time.LocalDate;
import java.time.Period;

////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//
public class Main {
           public static void main(String[] args) {
//                int timeOfDay = 21;
//                String result = greeting(timeOfDay);
//                System.out.println(result);
//
//                int sum = add(3,4);
//                System.out.println(sum);
//            }
//
//            public static Integer add(int num1,int num2){
//                int result = num1 + num2;
//                return result;
//            }
//
//
//
//            public static Integer subract(int num1, int num2){
//                int result = num1 - num2;
//                return result;
//            }
//
//                public static String greeting(int timeOfDay) {
//                if(timeOfDay >= 5 && timeOfDay <12 ){
//                    return "Good morning!";
//                } else if (timeOfDay >= 12 && timeOfDay <=18){
//                    return "Good afternoon";
//                } else {
//                    return "Good evening!";
//                }
//
//
//            }
//    public static String getClassificationsByAge(int ageOfViewer)
//    {
//        String result;
//        if (ageOfViewer 0 > < 12)
//        {
//            result = "U, PG & 12 films are available.";
//        }
//        else if (ageOfViewer <= 15)
//        {
//            result = "U, PG, 12 & 15 films are available.";
//        }
//        else
//        {
//            result = "All films are available.";
//        }
//        return result;
//    }
//        }

//Nish's Birthday
LocalDate nishBday = LocalDate.of(1989, 11, 2);
        System.out.println("Nish's birthday is: + nishBday");

//Todays Date
LocalDate today = LocalDate.now();

//calculate the age
Period age = Period.between(nishBday, today);
        System.out.println("Nish is" + age.getYears() + "years old.");

        }
        }

