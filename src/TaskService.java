
public class TaskService {
    TaskRepository taskRepo;

    public TaskService() {
        this.taskRepo = new TaskRepository();
    }

    // 1. Add Tasklist
    public void addTask(String task1) {

        Task t1 = new Task(task1);
        taskRepo.addTask(t1);

    }

    // 2. View Task
    public void viewTask() {

        System.out.println("The List of Task: ");
        int n = taskRepo.sizeTask();
        if (n == 0) {
            System.out.println("No Task available!!");
        } else {
            for (int i = 0; i < n; i++) {
                Task task = taskRepo.viewTask(i);


                String res = task.getTaskName();
                Boolean status = task.getTaskStatus();
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
    public void completeTask(int taskNum ){

        int n = taskRepo.sizeTask();
        if(n==0){
            System.out.println("No Task Available!!");
        }
        else {


            if (taskNum > n || taskNum <= 0) {
                System.out.println("Is the entered task number between the valid range? ");
            } else {
                int i = taskNum - 1;
                taskRepo.viewTask(i).setTaskStatus(true);
                System.out.println("Task Completed!!");
            }
        }

    }
    //4. Delete Task
    public void deleteTask(int delTaskNum ){

        int n = taskRepo.sizeTask();
        if(n==0){
            System.out.println("No Task Available");
        }

        else {
            if(delTaskNum > n || delTaskNum<=0){
                System.out.println("Is the entered task number between the valid range? ");
            }
            else{
                int i = delTaskNum-1;
                taskRepo.delTask(i);
                System.out.println("Task Deleted!!");

            }
        }
    }

}