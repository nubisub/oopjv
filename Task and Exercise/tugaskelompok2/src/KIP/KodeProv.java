package KIP;
public class KodeProv implements Kode{
    private String kode ;
    private String nama;

    public KodeProv(String kode) {
        this.kode = kode;
    }

    public KodeProv() {
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
