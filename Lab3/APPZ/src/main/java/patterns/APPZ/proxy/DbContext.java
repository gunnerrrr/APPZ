package patterns.APPZ.proxy;

import patterns.APPZ.entities.Task;
import patterns.APPZ.entities.TaskResult;
import patterns.APPZ.entities.User;
import patterns.APPZ.singleton.DataBase;

import java.util.List;
//PROXY
public class DbContext {
    public List<User> userList;
    public List<TaskResult> taskResultList;
    public List <Task> taskList;

    public DbContext() {
        userList = DataBase.getInstance().getUserList();
        taskList = DataBase.getInstance().getTaskList();
        taskResultList = DataBase.getInstance().getTaskResultList();
    }
}
