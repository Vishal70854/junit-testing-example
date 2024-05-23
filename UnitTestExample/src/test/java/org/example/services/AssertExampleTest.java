package org.example.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class AssertExampleTest {

    // Assertions -> validating actual result with expected result

    // Assertions class
    @Test
    public void test1(){
        System.out.println("Testing some assertions method");
        double actual = 12;
        int expected = 12;
        // overloaded Assertions methods
//        Assertions.assertEquals(expected, actual);

        //// Assertions.assertArrayEquals(expected int[], actual int[]);
//        int[] actualIntArray = {1,2,3,4,5};
//        int[] expectedIntArray = {1,2,3,4,5};
//        Assertions.assertArrayEquals(expectedIntArray, actualIntArray);

        //// compare object using Assertions.assertSame(Object expected, Object actual)
        //// assertSame is used to compare object reference
        //// assertEquals is used to compare two values
//        String actualName = "vishal";
//        String expectedName = "vishal";
//        Assertions.assertSame(expectedName, actualName);

        //// to check if two values are null. we can do it by Assertions.assertNull(Object actual)
//        String name = null;
//        Assertions.assertNull(name);
        // Assertions.assertNotNull(Object actual) to check if some object is not null

//        to check if some value is true or not we can do it by Assertions.assertTrue(boolean condition);
//        boolean value = true;
//        Assertions.assertTrue(value);
//        Assertions.assertFalse(boolean condition); // for checking false condition


        // to check if two iterables(collections/list/array) is same or not we can use:
//        Assertions.assertIterableEquals(Iterable<?> l1, Iterable<?> l2);
//        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
//        List<Integer> list2 = Arrays.asList(1,2,3,4,5);
//        Assertions.assertIterableEquals(list2, list1); // list2 is expected list and list1 is actual list


        // for throwing exceptions we can use
//        Assertions.assertThrows(expected, executable);
        Assertions.assertThrows(RuntimeException.class, () ->{

            throw new RuntimeException("This is testing excpetion");

        });
    }

}
