import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args){
        Pegawai Paul = new Pegawai();
        Pegawai Allen = new Pegawai();
        Paul.setTanggalLahir(new GregorianCalendar(1999, 10, 10));
        Paul.setNama("Paul");
        Allen.setNama("Allen");

        System.out.println("Ada Orang:");
        System.out.println(Paul.getNama() + " lahir pada " + Paul.getTanggalLahir());
        System.out.println(Allen.getNama() + " lahir pada " + Allen.getTanggalLahir());
    }
}
