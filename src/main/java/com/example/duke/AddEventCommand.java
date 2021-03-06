package com.example.duke;

public class AddEventCommand extends Command {
    String deadline;

    public AddEventCommand(String description, String byDate) {
        super(description);
        deadline = byDate;
    }

    public String execute(TaskList myTask, Ui myUi, Storage storage) {
        Event myEvent = new Event(taskDescription, deadline);
        myTask.add(myEvent);
        //myUi.showMessageToUser("Event has been added successfully");
        System.out.println("Event has been added successfully");
        storage.saveFile(myTask);
        return "new event task added successfully:" + taskDescription;
    }
}
