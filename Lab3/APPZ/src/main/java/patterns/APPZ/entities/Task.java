package patterns.APPZ.entities;

import java.io.File;

public class Task {
    private Integer taskId;
    private String description;
    private String maxMark;
    private String rating;
    private File content;
    private String typeOfDiagram;
    private String parsedDiagram;

    public Task(String description, String mark, String rating,
                File content, String typeOfDiagram,String parsedDiagram) {
        this.description = description;
        this.maxMark = mark;
        this.rating = rating;
        this.content = content;
        this.typeOfDiagram = typeOfDiagram;
        this.parsedDiagram = parsedDiagram;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMaxMark() {
        return maxMark;
    }

    public void setMaxMark(String maxMark) {
        this.maxMark = maxMark;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public File getContent() {
        return content;
    }

    public void setContent(File content) {
        this.content = content;
    }

    public String getTypeOfDiagram() {
        return typeOfDiagram;
    }

    public void setTypeOfDiagram(String typeOfDiagram) {
        this.typeOfDiagram = typeOfDiagram;
    }

    public String getParsedDiagram() {
        return parsedDiagram;
    }

    public void setParsedDiagram(String parsedDiagram) {
        this.parsedDiagram = parsedDiagram;
    }
}
