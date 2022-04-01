package KIP;
public class KodeKJU implements Kode{
    private String kode;
    private String nama;


    public KodeKJU() {
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
