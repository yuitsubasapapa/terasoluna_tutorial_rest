package todoRest.api.todo;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import todoRest.domain.todo.TodoService;

@RestController
@RequestMapping("todorest")
public class TodoRestController {
    
    @Inject
    TodoService todoService;
    
    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public TodoResource getTodoId() {
        TodoResource todoResource = new TodoResource();
        
        String todoId = todoService.getTodoId();
        todoResource.setTodoId(todoId);
        
        return todoResource;
    }
}
