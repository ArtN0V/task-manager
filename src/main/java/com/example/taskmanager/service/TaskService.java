package service;

import dto.TaskCreateRequest;
import dto.TaskResponse;
import dto.TaskStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {
    
    private final List<TaskResponse> tasks = new ArrayList<>();
    
    private Long idCounter = 1L;

    public List<TaskResponse> getAll() {
        return tasks;
    }

    public TaskResponse create(TaskCreateRequest request) {
        TaskResponse task = new TaskResponse(
                idCounter++,
                request.getTitle(),
                request.getDescription(),
                request.getDeadline(),
                null,
                TaskStatus.NOT_TAKEN
        );
        tasks.add(task);

        return task;
    }

    public TaskResponse change(Long id, TaskResponse response) {
        delete(id);

        TaskResponse task = new TaskResponse(
                idCounter++,
                response.getTitle(),
                response.getDescription(),
                response.getDeadline(),
                response.getTakenBy(),
                response.getStatus()
        );
        tasks.add(task);

        return task;
    }

    public void delete(Long id) {
        tasks.removeIf(task -> task.getId().equals(id));
    }
}
