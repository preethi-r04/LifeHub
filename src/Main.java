import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner ch = new Scanner(System.in);
        List<Task> tasklist = new ArrayList<>();
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

            if (choice == 1) {
                System.out.println("You selected Add Task.");
                System.out.print("Enter your task name: ");
                String task1 = ch.nextLine();
                Task t1 = new Task(task1);
                tasklist.add(t1);

            } else if (choice == 2) {
                System.out.println("You selected View Task.");
                System.out.println("The List of Task: ");
                int n = tasklist.size();
                if(n==0){
                    System.out.println("No Task available!!");
                }
                else {
                    for (int i = 0; i < n; i++) {

                        String res = tasklist.get(i).getTaskname();
                        System.out.println(i + 1 + ". " + res);
                    }
                }

            } else if (choice == 3) {
                System.out.println("You selected Complete Task.");

            } else if (choice == 4) {
                System.out.println("You selected Delete Task.");

            } else if (choice == 5) {
                System.out.println("You selected Add Goal.");

            } else if (choice == 6) {
                System.out.println("You selected View Goal.");

            } else if (choice == 7) {
                System.out.println("Exiting LifeHub...");

            } else {
                System.out.println("Sorry!! Try valid choice");

            }
        }


    }
}

