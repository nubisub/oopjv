package KIP;
public class KodeProv implements Kode{
    private String kode ;
    final String nama = "DKI Jakarta";

    public KodeProv() {
    }

    public KodeProv(String kode) {
        this.kode = "31";
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
    public void validateKode() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String getNama() {
        return this.nama;
    }    
}
