package KIP;
public class KodeKJU implements Kode{
    private String kode;
    private String nama;


    public KodeKJU() {
    }

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

    @Override
    public void validateKode() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String getNama() {
        return this.nama;
    }
    
}