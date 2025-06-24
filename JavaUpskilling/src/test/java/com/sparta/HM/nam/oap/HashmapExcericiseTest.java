package com.sparta.HM.nam.oap;

import com.sparta.hm.basics.oop.HashMapExcercise;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashmapExcericiseTest {
    @Test
    public void makeFiveSetReturns4Integers(){
        HashSet<Integer> result = new HashSet<Integer>(List.of(5, 10, 15, 20));
        Assertions.assertEquals(HashMapExcercise.makeFiveSet(21), result);
    }
    @Test
    public void longwordListReturns_Hiren_and_paneer(){
        String phrase = "Hi my name is Hiren and I like to eat Paneer";
        ArrayList<String> result = new ArrayList<String>();
        result.add("Hiren");
        result.add("Paneer");
        Assertions.assertEquals(HashMapExcercise.longWordList(phrase), result);
    }
}
