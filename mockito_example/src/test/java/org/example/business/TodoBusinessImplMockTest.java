package org.example.business;

import org.example.api.TodoService;
import org.example.api.TodoServiceStub;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

// in this example we are mocking ToDoService interface because
// this TodoBusinessImpl is dependent on TodoService for performing business logic
// so we are mocking TodoService instead of calling actual class or making fakeclass using Stub which increases
// lots of difficulty in managing code as it grows larger. that's why mock is used to create dummy object of classes
// and use when().thenReturn() if some specific method of that class is called then return some mock/dummy values

public class TodoBusinessImplMockTest {
    /*
    What is mocking?
    mocking is creating objects that simulate the behaviour of real objects.
    Unlike stubs, mocks can be dynamically created from code - at runtime
    Mocks offer more functionality than stubbing
    you can verify method calls and a lot other things
     */

    // test this method using a mock
    @Test
    public void testRetrieveTodosRelatedToSpring_usingAMock(){
        // create a mock object of TodoService class
        // mock(TodoService.class) will create a mock/dummy object of TodoService class/interface
        // mock() is used to create mock/dummy object of a class or interface which is passed in parenthesisss

        TodoService todoServiceMock = mock(TodoService.class);
        List<String> todos = Arrays.asList("Learn Spring MVC","Learn Spring", "Learn to Dance");

        // when(className.methodName()) is called with specific value (ex-"Dummy") then we can return some values dynamically using thenReturn(some Value to Return)
        // using mock(), when().thenReturn() we can mock objects of class easily without creating a separate class for each object/class to be mocked
        // when retrieveTodos("Dummy") method is called with String value "Dummy" then we will return todos list
        // as you can see we are dynamically mocking/cloning objects of TodoService and returning values using mock() and when().thenReturn()

        // when retrieveTodos("Dummy") method is called with String value "Dummy" then we will return todos list
        // as you can see we are dynamically mocking/cloning objects of TodoService and returning values using mock() and when().thenReturn()
        when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);


        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
        List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
        Assert.assertEquals(2, filteredTodos.size());

    }

    @Test
    public void usingMockito() {
        TodoService todoService = mock(TodoService.class);
        List<String> allTodos = Arrays.asList("Learn Spring MVC",
                "Learn Spring", "Learn to Dance");
        when(todoService.retrieveTodos("Ranga")).thenReturn(allTodos);
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
        List<String> todos = todoBusinessImpl
                .retrieveTodosRelatedToSpring("Ranga");
        Assert.assertEquals(2, todos.size());
    }

    @Test
    public void testRetrieveTodosRelatedToSpring_withEmptyList(){
        // create a mock object of TodoService class with mock(ClassName.class). mock() is present under Mockito framework to mock dummy objects of class
        // mock(TodoService.class) will create a mock/dummy object of TodoService class/interface
        // mock() is used to create mock/dummy object of a class or interface which is passed in parenthesisss

        TodoService todoServiceMock = mock(TodoService.class);
        List<String> todos = Arrays.asList();

        when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);


        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);


        List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
        Assert.assertEquals(0, filteredTodos.size());

    }

}
