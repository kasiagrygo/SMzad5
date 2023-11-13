package com.example.smzad3;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TaskStorage {
    private static final TaskStorage taskStorage = new TaskStorage();
    private final List<Task> tasks;
    private TaskStorage() {
        tasks = new ArrayList<>();
        for (int i = 1; i <= 150; ++i) {
            Task task = new Task();
            task.setName("Zadanie nr " + i);
            task.setDone(i % 3 == 0);
            tasks.add(task);
            if(i % 3 == 0){
                task.setCategory(Category.STUDIES);
            }else{
                task.setCategory(Category.HOME);
            }
        }
    }

    public static TaskStorage getInstance(){return taskStorage;}

    public void addTask(Task task) { tasks.add(task); }

    public List<Task> getTasks() {
        return tasks;
    }

    public Task getTask(UUID id) {
        for (Task task : tasks) {
            if (task.getId().equals(id))
                return task;
        }
        return null;
    }
}