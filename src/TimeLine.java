import java.time.LocalDate;

public class TimeLine {
    LocalDate date;
    String title;
    String content;
    String category;
    String importance;

    public TimeLine(LocalDate date,String title,String content, String category, String importance){
        this.date=date;
        this.title=title;
        this.content=content;
        this.category=category;
        this.importance=importance;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getImportance() {
        return importance;
    }
}
