import java.time.LocalDate;



public class DailyLogService {
    DailyLogRepository dlRepo;
    public DailyLogService (){
        this.dlRepo= new DailyLogRepository();
    }


    public void addDailylog(LocalDate date,String title, String content , String mood){

        DailyLog d1 = new DailyLog(date, title,content,mood);
        dlRepo.addDl(d1);

        System.out.println("Daily Log Added Successfully!!");
    }

    public void viewDailyLog(){

        int n = dlRepo.sizedl();
        if(n==0){
            System.out.println("No Daily Log Available!!");
        }
        else{
            System.out.println("=========================");
            System.out.println(" DAILY LOGS ");
            System.out.println("=========================");
            for(int i =0;i<n;i++){
                DailyLog dailyLog1 = dlRepo.viewdl(i);
                String tit = dailyLog1.getTitle();
                String con = dailyLog1.getContent();
                String mood = dailyLog1.getMood();
                LocalDate date=dailyLog1.getDate();
                System.out.println(i+1+". "+tit+"\n Date: "+date+"\n Mood: "+mood+"\n Content: "+con);
            }
        }
    }

}
