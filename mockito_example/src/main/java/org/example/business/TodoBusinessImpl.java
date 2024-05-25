package org.example.business;

import org.example.api.TodoService;

import java.util.ArrayList;
import java.util.List;

//TodoBusinessImpl -> SUT(SYSTEM UNDER TEST)
//TodoService -> Dependency(TodoBusinessImpl depends on TodoService to get the business logic executed)

public class TodoBusinessImpl {

    private TodoService todoService;
    //constructor
    public TodoBusinessImpl(TodoService todoService) {
        super();
        this.todoService = todoService;
    }

    public List<String> retrieveTodosRelatedToSpring(String user){
        List<String> filteredTodos = new ArrayList<>();
        List<String> todos = todoService.retrieveTodos(user);

        for(String todo : todos){   // filter todos which are related to Spring
            if (todo.contains("Spring")){
                filteredTodos.add(todo);
            }
        }

        return filteredTodos;
    }
}
