import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        String str="1965-9-30";
        Date date=Date.valueOf(str);
        Pegawai pegawai = new Pegawai("Paul",date,"12345","TokoPakEdi","UI/UX");
        pegawai.setKeahlian("Menjahit");
        pegawai.setNIDN("45231");
        System.out.println(pegawai.getNama() + " berasal dari " + pegawai.getKantor() + " yang bertugas " + pegawai.getPekerjaan() + " \ndengan NIDN " + pegawai.getNIDN() + " dan keahlian " + pegawai.getKeahlian() + " \nbiasa dipanggil " + pegawai.getNamaPanggilan() + "bekerja di bidang");
        
        
        String jkl="1965-9-30";  
        Date tanggal=Date.valueOf(jkl);
        Programmer programmer = new Programmer("Allen",tanggal,"12345","BukaPalak","Backend","Java","Android");
        programmer.setKeahlian("Coding");
        System.out.println(programmer.getNamaPanggilan() + " dengan nama lengkap " + programmer.getNama() + " berasal dari " + programmer.getKantor() + " \nyang bertugas sebagai " + programmer.getPekerjaan() + " \ndan keahlian " + programmer.getKeahlian() + " biasa menggunakan " + programmer.getBahasaPemrograman() + " pada " + programmer.getPlatform());
    }
    
}
