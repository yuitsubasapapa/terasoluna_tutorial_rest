package todoRest.domain.todo;

import java.util.UUID;

public class TodoServiceImpl implements TodoService {

    @Override
    public String getTodoId() {
        return UUID.randomUUID().toString();
    }
}
