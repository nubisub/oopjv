import java.sql.Date;

public class Programmer extends Pegawai {
    private String bahasaPemrograman;
    private String platform;

    public Programmer (String nama, Date tanggalLahir, String NIP, String kantor, String unitKerja, String bahasaPemrograman, String platform) {
        super(nama, tanggalLahir, NIP, kantor, unitKerja);
        this.bahasaPemrograman = bahasaPemrograman;
        this.platform = platform;
    }
    public String getBahasaPemrograman() {
        return bahasaPemrograman;
    }
    public void setBahasaPemrograman(String bahasaPemrograman) {
        this.bahasaPemrograman = bahasaPemrograman;
    }
    public String getPlatform() {
        return platform;
    }
    public void setPlatform(String platform) {
        this.platform = platform;
    }
    public String getPekerjaan() {
        return("Coding All along day");
    }
}
