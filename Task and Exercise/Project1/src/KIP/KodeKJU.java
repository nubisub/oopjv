package KIP;
public class KodeKJU implements Kode{
    private String kode;

    public KodeKJU(String kode) {
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
