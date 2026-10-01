import java.time.LocalDate;

public class GoalService {
    GoalRepository goalRepo;
    public GoalService(){
        this.goalRepo=new GoalRepository();
    }


    //5. Add Goal
    public  void addGoal(String goalName,String description,LocalDate targetDate ){
        Goal g1 = new Goal(goalName,description, targetDate);
        goalRepo.addGoal(g1);
        System.out.println("Goal Added Successfully!!");

    }
    // 6. View Goal
    public  void viewGoal(){
        int n = goalRepo.sizeGoal();
        if(n==0){
            System.out.println("No Available Goals");
        }
        else{
            for(int i = 0; i<n;i++) {
                Goal goal = goalRepo.viewGoal(i);
                String gn = goal.getGoalName();
                String des = goal.getDescription();
                LocalDate ld = goal.getTargetDate();
                Boolean st = goal.getStatus();
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
