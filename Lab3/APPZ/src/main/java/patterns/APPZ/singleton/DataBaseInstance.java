package patterns.APPZ.singleton;

import patterns.APPZ.entities.Task;
import patterns.APPZ.entities.TaskResult;
import patterns.APPZ.entities.User;

import java.util.List;

public class DataBaseInstance {
    private static DataBaseInstance instance;
    private List<User> userList;
    private List <Task> taskList;
    private List<TaskResult> taskResultList;

    public static synchronized DataBaseInstance getInstance() {
        if(instance ==null) {
            instance =new DataBaseInstance();
        }
        return instance;
    }
    private DataBaseInstance() {

    }



    public List<User> getUserList() {
        return userList;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public List<TaskResult> getTaskResultList() {
        return taskResultList;
    }
}
