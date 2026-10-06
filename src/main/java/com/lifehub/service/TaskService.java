package com.lifehub.service;

import com.lifehub.entity.Task;
import com.lifehub.repository.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    TaskRepository taskRepo;

    public TaskService(TaskRepository taskRepo){
        this.taskRepo=taskRepo;
    }

    public void addTask(String task1){
        Task t1 = new Task(task1);
        taskRepo.save(t1);
    }
}
