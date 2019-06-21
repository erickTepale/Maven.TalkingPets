package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class TestPet {

    @Test
    public void testConstructor(){
        //expected
        Pet a = new Pet("Name");

        //
        Assert.assertFalse(a == null);
    }

    @Test
    public void testSpeak(){
        //Expected
        String expected = "Whimper";

        Pet a = new Pet("bleh");

        Assert.assertEquals(expected, a.speak());
    }


}
