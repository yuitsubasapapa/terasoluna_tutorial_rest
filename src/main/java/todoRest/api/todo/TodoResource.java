package todoRest.api.todo;

import java.io.Serializable;

import lombok.Data;

@Data
public class TodoResource implements Serializable {

    private static final long serialVersionUID = 1L;

    private String todoId;

}
