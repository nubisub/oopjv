package KIP;
public class KodeProv implements Kode{
    private String kode ;

    public KodeProv(String kode) {
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
