package com.taskflow.model;

public class Task {

    private int id;
    private String title;
    private String description;
    private String status;      // "TODO", "IN_PROGRESS", "DONE"
    private String assignedTo;  // user's name

    public Task(int id, String title, String description,
                String status, String assignedTo) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.assignedTo = assignedTo;
    }

    public void displayTask() {
        System.out.println("════════════════════════");
        System.out.println("Task #" + id + ": " + title);
        System.out.println("Description: " + description);
        System.out.println("Status:      " + status);
        System.out.println("Assigned to: " + assignedTo);
        System.out.println("════════════════════════");
    }

    // Getters
    public int getId()           { return id; }
    public String getTitle()     { return title; }
    public String getStatus()    { return status; }
    public String getAssignedTo(){ return assignedTo; }

    // Setter — we'll need to update status later
    public void setStatus(String status) { this.status = status; }
}