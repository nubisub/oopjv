package DPP;
public class DPP {
    private boolean isDone;
    private String status;
    private String statusmessage;

    public DPP() {
    }
    
    public DPP(boolean isDone, String status) {
        this.isDone = isDone;
        this.status = status;
    }
    public String getStatusmessage() {
        return statusmessage;
    }
    public void setStatusmessage(String statusmessage) {
        this.statusmessage = statusmessage;
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
            return "true";
        } else {
            return "false";
        }
    }
}
