package patterns.APPZ.singleton;

import patterns.APPZ.entities.Task;
import patterns.APPZ.entities.TaskResult;
import patterns.APPZ.entities.User;

import java.util.List;

public class DataBase {
    private static DataBase instance;
    private List<User> userList;
    private List <Task> taskList;
    private List<TaskResult> taskResultList;

    public static synchronized DataBase getInstance() {
        if(instance ==null) {
            instance =new DataBase();
        }
        return instance;
    }
    private DataBase() {
        connect();
    }

    private void connect() {
        System.out.println( ": Connected to database {" + this + "}");
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
