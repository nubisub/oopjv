import java.sql.Date;
import java.util.List;  
public class Kantor {
    public static void main (String[] args) {
        Orang paul = new Orang();
        paul.setNama("Paul");
        Orang bateman = new Orang("Bateman");

        String str="1965-9-30";  
        Date date=Date.valueOf(str);
        bateman.setTanggalLahir(date);

        // System.out.println("Ada orang:");
        // System.out.println(paul.getNama()+" lahir pada "+paul.getTanggalLahir());
        // System.out.println(bateman.getNama()+" lahir pada "+bateman.getTanggalLahir());

        String stri="1990-9-30";  
        Date tanggal=Date.valueOf(stri);
        Pegawai allen = new Pegawai("12345", "Allen.corp", "CEO", "Allen", tanggal);
        // System.out.println(allen.getNama() + " lahir pada " + allen.getTanggalLahir() + " NIP " + allen.getNIP() + " Kantor " + allen.getNamaKantor() + " Bagian " + allen.getUnitKerja());

    

        // System.out.println("gaji orang paul : " + paul.getGaji());
        // System.out.println("gaji orang allen : " + allen.getGaji());

        Gedung STIS = new Gedung();
        STIS.addRuang("Lobi");
        STIS.addRuang("Bagian Umum");
        STIS.addRuang("Kepala Kantor");

        List<Ruang> ruangan = STIS.getDaftarRuang();
        
        System.out.println("Ruangan di STIS :");
        for (Ruang ruang : ruangan) {
            System.out.println(ruang.getNamaRuang());
        }

    }
}
