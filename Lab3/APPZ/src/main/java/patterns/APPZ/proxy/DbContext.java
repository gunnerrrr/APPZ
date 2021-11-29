package patterns.APPZ.proxy;

import patterns.APPZ.entities.Task;
import patterns.APPZ.entities.TaskResult;
import patterns.APPZ.entities.User;
import patterns.APPZ.singleton.DataBaseInstance;

import java.util.List;

public class DbContext implements IDbContext{

    @Override
    public List<User> getUserList() {
        return DataBaseInstance.getInstance().getUserList();
    }

    @Override
    public List<Task> getTaskList() {
        return DataBaseInstance.getInstance().getTaskList();
    }

    @Override
    public List<TaskResult> getTaskResultList() {
        return DataBaseInstance.getInstance().getTaskResultList();
    }
}
