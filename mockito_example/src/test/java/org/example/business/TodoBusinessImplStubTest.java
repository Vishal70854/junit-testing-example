package org.example.business;

import org.example.api.TodoService;
import org.example.api.TodoServiceStub;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/*
    A stub is a fake class that comes with preprogrammed return values.
    It’s injected into the class under test to give you absolute control over what’s
    being tested as input. A typical stub is a database
    connection that allows you to mimic any scenario without having a real database
 */

public class TodoBusinessImplStubTest {
    // test a service using a Stub

    @Test
    public void testRetrieveTodosRelatedToSpring_usingAStub(){
        TodoService todoServiceStub = new TodoServiceStub();
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);

        List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
        Assert.assertEquals(2, filteredTodos.size());

    }
}
