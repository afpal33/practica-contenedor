package ucb.edu.bo.practicacontenedor.api;
import ucb.edu.bo.practicacontenedor.dto.Task;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/task")
class TaskAPI {
    private TaskBl taskBl;

    public TaskAPI(){
        taskBl = new taskBl();
    }
    @GetMapping("/")
    public Map create(Task task){
        taskBl.create(task);
        Map result = new HashMap();
        result.put("code", "TASK-0000");
    }

    /*
    public Map listAll(){
        return taskBl.listAll();
    }

    public Map delete(int taskId){
        taskBl.delete(taskId);
    }
    */
}
