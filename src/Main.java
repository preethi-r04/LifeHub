
import java.time.LocalDate;
import java.util.*;
public class Main {

    // 1. Add Task
    public static void addTask(Scanner ch,List<Task> taskList){
        System.out.println("You selected Add Task.");
        System.out.print("Enter your task name: ");
        String task1 = ch.nextLine();
        Task t1 = new Task(task1);
        taskList.add(t1);

    }
    // 2. View Task
    public static void viewTask(List<Task> taskList){
        System.out.println("You selected View Task.");
        System.out.println("The List of Task: ");
        int n = taskList.size();
        if(n==0){
            System.out.println("No Task available!!");
        }
        else {
            for (int i = 0; i < n; i++) {

                String res = taskList.get(i).getTaskName();
                Boolean status = taskList.get(i).getTaskStatus();
                if(status==true){
                    String status1 ="Completed";
                    System.out.println(i + 1 + ". " + res + " - "+ status1);
                }
                else{
                    String status1 = "Not Completed";

                    System.out.println(i + 1 + ". " + res + " - "+ status1);
                }
            }

        }

    }
    //3. Complete Task
    public static void completeTask(Scanner ch , List<Task> taskList){
        System.out.println("You selected Complete Task.");
        int n = taskList.size();
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
                taskList.get(i).setTaskStatus(true);
                System.out.println("Task Completed!!");
            }
        }

    }
    //4. Delete Task
    public static void deleteTask(Scanner ch, List<Task> taskList){
        System.out.println("You selected Delete Task.");
        int n = taskList.size();
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
                taskList.remove(i);
                System.out.println("Task Deleted!!");

            }
        }
    }
    //5. Add Goal
    public static void addGoal(Scanner ch, List<Goal> goalList){
        System.out.println("You selected Add Goal.");
        System.out.print("Enter the Goal: ");
        String goalName = ch.nextLine();
        System.out.print("Enter the description: ");
        String description = ch.nextLine();
        System.out.print("Enter the TargetDate: ");
        String datestr = ch.nextLine();
        LocalDate targetDate = LocalDate.parse(datestr);

        Goal g1 = new Goal(goalName,description,targetDate);
        goalList.add(g1);

        System.out.println("Goal Added Successfully!!");


    }
    // 6. View Goal
    public static void viewGoal(List<Goal> goalList){
        System.out.println("You selected View Goal.");
        int n = goalList.size();
        if(n==0){
            System.out.println("No Available Goals");
        }
        else{
            for(int i = 0; i<n;i++) {
                String gn = goalList.get(i).getGoalName();
                String des = goalList.get(i).getDescription();
                LocalDate ld = goalList.get(i).getTargetDate();
                Boolean st = goalList.get(i).getStatus();
                if (st) {
                    String st1 = "Completed";
                    System.out.println(i + 1 + ". " + gn + "\nDescription: " + des + "\nTargetDate: " + ld + "\nStatus: " + st1);

                }
                else{
                    String st1 = "Not Completed";
                    LocalDate today = LocalDate.now();
                    if(ld.isBefore(today)) {
                        System.out.println(i + 1 + ". " + gn + "\nDescription: " + des + "\nTargetDate: "+ld  + "\nStatus: OverDue" );

                    }
                    else{
                        System.out.println(i + 1 + ". " + gn + "\nDescription: " + des + "\nTargetDate: "+ ld  + "\nStatus: " + st1);
                    }
                }
            }
        }


    }


    public static void main(String[] args) {
        Scanner ch = new Scanner(System.in);
        List<Task> tasklist = new ArrayList<>();
        List<Goal> goalList = new ArrayList<>();

        int choice = 1;
        while (choice != 7) {
            System.out.println("=========================");
            System.out.println(" LIFEHUB ");
            System.out.println("=========================");

            System.out.println("1. Add Task");
            System.out.println("2. View Task");
            System.out.println("3. Complete Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Add Goal");
            System.out.println("6. View Goal");
            System.out.println("7. Exit");


            System.out.print("Enter your choice: ");
            choice = ch.nextInt();

            ch.nextLine();

            switch (choice){
                case 1 :
                    addTask(ch,tasklist);
                    break;
                case 2 :
                    viewTask(tasklist);
                    break;
                case 3:
                    completeTask(ch,tasklist);
                    break;
                case 4 :
                    deleteTask(ch,tasklist);
                    break;
                case 5:
                    addGoal(ch,goalList);
                    break;
                case 6:
                    viewGoal(goalList);
                    break;
                case 7:
                    System.out.println("Exiting LifeHub....");
                    break;
                default:
                    System.out.println("Sorry!! Try valid choice");

            }
     }
    }
}

