package DPP;
public class DPP {
    private boolean isDone;
    private String status;
    private String statusmessage;
    
    public DPP(boolean isDone, String status) {
        this.isDone = isDone;
        this.status = status;
        switch (status) {
            case "1":
                setStatusmessage("Aktif");
                break;
            case "2":
                setStatusmessage("Tutup Sementara/Tidak Ada");
                break;
            case "3":
                setStatusmessage("Kegiatan Belum Berproduksi");
                break;
            case "4":
                setStatusmessage("Tidak Bersedia Diwawancarai");
                break;
            case "5":
                setStatusmessage("Alih Usaha ke Non Pertanian");
                break;
            case "6":
                setStatusmessage("Tutup");
                break;
            case "7":
                setStatusmessage("Tidak Ditemukan");
                break;
            case "8":
                setStatusmessage("Baru");
                break;
            case "9":
                setStatusmessage("Ganda");
                break;
        
            default:
                setStatusmessage("error");
                break;
        }
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
