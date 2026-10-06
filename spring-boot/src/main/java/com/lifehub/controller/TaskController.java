package com.lifehub.controller;

import com.lifehub.entity.Task;
import com.lifehub.service.TaskService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
    TaskService taskService;
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    @PostMapping("/tasks")
        public Task addTask(@RequestBody Task task1){
        taskService.addTask(task1.getTaskName());
        return task1;
        }

    }