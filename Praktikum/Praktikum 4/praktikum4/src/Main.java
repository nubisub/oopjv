import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        Pegawai paul = new Pegawai();
        System.out.println(paul.getAlamat());
        paul.setAlamat("JL.Provinsi");
        System.out.println(paul.getAlamat());
        
        paul.setNIDN("666");
        paul.setKelompokKeahlian("Menjahit");
        System.out.println("Ada dosen Paul dengan NIDN "+paul.getNIDN()+" dan kelompok "+paul.getKelompokKeahlian());


    }
}
