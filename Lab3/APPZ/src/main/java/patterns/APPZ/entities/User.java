package patterns.APPZ.entities;

import java.time.Duration;
import java.util.List;

public class User {
    private Integer userId;
    private String username;
    private String role;
    private Duration statistic;
    private List<UserAttempt> userAttemptList;

    public User(String username, String role) {
        this.username = username;
        this.role = role;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setStatistic(Duration statistic) {
        this.statistic = statistic;
    }

    public void setUserAttemptList(List<UserAttempt> userAttemptList) {
        this.userAttemptList = userAttemptList;
    }

    public Duration getStatistic() {
        return statistic;
    }

    public List<UserAttempt> getUserAttemptList() {
        return userAttemptList;
    }

    public Integer getUserId() {
        return userId;
    }



    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }
}
