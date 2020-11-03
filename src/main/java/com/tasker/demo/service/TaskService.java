package com.tasker.demo.service;

import com.tasker.demo.data.entity.Task;

public interface TaskService {
    void createTask(Task task);
    Task getTaskById(long id);
    void updateTask(Task task);
    void deleteTask(long id);

    void updateDone(long id);
}
