package MoreJunit;

import com.sparta.hm.basics.oop.Rhino;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AnimalTest {
    private Rhino horn;

    @BeforeEach
    public void createRhino(){
        horn = new Rhino("horn", 1000, 2015, 11, 6);

    }

    @Test
    public void rhinoGetWeight(){
        String result = "1000KG";
        Assertions.assertEquals(horn.getWeight(),result);

    }

    @Test
    public void rhinoGetPetName() {
        String result = "horn";
        Assertions.assertEquals(horn.getPetname(), result);
    }
    @Test
    public void rhinoEat() {
        String result = "I am eating cows";
        Assertions.assertEquals(horn.eat(), result);
    }

}
