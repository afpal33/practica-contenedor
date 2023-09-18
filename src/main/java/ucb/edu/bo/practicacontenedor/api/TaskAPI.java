package ucb.edu.bo.practicacontenedor.api;
import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ucb.edu.bo.practicacontenedor.bl.TaskBl;
import ucb.edu.bo.practicacontenedor.model.Task;

@RestController
@RequestMapping("/api/v1/task")
public class TaskAPI {
    private TaskBl taskBl;

    public TaskAPI() {
        taskBl = new TaskBl();
    }
    
    @GetMapping("/")
    public Map create(ucb.edu.bo.practicacontenedor.dto.Task task){
        taskBl.create(task);
        Map result = new HashMap();
        result.put("code", "TASK-0000");
        result.put("result", "Task created successfully");
        result.put("errorMessage", "");  // temporalmente vacio
        return result;      
    }

    /*public Map listAll(){
        return taskBl.listAll();        
    }

    public Map delete(int taskId){
        taskBl.delete(taskId);
    }*/
}
