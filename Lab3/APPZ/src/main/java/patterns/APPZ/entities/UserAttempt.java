package patterns.APPZ.entities;

import patterns.APPZ.entities.Task;

import java.io.File;

public class UserAttempt {
    private Task task;
    private Integer userId;
    private File userDiagram;

    public UserAttempt(Task task, Integer userId, File userDiagram) {
        this.task = task;
        this.userId = userId;
        this.userDiagram = userDiagram;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public File getUserDiagram() {
        return userDiagram;
    }

    public void setUserDiagram(File userDiagram) {
        this.userDiagram = userDiagram;
    }
}
