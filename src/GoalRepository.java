import java.util.ArrayList;
import java.util.List;

public class GoalRepository {
    List<Goal> goalList;
    public GoalRepository(){
        this.goalList=new ArrayList<>();
    }
    public void addGoal(Goal goal){
        goalList.add(goal);
    }
    public int sizeGoal(){
        int gsz= goalList.size();
        return gsz;
    }
    public Goal viewGoal(int goal){
        Goal goal1 = goalList.get(goal);
        return goal1;
    }
}
