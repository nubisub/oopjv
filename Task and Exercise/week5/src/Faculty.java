import java.util.List;
public class Faculty {
    private String name;
    private List<Institute> daftarinstitute;
    private Employee dean;

    public Faculty(String name, List<Institute> daftarinstitute) {
        this.name = name;
        this.daftarinstitute = daftarinstitute;
    }
    public List<Institute> getDaftarinstitute() {
        return daftarinstitute;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDean(Employee dean) {
        this.dean = dean;
    }
    public Employee getDean() {
        return dean;
    }
}
