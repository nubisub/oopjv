package KIP;
public class KodeKec implements Kode {
    private String kode;
    private String nama;


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

    @Override
    public void validateKode() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String getNama() {
        return this.nama;
    }
    
}
