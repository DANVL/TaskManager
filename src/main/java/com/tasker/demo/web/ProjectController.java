package com.tasker.demo.web;

import com.tasker.demo.config.constants.Constants;
import com.tasker.demo.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(Constants.PROJECT_URLS)
public class ProjectController {

    private final ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @PostMapping
    public ResponseEntity<?> create() {
        return null;
    }

    @GetMapping("/{projectId}")
    public ResponseEntity<?> get() {
        return null;
    }

    @DeleteMapping("/{projectId}")
    public ResponseEntity<?> delete() {
        return null;
    }

    @PutMapping
    public ResponseEntity<?> update() {
        return null;
    }
}
