import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // buat objek dari ResearchAssociates
        ResearchAssociates Paul = new ResearchAssociates(1234, "Paul Allen", "paul@mail.com", "Computer Science");
        // buat objek dari ResearchAssociates
        ResearchAssociates Allen = new ResearchAssociates(4321, "Allen", "Allen@mail.com", "Electrical Engineering");
        // buat objek dari Administrative
        Administrative Patrick = new Administrative(1, "Patrick", "Patrick@mail.com");     
        
        // Array of ResearchAssociates
        List<ResearchAssociates> researchAssociates = new ArrayList<ResearchAssociates>();
        researchAssociates.add(Paul);
        researchAssociates.add(Allen);

        // buat objek dari Institute yg berisi daftar ResearchAssociates
        Institute Akuntansi = new Institute("Akuntansi", "GSP", researchAssociates);
        Institute Economy = new Institute("Economy", "GSP", researchAssociates);

        // buat objek dari Faculty yg berisi daftar Institute
        List<Institute> FEB = new ArrayList<Institute>();
        FEB.add(Akuntansi);
        FEB.add(Economy);
        Faculty faculty = new Faculty("FEB",FEB);
        Institute Management = new Institute("Management", "GSP", researchAssociates);
        FEB.add(Management);
        // System.out.println(faculty.getDaftarinstitute());

        // buat objek dari Lecturer dan Course
        Lecturer Bateman = new Lecturer(1, "Bateman", "Bateman.com", "Computer Science");
        Lecturer Linus = new Lecturer(2, "Linus", "Linus.com", "Computer Science");
        Course java = new Course("Java", 12, 2);
        Course Oop = new Course("OOP", 13, 3);
        Bateman.addCourse(java);
        Bateman.addCourse(Oop);
        java.addLecturer(Linus);
        java.addLecturer(Bateman);


        // Print Institute di Faculty
        System.out.println("Di Fakultas " + faculty.getName() + " ada institute : ");
        for (Institute institute : faculty.getDaftarinstitute()) {
            System.out.println(institute.getName());
        }
        // Print Matkul yang diajar oleh Bateman
        System.out.println(Bateman.getName() + " mengajar Mata Kuliah :" );
        for (Course course : Bateman.getCourses()) {
            System.out.println(course.getName());
        }
        // Print Dosen yang mengajar Mata Kuliah Java
        System.out.println("Lecturer yang mengajar Mata Kuliah " + java.getName() + " adalah : ");
        for (Lecturer lecturer : java.getLecturer()) {
            System.out.println(lecturer.getName());
        }
    }
}
