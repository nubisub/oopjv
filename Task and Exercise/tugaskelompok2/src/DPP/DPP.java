// 1.	Abdullah Ridwan	    222011352
// 2.	Navika Artiari		222011358
// 3.	Thomson		        222011365
// 4.	Hendra Kusuma	    222011395
// 5.	Rafel Ilham Febrian	222011407

package DPP;
public class DPP {
    private boolean isDone;
    private String status;

    public DPP(boolean isDone, String status) {
        this.isDone = isDone;
        this.status = status;
    }
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
