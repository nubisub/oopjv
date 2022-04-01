import java.sql.Date;

public class Project {
    private String name;
    private Date startDate;
    private Date endDate;
    private int hours;

    public Project(String name, Date startDate, Date endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    public Date getEndDate() {
        return endDate;
    }
    public String getName() {
        return name;
    }
    public Date getStartDate() {
        return startDate;
    }
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }
    public int getHours() {
        return hours;
    }
    
}
