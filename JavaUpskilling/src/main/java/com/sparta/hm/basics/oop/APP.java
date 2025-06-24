//package com.sparta.hm.basics.oop;
//
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.List;
//
//public class APP {
//    public static void main(String[] args) {
////        Member Hiren = new Member ("Hiren", "Modhwadia", 2025, 1, 20);
////
////                System.out.println(Hiren.getFullName());
//
////        Animal Fluffy = new Animal("Fluffy", 2020, 1, 15);
////        System.out.println(Fluffy.getPetname());
////        Fluffy.setPetname("Fluffers");
////        System.out.println(Fluffy.getPetname());
////        System.out.println(Fluffy.getAge());
//
////        Parrot Green = new Parrot("Green", "nuts", 2023, 3, 20);
////        Green.getFavouriteFood();
////        System.out.println(Green.getFavouriteFood());
////
////        Rhino Horn = new Rhino("Horn", 900, 2021, 2, 3);
////        Horn.getWeight();
////        System.out.println(Horn.getWeight())
//
////        Circle  circle = new Circle(5);
////        Rectangle rectangle = new Rectangle(5,10);
////        Shape[] shapes =  {circle, rectangle};
////        for(Shape shape : shapes){
////            System.out.println(shape.calculateArea());
////
////            Parrot birdy = new Parrot("birdy", "walnuts", 2023, 3, 12);
////            Rhino horn = new Rhino("horn", 1000, 2023, 2, 13);
////            Animal[] animals = {birdy, horn};
////
////            for (Animal animal : animals) {
////                System.out.println(animal.toString());
////            }
////        }
////
////        var m1 = new Member("Nish", "Mandal"); // Mem location 1
////        var m2 = new Member("Nish", "Mandal"); // Memory location 2
////        var m3 = m1;
////
////        // By default - objects are compared based on their memory location
////        // We can override the base implementation of equals() so that it comapres firstName and LastName
////        // So that if they're the same, they are considered equal
////        System.out.println(m1.equals(m2));
////        System.out.println(m1.hashCode());
////        System.out.println(m2.hashCode());
////        System.out.println(m3.hashCode());
////
////        // For two objects to be considered equal, .equals() must return true AND the hascodes msut be the same
////        // Hashcodes are used in some collections as a key
////
////        Parrot Rocky = new Parrot("birdy", "walnuts", 2023, 3, 12);
////        System.out.println(Rocky.equals(birdy));
//
//        String[] names = {"Hiren", "Dev", "Supriya", "Dunstan"};
//        double[] weights = {22, .0, 51.5};
//        var paul = new Member("Paul", "McCartney");
//        var John = new Member("John", "Lennon");
//        var Ringo = new Member("Ringo", "Starr");
//        var George = new Member("George", "Harrison");
//        Member[] members = {John, paul, Ringo, George};
//
//        for (Member m : members) ;
//        System.out.println(m.getFullName());
//
//        for (double d : weights) {
//            System.out.println(d);
//        }
//
//        for (String s : names) {
//            System.out.println(s);
//
//
//        }
//        //ArrayList
//        ArrayList<Member> membersAL = new ArrayList<Member>();
//        membersAL.add(Paul);
//        membersAL.add(John);
//        membersAL.add(Ringo);
//        membersAL.add(George);
//
//        ArrayList<Member> membersAL2 = new ArrayList<Member>(List.of(Paul, John, Ringo, George));
//
//
//        System.out.println(membersAL.size());
//        System.out.println(membersAL.get(0).getFullName());
//        System.out.println(membersAL.contains(Paul));
//
//        for (Member m : membersAL2) {
//            System.out.println(m.getFullName());
//
//        }
//
//        for (double d : weights) {
//            System.out.println(d);
//        }
//
//        for (String s : names) {
//            System.out.println(s);
//
//
//        }
//
//        // Hashsets
//
//        HashSet<String> membersHs = new HashSet<String>();
//        membersHs.add("Nish");
//        membersHs.add("Nosh");
//    }
//
//
//
//
//    }
//
