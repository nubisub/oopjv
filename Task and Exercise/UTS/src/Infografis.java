public class Infografis implements Penyajian {
    @Override
    public void generateShareContent() {
        System.out.println("Generate Infografis dalam bentuk pdf dan gambar");
    }

    @Override
    public void display() {
        System.out.println("Menampilkan daftar Infografis");
    }

    @Override
    public void selectContent() {
        System.out.println("Satu Infografis dipilih");
    }
}
