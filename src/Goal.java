
import java.time.LocalDate;

public class Goal {
    String goalName;
    String description;
    LocalDate targetDate;
    Boolean status = false;

    public Goal(String goalName, String description, LocalDate targetDate){
        this.goalName=goalName;
        this.description=description;
        this.targetDate=targetDate;
    }

    public String getGoalName() {
        return goalName;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
