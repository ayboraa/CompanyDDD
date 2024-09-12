package company.project.domain;

import company.common.domain.DeadLine;
import company.common.domain.TaskId;
import org.springframework.util.Assert;


public class Task {
    private TaskId id;
    private String title;
    private String description;
    private DeadLine deadLine;

    public Task(String title, String description, DeadLine deadLine) {
        Assert.notNull(title, "Title cannot be null");
        Assert.notNull(description, "Description cannot be null");
        Assert.notNull(deadLine, "Deadline cannot be null");

        this.id = new TaskId();
        this.title = title;
        this.description = description;
        this.deadLine = deadLine;
    }



    public TaskId getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getDescription(){
        return description;
    }

    public DeadLine getDeadline(){
        return deadLine;
    }



}
