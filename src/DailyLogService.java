import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DailyLogService {
    List<DailyLog> dailyLogList;
    public DailyLogService (){
        this.dailyLogList=new ArrayList<>();
    }
    public void addDailylog(Scanner ch){
        System.out.println("You selected Add Daily Logs");
        LocalDate date = LocalDate.now();
        System.out.print("Enter the title: ");
        String title = ch.nextLine();
        System.out.print("Enter the content: ");
        String content = ch.nextLine();
        System.out.print("Enter today's mood: ");
        String mood = ch.nextLine();
        DailyLog d1 = new DailyLog(date, title,content,mood);
        dailyLogList.add(d1);

        System.out.println("Daily Log Added Successfully!!");
    }

    public void viewDailyLog(){
        System.out.println("You selected View Daily Logs");
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
