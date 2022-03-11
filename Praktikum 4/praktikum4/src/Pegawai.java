import java.sql.Date;  

public class Pegawai extends Orang implements Dosen{
    private String NIP;
    private String namaKantor;
    private String unitKerja;
    private String alamat;
    String NIDN;
    String keahlian;

    public Pegawai() {
    }
    public Pegawai(String NIP, String namaKantor, String unitKerja) {
        this.NIP = NIP;
        this.namaKantor = namaKantor;
        this.unitKerja = unitKerja;
    }
    public Pegawai(String NIP, String namaKantor, String unitKerja, String nama, Date tanggalLahir) {
        super(nama, tanggalLahir);
        this.NIP = NIP;
        this.namaKantor = namaKantor;
        this.unitKerja = unitKerja;
    }
    public String getNIP() {
        return NIP;
    }
    public void setNIP(String nIP) {
        NIP = nIP;
    }
    public String getNamaKantor() {
        return namaKantor;
    }
    public void setNamaKantor(String namaKantor) {
        this.namaKantor = namaKantor;
    }
    public String getUnitKerja() {
        return unitKerja;
    }
    public void setUnitKerja(String unitKerja) {
        this.unitKerja = unitKerja;
    }
    public String getGaji() {
        return "7 Juta";
    }
    @Override
    public String getAlamat() {
        return alamat;
    }
    @Override
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    @Override
    public String getNIDN() {
        return NIDN;
    }
    @Override
    public void setNIDN(String NIDN) {
        this.NIDN=NIDN;
    }
    @Override
    public String getKelompokKeahlian() {
        return keahlian;
    }
    @Override
    public void setKelompokKeahlian(String kelompokKeahlian) {
        this.keahlian=kelompokKeahlian;
    }
}
