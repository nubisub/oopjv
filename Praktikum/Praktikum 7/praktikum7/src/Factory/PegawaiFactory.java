package Factory;

public class PegawaiFactory {
    public Pegawai buatPegawai(String nama, String tipe){
        switch (tipe) {
            case "Kontrak":
                return new PegawaiKontrak(nama);
            case "Tetap":
                return new PegawaiTetap(nama);
            default:
                return null;
        }
    }
}