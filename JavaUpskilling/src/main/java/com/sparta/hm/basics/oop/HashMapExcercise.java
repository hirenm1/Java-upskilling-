package com.sparta.hm.basics.oop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashMapExcercise {
    public static void main(String[] args) {
        var result = makeFiveSet(21);
        System.out.println(result);

        var result1 = longWordList("Hi my name is Hiren and I like to eat paneer");
        System.out.println(result1);
    }
    public static HashSet<Integer> makeFiveSet (int max){
        HashSet<Integer>  divisByFive = new HashSet<Integer>();
        for (int i = 1; i <= max; i++) {
            if (i % 5 == 0) {
                divisByFive.add(i);
            }
        }

       return divisByFive;
    }

public static List<String> longWordList(String phrase) {
    ArrayList<String> result = new ArrayList<String>();
    var words = phrase.split(" ");

    for (String word: words) {
        if (word.length() >= 5) {
            result.add(word);
        }
    }

    return result;
    }
}
