package com.taskflow;

import com.taskflow.model.Task;
import com.taskflow.model.User;

public class Main {

    public static void main(String[] args) {

        // --- Create Users ---
        User alice = new User(1, "Alice", "alice@taskflow.com", "ADMIN");
        User bob   = new User(2, "Bob",   "bob@taskflow.com",   "USER");

        System.out.println("\n=== TASKFLOW USERS ===");
        alice.displayInfo();
        bob.displayInfo();

        // --- Create Tasks ---
        Task task1 = new Task(1, "Set up database",
                "Configure MySQL for production",
                "TODO", alice.getName());

        Task task2 = new Task(2, "Build login API",
                "Implement JWT authentication",
                "IN_PROGRESS", bob.getName());

        Task task3 = new Task(3, "Write unit tests",
                "Cover service layer with JUnit",
                "TODO", bob.getName());

        System.out.println("\n=== ALL TASKS ===");
        task1.displayTask();
        task2.displayTask();
        task3.displayTask();

        // --- Filter: show only TODO tasks ---
        System.out.println("\n=== TODO TASKS ONLY ===");
        Task[] allTasks = {task1, task2, task3};

        for (Task task : allTasks) {
            if (task.getStatus().equals("TODO")) {
                task.displayTask();
            }
        }
    }
}