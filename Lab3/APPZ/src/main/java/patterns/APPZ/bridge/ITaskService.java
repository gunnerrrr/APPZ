package patterns.APPZ.bridge;

import patterns.APPZ.entities.Task;

import java.util.List;

public interface ITaskService {

     void CreateTask (Task task);
     void UpdateTask (Integer idTask, Task updatedTask);
     void DeleteTask (Integer idTask);
     List<Task> getTasks();
     Task getTaskById (Integer idTask);
}
