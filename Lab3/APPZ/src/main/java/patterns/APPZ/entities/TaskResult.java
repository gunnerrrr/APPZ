package patterns.APPZ.entities;

public class TaskResult {
    private Integer taskResultId;
    private Task task;
    private User user;
    private String statistic;
    private double mark;

    public TaskResult(Task task, User user, String statistic, double mark) {
        this.task = task;
        this.user = user;
        this.statistic = statistic;
        this.mark = mark;
    }

    public void setTaskResultId(Integer taskResultId) {
        this.taskResultId = taskResultId;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public Integer getTaskResultId() {
        return taskResultId;
    }

    public Task getTask() {
        return task;
    }

    public User getUser() {
        return user;
    }

    public String getStatistic() {
        return statistic;
    }

    public double getMark() {
        return mark;
    }

}
