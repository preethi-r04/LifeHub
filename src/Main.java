
import java.time.LocalDate;
import java.util.*;
public class Main {


    public static void main(String[] args) {
        Scanner ch = new Scanner(System.in);
        TaskService ts = new TaskService();
        GoalService gs = new GoalService();
        DailyLogService ds = new DailyLogService();
        int choice = 1;
        while (choice != 9) {
            System.out.println("=========================");
            System.out.println(" LIFEHUB ");
            System.out.println("=========================");

            System.out.println("1. Add Task");
            System.out.println("2. View Task");
            System.out.println("3. Complete Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Add Goal");
            System.out.println("6. View Goal");
            System.out.println("7. Add Daily Log");
            System.out.println("8. View Daily Log");
            System.out.println("9. Exit");


            System.out.print("Enter your choice: ");
            choice = ch.nextInt();

            ch.nextLine();

            switch (choice){
                case 1 :
                    System.out.println("You selected Add Task.");
                    System.out.print("Enter your task name: ");
                    String task1 = ch.nextLine();
                    ts.addTask(task1);
                    break;
                case 2 :
                    System.out.println("You selected View Task.");
                    ts.viewTask();
                    break;
                case 3:
                    System.out.println("You selected Complete Task.");
                    System.out.print("Enter your task number: ");
                    int taskNum = ch.nextInt();
                    ts.completeTask(taskNum);
                    break;
                case 4 :
                    System.out.println("You selected Delete Task.");
                    System.out.print("Enter the Task Num that to be deleted: ");
                    int delTaskNum = ch.nextInt();
                    ts.deleteTask(delTaskNum);
                    break;
                case 5:
                    System.out.println("You selected Add Goal.");
                    System.out.print("Enter the Goal: ");
                    String goalName = ch.nextLine();

                    System.out.print("Enter the description: ");
                    String description = ch.nextLine();
                    System.out.print("Enter the TargetDate: ");
                    String datestr = ch.nextLine();
                    LocalDate targetDate = LocalDate.parse(datestr);
                    gs.addGoal(goalName,description,targetDate);
                    break;
                case 6:
                    System.out.println("You selected View Goal.");
                    gs.viewGoal();
                    break;
                case 7:
                    System.out.println("You selected Add Daily Logs");
                    LocalDate date = LocalDate.now();
                    System.out.print("Enter the title: ");
                    String title = ch.nextLine();
                    System.out.print("Enter the content: ");
                    String content = ch.nextLine();
                    System.out.print("Enter today's mood: ");
                    String mood = ch.nextLine();
                    ds.addDailylog(date,title,content,mood);
                    break;
                case 8:
                    System.out.println("You selected View Daily Logs");
                    ds.viewDailyLog();
                    break;
                case 9:
                    System.out.println("Exiting LifeHub....");
                    break;
                default:
                    System.out.println("Sorry!! Try valid choice");

            }
     }
    }
}

