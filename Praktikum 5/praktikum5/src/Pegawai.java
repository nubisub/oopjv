import java.sql.Date;

public class Pegawai extends Orang implements Dosen {
    private String NIP;
    private String kantor;
    private String unitKerja;
    private String NIDN;
    private String kelompokKeahlian;

    public Pegawai(String nama, Date tanggalLahir, String NIP, String kantor, String unitKerja) {
        super(nama, tanggalLahir);
        this.NIP = NIP;
        this.kantor = kantor;
        this.unitKerja = unitKerja;
    }
    @Override
    public String getNIDN() {
        return NIDN;
    }
    @Override
    public void setNIDN(String NIDN) {
        this.NIDN = NIDN;
    }
    @Override
    public String getKeahlian() {
        
        return kelompokKeahlian;
    }
    @Override
    public String getPekerjaan() {
        return "Mengajar";
    }
    @Override
    public void setKeahlian(String keahlian) {
        this.kelompokKeahlian = keahlian;
    }
    public String getNIP() {
        return NIP;
    }
    public String getKantor() {
        return kantor;
    }
    public void setNIP(String nIP) {
        NIP = nIP;
    }
    public void setKantor(String kantor) {
        this.kantor = kantor;
    }
    public String getUnitKerja() {
        return unitKerja;
    }
    public void setUnitKerja(String unitKerja) {
        this.unitKerja = unitKerja;
    }
}
