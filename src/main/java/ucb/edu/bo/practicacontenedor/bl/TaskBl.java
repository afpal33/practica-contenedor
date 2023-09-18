package ucb.edu.bo.practicacontenedor.bl;
import ucb.edu.bo.practicacontenedor.dto.Task;
import java.util.*;

public class TaskBl {
    
    List<Task> database = new ArrayList();
    public Map create(Task task){
        database.add(task);
        return null;
    }

    public List<Task> listAll(){
        return database;
    }

    public void delete(int taskId){
        for(int i = 0; i < database.size(); i++){
            Task t = database.get(i);
            if(t.taskId() == taskId){
                database.remove(i);
                break;
            }
        }
    }
}
