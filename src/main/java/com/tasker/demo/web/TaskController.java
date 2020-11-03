package com.tasker.demo.web;

import com.tasker.demo.config.constants.Constants;
import com.tasker.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(Constants.TASK_URLS)
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public ResponseEntity<?> create() {
        return null;
    }

    @GetMapping("/{taskId}")
    public ResponseEntity<?> get() {
        return null;
    }

    @DeleteMapping("/{taskId}")
    public ResponseEntity<?> delete() {
        return null;
    }

    @PutMapping
    public ResponseEntity<?> update() {
        return null;
    }

    @PutMapping("/{taskId}")
    public ResponseEntity<?> updateDone() {
        return null;
    }
}
