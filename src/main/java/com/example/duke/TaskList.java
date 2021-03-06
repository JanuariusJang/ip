package com.example.duke;

import java.util.ArrayList;


public class TaskList {
    private ArrayList<Task> myTasks;

    public TaskList() {
        myTasks = new ArrayList<Task>();
    }

    public TaskList(ArrayList<Task> tasksFromFile) {
        myTasks = new ArrayList<>();
        myTasks.addAll(tasksFromFile);
    }

    public void add(Task myTask) {
        myTasks.add(myTask);
    }

    public void remove(int index) {
        myTasks.remove(index);
    }

    public int size() {
        return myTasks.size();
    }

    public void markAsDone(int index) {
        myTasks.get(index).markAsDone();
    }

    public String getDescription(int index) {
        return myTasks.get(index).description;
    }

    public Task get(int index) {
        return myTasks.get(index);
    }

    public void editItem (int index, String newDescription) {
        Task tempTask = myTasks.get(index);
        tempTask.description = newDescription;
        myTasks.set(index, tempTask);
    }
}
