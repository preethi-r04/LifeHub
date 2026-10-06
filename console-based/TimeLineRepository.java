import java.util.ArrayList;
import java.util.List;

public class TimeLineRepository {
    List<TimeLine> timeLineList;

    public TimeLineRepository(){
        this.timeLineList=new ArrayList<>();

    }
    public void addEvents(TimeLine tl){
        timeLineList.add(tl);
    }
    public int sizeEvent(){
        int sz = timeLineList.size();
        return sz;
    }
    public TimeLine viewEvents(int i){
        TimeLine tl = timeLineList.get(i);
        return tl;

    }
    public TimeLine delEvent(int j){
        TimeLine tl1 = timeLineList.remove(j);
        return tl1;
    }
}
