import java.time.LocalDate;

public class TimeLineService {
    TimeLineRepository timeLineRepo;

    public  TimeLineService(){
        this.timeLineRepo = new TimeLineRepository();

    }
    public void addEvents(LocalDate date,String title, String content, String cat, String imp){
        TimeLine tl = new TimeLine(date,title,content,cat,imp);
        timeLineRepo.addEvents(tl);
    }
    public void viewEvents(){
        int n = timeLineRepo.sizeEvent();
        if(n==0){
            System.out.println("No Available Events!!");
        }
        else{
            System.out.println("=======================");
            System.out.println("TIME LINE");
            System.out.println("=======================");

            for(int i =0 ;i<n;i++){
                TimeLine tl = timeLineRepo.viewEvents(i);
                LocalDate date = tl.getDate();
                String title = tl.getTitle();
                String con = tl.getContent();
                String cat = tl.getCategory();
                String imp = tl.getImportance();

                System.out.println(i+1 + ". \uD83D\uDCC5 "+date+
                                  "\n ____________________"+
                                   "\n "+title+": "+con+
                                     "\n Category: "+cat+
                                       "\n Importance: "+imp);
            }




        }

    }
    public void deleteEvents(int delNum){
        int n = timeLineRepo.sizeEvent();
        if(n==0){
            System.out.println("No Available Events!!");
        }
        else{
            if(delNum<=0 || delNum>n){
                System.out.println("Enter correct Event Num to delete!!");
            }
            else{

                int j = delNum-1;
                timeLineRepo.delEvent(j);
                System.out.println("Event Deleted!!");
            }
        }

    }

}
