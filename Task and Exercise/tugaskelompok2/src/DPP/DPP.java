package DPP;
public class DPP {
    private boolean isDone;
    private String status;

    public DPP() {
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void setDone(boolean isDone) {
        this.isDone = isDone;
    }
    public String getDone() {
        if (isDone) {
            return "1";
        } else {
            return "0";
        }
    }
}
