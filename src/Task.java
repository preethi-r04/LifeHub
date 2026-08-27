public class Task {
    String taskname;
    Boolean status = false;
    public Task(String taskname){
        this.taskname=taskname;

    }
    public String getTaskName(){
        return taskname;
    }
    public void setTaskStatus(Boolean status){
        this.status=status;
    }
    public Boolean getTaskStatus(){
        return status;
    }
}
