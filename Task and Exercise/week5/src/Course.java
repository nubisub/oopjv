import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private int id;
    private float hours;

    private List<Lecturer> lecturer = new ArrayList<Lecturer>();

    public Course(String name, int id, float hours) {
        this.name = name;
        this.id = id;
        this.hours = hours;
    }
    public float getHours() {
        return hours;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setHours(float hours) {
        this.hours = hours;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void addLecturer(Lecturer lecturer) {
        this.lecturer.add(lecturer);
    }
    public void removeLecturer(Lecturer lecturer) {
        this.lecturer.remove(lecturer);
    }
    public List<Lecturer> getLecturer() {
        return lecturer;
    }
}
