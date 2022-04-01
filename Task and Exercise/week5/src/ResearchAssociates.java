public class ResearchAssociates extends Employee {
    String FieldofStudy;
    public ResearchAssociates(int ssNo, String name, String email, String fieldofStudy) {
        super(ssNo, name, email);
        this.FieldofStudy = fieldofStudy;
    }
    public void setFieldofStudy(String fieldofStudy) {
        FieldofStudy = fieldofStudy;
    }
    public String getFieldofStudy() {
        return FieldofStudy;
    }
    @Override
    public int attendance() {
        // TODO Auto-generated method stub
        return 0;
    }

}
