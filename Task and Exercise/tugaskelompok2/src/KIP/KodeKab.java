package KIP;
public class KodeKab implements Kode{
    private String kode;
    private String nama;

    public KodeKab(String kode) {
        this.kode = kode;
    }
    
    public KodeKab() {
    }

    @Override
    public void setKode(String kode) {
        this.kode = kode;
    }

    @Override
    public String getKode() {
        return this.kode;
    }
    
    @Override
    public String getNama() {
        return this.nama;
    }
}
