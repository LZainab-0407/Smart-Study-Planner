package models;

import java.time.LocalDateTime;

/**
 * Represents a study task with title, description, deadline, and a priority level
 */
public class Task {

    private String title;
    private String description;
    private LocalDateTime deadline;
    private PriorityLevel priorityLevel;

    public enum PriorityLevel{
        HIGH,
        MODERATE,
        LOW
    }

    public Task(String title, String description, LocalDateTime deadline, PriorityLevel priorityLevel){
        this.title = title;
        this.description = description;
        this.deadline = deadline;
        this.priorityLevel = priorityLevel;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    public PriorityLevel getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(PriorityLevel priorityLevel) {
        this.priorityLevel = priorityLevel;
    }
}