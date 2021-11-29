package patterns.APPZ.proxy;

import patterns.APPZ.entities.Task;
import patterns.APPZ.entities.TaskResult;
import patterns.APPZ.entities.User;

import java.util.List;

public interface IDbContext {
    List<User> getUserList();
    List<Task> getTaskList();
    List<TaskResult> getTaskResultList();
}
