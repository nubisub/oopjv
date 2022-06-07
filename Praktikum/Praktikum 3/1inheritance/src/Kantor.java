import java.sql.Date;
public class Kantor {
    public static void main (String[] args) {
        // Create a new object
        Orang paul = new Orang();
        paul.setNama("Paul");

        // Create a new object
        Orang bateman = new Orang("Bateman");
        String str="1965-9-30";  
        Date date=Date.valueOf(str);
        bateman.setTanggalLahir(date);

        System.out.println("Ada orang:");
        System.out.println(paul.getNama()+" lahir pada "+paul.getTanggalLahir());
        System.out.println(bateman.getNama()+" lahir pada "+bateman.getTanggalLahir());

        String stri="1990-1-31";  
        Date tanggal=Date.valueOf(stri);
        // Create a new object
        Pegawai allen = new Pegawai("12345", "Allen.corp", "CEO", "Allen", tanggal);
        System.out.println(allen.getNama() + 
        " lahir pada " + allen.getTanggalLahir() +
        " NIP " + allen.getNIP() +
        " Kantor " + allen.getNamaKantor() +
        " Bagian " + allen.getUnitKerja());

    }
}
