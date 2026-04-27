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
}
