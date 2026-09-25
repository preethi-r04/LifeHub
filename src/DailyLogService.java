import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class DailyLogService {
    List<DailyLog> dailyLogList;
    public DailyLogService (){
        this.dailyLogList=new ArrayList<>();
    }
    public void addDailylog(LocalDate date,String title, String content , String mood){

        DailyLog d1 = new DailyLog(date, title,content,mood);
        dailyLogList.add(d1);

        System.out.println("Daily Log Added Successfully!!");
    }

    public void viewDailyLog(){

        int n = dailyLogList.size();
        if(n==0){
            System.out.println("No Daily Log Available!!");
        }
        else{
            System.out.println("=========================");
            System.out.println(" DAILY LOGS ");
            System.out.println("=========================");
            for(int i =0;i<n;i++){
                String tit = dailyLogList.get(i).getTitle();
                String con = dailyLogList.get(i).getContent();
                String mood = dailyLogList.get(i).getMood();
                LocalDate date=dailyLogList.get(i).getDate();
                System.out.println(i+1+". "+tit+"\n Date: "+date+"\n Mood: "+mood+"\n Content: "+con);
            }
        }
    }

}
