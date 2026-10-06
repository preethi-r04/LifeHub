import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    List<Task> taskList;

    public TaskRepository() {
        this.taskList = new ArrayList<>();
    }

    public void addTask(Task task) {
        taskList.add(task);
    }

    public int sizeTask() {
        int sz =taskList.size();
        return sz;

    }
    public Task viewTask(int task){
        Task res = taskList.get(task);
        return res;
    }
    public Task delTask(int task){
        Task del =taskList.remove(task);
        return del;
    }

}