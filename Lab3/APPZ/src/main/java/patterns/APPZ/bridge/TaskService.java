package patterns.APPZ.bridge;

import patterns.APPZ.entities.Task;
import patterns.APPZ.proxy.CachedDbContext;

import java.util.List;

public class TaskService implements ITaskService {
    public CachedDbContext cachedDbContext;

    @Override
    public void CreateTask(Task task) {
        cachedDbContext.getTaskList().add(task);
    }

    @Override
    public void UpdateTask(Integer idTask, Task updatedTask) {
        this.DeleteTask(idTask);
        updatedTask.setTaskId(idTask);
        cachedDbContext.getTaskList().add(updatedTask);
    }

    @Override
    public void DeleteTask(Integer idTask) {
        cachedDbContext.getTaskList().remove(this.getTaskById(idTask));
    }

    @Override
    public List<Task> getTasks() {
        return cachedDbContext.getTaskList();
    }

    @Override
    public Task getTaskById(Integer idTask) {
        return cachedDbContext.getTaskList().stream()
                .filter(task-> task.getTaskId().equals(idTask))
                .findFirst().get();
    }
}
