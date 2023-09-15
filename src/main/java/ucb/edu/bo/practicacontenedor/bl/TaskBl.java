package ucb.edu.bo.practicacontenedor.bl;
import ucb.edu.bo.practicacontenedor.dto.Task;
import java.util.*;

import java.util.List;

class TaskBl {

    List<Task> database = new ArrayList();

    public void create(Task task){
        database.add(task);
    }

    public List<Task> listAll(){
        return database;
    }

    public void delete(int taskId){
        for (int i = 0; i < database.size(); i++) {
            Task t = database.get(i);
            if(t.taskId()==taskId){
                database.remove(i);
            }
        }
    }
    
}