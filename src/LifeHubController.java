import java.time.LocalDate;
import java.util.Scanner;


public class LifeHubController {
    TaskService ts;
    GoalService gs;
    DailyLogService ds;
    TimeLineService tls;

    public LifeHubController(){
        this.ts=new TaskService();
        this.gs=new GoalService();
        this.ds=new DailyLogService();
        this.tls=new TimeLineService();
    }
    public void start(){
        Scanner ch = new Scanner(System.in);
        int choice = 1;
        while (choice != 12) {
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
            System.out.println("9. Add TimeLine Log");
            System.out.println("10. View TimeLine Log");
            System.out.println("11. Delete TimeLine Log");
            System.out.println("12. Exit");


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
                    System.out.println("You selected Add TimeLine: ");
                    LocalDate date1 = LocalDate.now();
                    System.out.print("Enter the title: ");
                    String title1 = ch.nextLine();
                    System.out.print("Enter the content: ");
                    String content1 = ch.nextLine();
                    System.out.print("Enter the category: ");
                    String category = ch.nextLine();
                    System.out.print("Enter the importance: ");
                    String importance = ch.nextLine();
                    tls.addEvents(date1,title1,content1,category,importance);
                    break;
                case 10:
                    System.out.println("You selected View TimeLine.");
                    tls.viewEvents();
                    break;
                case 11:
                    System.out.println("You selected Delete TimeLine");
                    System.out.print("Enter the Event Num that to be deleted: ");
                    int delEventNum = ch.nextInt();
                    tls.deleteEvents(delEventNum);
                    break;


                case 12:
                    System.out.println("Exiting LifeHub....");
                    break;
                default:
                    System.out.println("Sorry!! Try valid choice");

            }
        }
    }
}
