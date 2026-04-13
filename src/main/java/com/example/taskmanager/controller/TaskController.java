package com.example.taskmanager.controller;

import com.example.taskmanager.dto.TaskCreateRequest;
import com.example.taskmanager.dto.TaskResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.taskmanager.service.TaskService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(TaskController.URI_API_TASKS)
public class TaskController {

    public static final String URI_API_TASKS = "/api/tasks";

    private final TaskService service;

    public TaskController (TaskService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<TaskResponse>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @PostMapping
    public ResponseEntity<TaskResponse> create(@RequestBody TaskCreateRequest request) {
        TaskResponse response = service.create(request);

        return ResponseEntity.created(URI.create(URI_API_TASKS + "/" + response.getId())).body(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TaskResponse> change(@PathVariable Long id, @RequestBody TaskResponse response) {
        return ResponseEntity.ok(service.change(id, response));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);

        return ResponseEntity.noContent().build();
    }
}
