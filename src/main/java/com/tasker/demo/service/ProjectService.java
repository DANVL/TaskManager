package com.tasker.demo.service;

import com.tasker.demo.data.entity.Project;

public interface ProjectService {
    void createProject(Project project);
    Project getProjectById(long id);
    void updateProject(Project project);
    void deleteProject(long id);
}
