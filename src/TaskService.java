import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskService {
    List<Task> tasklist;

    public TaskService() {
        this.tasklist = new ArrayList<>();
    }

    // 1. Add Tasklist
    public void addTask(Scanner ch) {
        System.out.println("You selected Add Task.");
        System.out.print("Enter your task name: ");
        String task1 = ch.nextLine();
        Task t1 = new Task(task1);
        tasklist.add(t1);

    }

    // 2. View Task
    public void viewTask() {
        System.out.println("You selected View Task.");
        System.out.println("The List of Task: ");
        int n = tasklist.size();
        if (n == 0) {
            System.out.println("No Task available!!");
        } else {
            for (int i = 0; i < n; i++) {

                String res = tasklist.get(i).getTaskName();
                Boolean status = tasklist.get(i).getTaskStatus();
                if (status == true) {
                    String status1 = "Completed";
                    System.out.println(i + 1 + ". " + res + " - " + status1);
                } else {
                    String status1 = "Not Completed";

                    System.out.println(i + 1 + ". " + res + " - " + status1);
                }
            }

        }

    }
    //3. Complete Task
    public void completeTask(Scanner ch ){
        System.out.println("You selected Complete Task.");
        int n = tasklist.size();
        if(n==0){
            System.out.println("No Task Available!!");
        }
        else {
            System.out.print("Enter the task number: ");
            int taskNum = ch.nextInt();

            if (taskNum > n || taskNum <= 0) {
                System.out.println("Is the entered task number between the valid range? ");
            } else {
                int i = taskNum - 1;
                tasklist.get(i).setTaskStatus(true);
                System.out.println("Task Completed!!");
            }
        }

    }
    //4. Delete Task
    public void deleteTask(Scanner ch ){
        System.out.println("You selected Delete Task.");
        int n = tasklist.size();
        if(n==0){
            System.out.println("No Task Available");
        }

        else {
            System.out.print("Enter the Task Num that to be deleted: ");
            int delTaskNum = ch.nextInt();
            if(delTaskNum > n || delTaskNum<=0){
                System.out.println("Is the entered task number between the valid range? ");
            }
            else{
                int i = delTaskNum-1;
                tasklist.remove(i);
                System.out.println("Task Deleted!!");

            }
        }
    }

}