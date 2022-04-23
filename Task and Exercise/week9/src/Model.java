public class Model {
    private String nim;
    private String nama;
    private int umur;
    private String asal;

//    create constructor
    public Model(String nim, String nama, int umur, String asal) {
        this.nim = nim;
        this.nama = nama;
        this.umur = umur;
        this.asal = asal;
    }
    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
        System.out.println("Asal : " + asal);
    }

    public Model() {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        System.out.println("Nama : " + nama);
    }

    public int getUmur() {
        return umur;

    }

    public void setUmur(int umur) {
        this.umur = umur;
        System.out.println("Umur : " + umur);
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
        System.out.println("Nim : " + nim);
    }
}
