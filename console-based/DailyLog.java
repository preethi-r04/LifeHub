import java.time.LocalDate;

public class DailyLog {
    LocalDate date;
    String title;
    String content;
    String mood;

    public DailyLog(LocalDate date, String title, String content, String mood){
        this.date=date;
        this.title=title;
        this.content=content;
        this.mood=mood;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getContent() {
        return content;
    }

    public String getMood() {
        return mood;
    }
}
