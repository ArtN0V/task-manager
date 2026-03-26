package controller;

import dto.TaskCreateRequest;
import dto.TaskResponse;
import org.springframework.web.bind.annotation.*;
import service.TaskService;

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
    public List<TaskResponse> getAll() {
        return service.getAll();
    }

    @PostMapping
    public TaskResponse create(@RequestBody TaskCreateRequest request) {
        return service.create(request);
    }

    @PutMapping("/{id}")
    public TaskResponse change(@PathVariable Long id, @RequestBody TaskResponse response) {
        return service.change(id, response);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
