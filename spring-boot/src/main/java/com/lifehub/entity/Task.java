package com.lifehub.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    Long id;

    String taskName;
    Boolean status = false;

    public Task(){
    }
    public Task(String taskName){
        this.taskName=taskName;

    }

    public Long getId() {
        return id;
    }

    public String getTaskName() {
        return taskName;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
