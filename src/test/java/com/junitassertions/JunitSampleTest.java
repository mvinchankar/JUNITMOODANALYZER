package com.junitassertions;

import org.junit.Assert;
import org.junit.Test;

public class JunitSampleTest {

    @Test
    public void assertionTest() {
        String string1 = "Junit";
        String string2 = "Junit";
        Object obj1 = new Object();
        Object obj2 = new Object();
        String string5 = null;
        int variable1 = 1;
        int variable2 = 2;
        int[] arithemeticArray1 = {1, 2, 3};
        int[] arithemeticArray2 = {1, 2, 3};

        //Assert Statements
        Assert.assertEquals(string1, string2);
        Assert.assertSame(string1, string2);
        Assert.assertSame(obj1, obj1);
        Assert.assertNotSame(obj1, obj2);
        Assert.assertNotNull(string1);
        Assert.assertNull(string5);
        Assert.assertTrue(variable1 < variable2);
        Assert.assertArrayEquals(arithemeticArray1, arithemeticArray2);


    }
}
