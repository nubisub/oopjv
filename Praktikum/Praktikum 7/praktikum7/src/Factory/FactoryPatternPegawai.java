package Factory;

public class FactoryPatternPegawai {
    public static void main(String[] args) {
        PegawaiFactory factory = new PegawaiFactory();
        System.out.println(factory.buatPegawai("Paul", "Tetap").toString());
        System.out.println(factory.buatPegawai("Allen", "Kontrak").toString());
    }
}