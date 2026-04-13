package com.example.taskmanager.dto;

import java.time.LocalDate;

public class TaskResponse {
    private Long id;
    private String title;
    private String description;
    private LocalDate deadline;
    private String takenBy;
    private TaskStatus status;

    public TaskResponse(Long id, String title, String description, LocalDate deadline, String takenBy, TaskStatus status) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.deadline = deadline;
        this.takenBy = takenBy;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public String getTakenBy() {
        return takenBy;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public void setTakenBy(String takenBy) {
        this.takenBy = takenBy;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }
}
