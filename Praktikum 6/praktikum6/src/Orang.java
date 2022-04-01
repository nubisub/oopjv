import java.text.SimpleDateFormat;
import java.util.Calendar;

abstract class Orang {
    private String nama;
    private Calendar tanggalLahir;

    public Orang () {
        
    }
    public Orang(String nama, Calendar tanggalLahir) {
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNamaPanggilan() {
        return nama.substring(0, 3);
    }
    public void setTanggalLahir(Calendar tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
    public String getTanggalLahir() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            validatetanggalLahir();
            return sdf.format(tanggalLahir.getTime());
        } catch (Exception e) {
            return e.getMessage();
            // return "Belum tersedia";
        } finally {
            System.out.println("Error Tertangani");
        }
    }
    public void validatetanggalLahir() throws Exception  {
        if (tanggalLahir.get(Calendar.YEAR) < 2000) {
            throw new Exception("Dibawah Umur");
        }
        else {
            System.out.println("Cukup Umur");
        }
    }
}

