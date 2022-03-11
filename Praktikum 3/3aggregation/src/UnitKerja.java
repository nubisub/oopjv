import java.util.List;

public class UnitKerja {
    private String nama;
    private List<Pegawai> daftarpegawai;

    public UnitKerja(String nama, List<Pegawai> pegawais) {
        this.nama = nama;
        this.daftarpegawai = pegawais;
    }
    public String getNama() {
        return nama;
    }
    public List<Pegawai> getDaftarpegawai() {
        return daftarpegawai;
    }
}
