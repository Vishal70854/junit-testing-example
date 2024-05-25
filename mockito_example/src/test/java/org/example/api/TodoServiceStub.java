package org.example.api;

import java.util.Arrays;
import java.util.List;

// this is a sample implementation of TodoService where we are creating a sample implementation of
// TodoService by hardcoding the values
public class TodoServiceStub implements TodoService{
    //Disadvantages of Stub
    // Dynamic condition - when i want this stub to return different methods/values then it becomes
                            // complex as we need to keep on implementing changes in TodoService
    // Service Definition - as the logic becomes complex then it will be difficult to maintain the hard coded values
    @Override
    public List<String> retrieveTodos(String user) {

        return Arrays.asList("Learn Spring MVC","Learn Spring", "Learn to Dance");
    }
}
