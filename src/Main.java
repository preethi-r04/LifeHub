import java.util.*;
public class Main {
    public static void main(String[] args) {
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

        Scanner ch = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int choice = ch.nextInt();

        if(choice==1){
            System.out.println("You selected Add Task.");
        } else if (choice==2) {
            System.out.println("You selected View Task.");

        }
        else if (choice==3) {
            System.out.println("You selected Complete Task.");

        }
        else if (choice==4) {
            System.out.println("You selected Delete Task.");

        }
        else if (choice==5) {
            System.out.println("You selected Add Goal.");

        }
        else if (choice==6) {
            System.out.println("You selected View Goal.");

        }
        else if (choice==7) {
            System.out.println("Existing LifeHub...");

        }
        else {
            System.out.println("Sorry!! Try valid choice");

        }


    }
    }