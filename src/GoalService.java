import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoalService {
    List<Goal> goalList;
    public GoalService(){
        this.goalList=new ArrayList<>();
    }
    //5. Add Goal
    public  void addGoal(Scanner ch){
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
    public  void viewGoal(){
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
}
