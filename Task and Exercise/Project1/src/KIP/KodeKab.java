package KIP;
public class KodeKab implements Kode{
    private String kode;
    
    public KodeKab(String kode) {
        this.kode = kode;
    }
    @Override
    public void setKode(String kode) {
        this.kode = kode;
    }

    @Override
    public String getKode() {
        return this.kode;
    }
}
