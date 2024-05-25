package org.example.mockito_examples;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.mockito.Mockito.*;

public class ListTest {

    // examples on mock in List interface using when(className.methodName()).thenReturn(someValue)

    @Test
    public void letsMockListSize() {
        List list = mock(List.class);
        when(list.size()).thenReturn(10);
        Assert.assertEquals(10, list.size());
    }

    // return multiple values from a mock of List interface
    @Test
    public void letsMockListSizeWithMultipleReturnValues() {
        List list = mock(List.class);
        when(list.size()).thenReturn(10).thenReturn(20);
        Assert.assertEquals(10, list.size()); // First Call
        Assert.assertEquals(20, list.size()); // Second Call
    }

    @Test
    public void letsMockListGet() {
        List<String> list = mock(List.class);
        when(list.get(0)).thenReturn("in28Minutes");
        Assert.assertEquals("in28Minutes", list.get(0));
        Assert.assertNull(list.get(1));
    }

    @Test
    public void letsMockListGetWithAny() {
        List<String> list = mock(List.class);
        when(list.get(Mockito.anyInt())).thenReturn("in28Minutes");
        // If you are using argument matchers, all arguments
        // have to be provided by matchers.
        Assert.assertEquals("in28Minutes", list.get(0));
        Assert.assertEquals("in28Minutes", list.get(1));
    }

    // test method to throw an exception
    @Test(expected = RuntimeException.class) // this will check if a Runtime exception is thrown by the method
    public void letsMockList_ByThrowingExcpetion(){
        List listMock = mock(List.class);
        // when().thenReturn() methods are static methods of Mockito class we can call it directly also as shown in above examples
        Mockito.when(listMock.get(Mockito.anyInt())).thenThrow(new RuntimeException("List is empty"));
        listMock.get(0);

    }

    // testing verify() method in Mockito
    /*
    Once a mock or spy has been used, we can verify that specific interactions took place.
    Literally, we are saying, “Hey, Mockito, make sure this method was called with these arguments.”
     */
    @Test
    public void letsMockList_ByVerifyMethod(){
        List list = mock(List.class);
        when(list.get(0)).thenReturn("Hello Vishal");
        String expected = "Hello Vishal";
        Assert.assertEquals(expected, list.get(0));

        // Mockito.verify(mock variable ex: list).methodName(arguments) // arguments need to be same as used under when() method
        // verify() method will check if the above mock variable's method i.e get() is called with argument 0
        // i.e list.get(0) if this method is called then verify will run the test else the test will fail if list.get(2) (if get() method is called with some other argument)
        verify(list).get(0);

        // By default, Mockito verifies that the method was called once, but you can verify any number of invocations:
        // verify the exact number of invocations
//        verify(list, times(42)).get(anyInt());
//
//        // verify that there was at least one invocation
//        verify(list, atLeastOnce()).get(anyInt());
//
//        // verify that there were at least 5 invocations
//        verify(list, atLeast(5)).get(anyInt());
//
//        // verify the maximum number of invocations
//        verify(list, atMost(5)).get(anyInt());
//
//        // verify that it was the only invocation and
//        // that there are no more unverified interactions
//        verify(list, only()).get(anyInt());
//
//        // verify that there were no invocations
//        verify(list, never()).get(anyInt());
    }

}
