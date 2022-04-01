package KIP;
public class KIP {
    private KodeProv Prov;
    private KodeKab Kab;
    private KodeKec Kec;
    private KodeKJU KJU;
    private int nourut;
    private String KIP;

    public KIP() {
        this.Prov = new KodeProv();
        this.Kab = new KodeKab();
        this.Kec = new KodeKec();
        this.KJU = new KodeKJU();
    }
    public KodeProv getProv() {
        return Prov;
    }
    public KodeKJU getKJU() {
        return KJU;
    }
    public KodeKab getKab() {
        return Kab;
    }
    public KodeKec getKec() {
        return Kec;
    }
    public void setNourut(int nourut) {
        this.nourut = nourut;
    }
    public int getNourut() {
        return nourut;
    }
    public String getKIP() {
        return KIP;
    }
    public void setKIP() {
        this.KIP = Prov.getKode()+Kab.getKode()+Kec.getKode()+KJU.getKode()+nourut;
    }
}
