public class Publikasi implements Penyajian{
    @Override
    public void generateShareContent() {
        System.out.println("Generate Publikasi.pdf");
    }
    @Override
    public void display() {
        System.out.println("Menampilkan daftar Publikasi");
    }
    @Override
    public void selectContent() {
        System.out.println("Satu Publikasi dipilih");
    }
}
