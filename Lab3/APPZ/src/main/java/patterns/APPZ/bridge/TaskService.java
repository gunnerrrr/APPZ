package patterns.APPZ.bridge;

import patterns.APPZ.entities.Task;
import patterns.APPZ.proxy.DbContext;

import java.util.List;

public class TaskService implements ITaskService {
    public DbContext dbContext;

    @Override
    public void CreateTask(Task task) {
        dbContext.taskList.add(task);
    }

    @Override
    public void UpdateTask(Integer idTask, Task updatedTask) {
        this.DeleteTask(idTask);
        updatedTask.setTaskId(idTask);
        dbContext.taskList.add(updatedTask);
    }

    @Override
    public void DeleteTask(Integer idTask) {
        dbContext.taskList.remove(this.getTaskById(idTask));
    }

    @Override
    public List<Task> getTasks() {
        return dbContext.taskList;
    }

    @Override
    public Task getTaskById(Integer idTask) {
        return dbContext.taskList.stream()
                .filter(task-> task.getTaskId().equals(idTask))
                .findFirst().get();
    }
}
