import java.util.ArrayList;
import java.util.List;

public class Lecturer extends ResearchAssociates{

    private List<Course> courses = new ArrayList<Course>();

    public Lecturer(int ssNo, String name, String email, String fieldofStudy) {
        super(ssNo, name, email, fieldofStudy);
    }
    public void addCourse(Course course) {
        courses.add(course);
    }
    public void removeCourse(Course course) {
        courses.remove(course);
    }
    public List<Course> getCourses() {
        return courses;
    }
    
}
