import java.util.ArrayList;
import java.util.List;

public class DailyLogRepository {
    List<DailyLog> dailyLogList;

    public DailyLogRepository(){
        this.dailyLogList=new ArrayList<>();
    }
    public void addDl(DailyLog dl){
        dailyLogList.add(dl);
    }
    public int sizedl(){
        int dlz = dailyLogList.size();
        return dlz;
    }
    public DailyLog viewdl(int dl){
        DailyLog dl1 = dailyLogList.get(dl);
        return dl1;
    }
}

