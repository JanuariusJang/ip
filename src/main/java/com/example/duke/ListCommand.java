package com.example.duke;

public class ListCommand extends Command{

    public void execute (TaskList myTask){
        if( myTask.size()<1){
            System.out.println("Sorry, no Tasks to list");
        }
        for (int i = 0; i < myTask.size();i++)
        {
            System.out.println(i+1 + myTask.get(i).toString());
        }

    }
}

