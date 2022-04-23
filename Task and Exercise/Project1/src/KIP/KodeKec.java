package KIP;
public class KodeKec implements Kode {
    private String kode;

    public KodeKec(String kode) {
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
