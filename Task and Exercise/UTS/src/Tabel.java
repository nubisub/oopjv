public class Tabel implements Penyajian{

    @Override
    public void generateShareContent() {
        System.out.println("Generate Tabel ke file pdf, csv, gambar");
    }
    @Override
    public void display() {
        System.out.println("Menampilkan daftar Tabel");
    }
    @Override
    public void selectContent() {
        System.out.println("Satu Tabel dipilih");
    }
    
}
