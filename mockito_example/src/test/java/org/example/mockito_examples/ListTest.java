package org.example.mockito_examples;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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

}
