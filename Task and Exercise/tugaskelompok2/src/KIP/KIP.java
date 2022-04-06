// 1.	Abdullah Ridwan	    222011352
// 2.	Navika Artiari		222011358
// 3.	Thomson		        222011365
// 4.	Hendra Kusuma	    222011395
// 5.	Rafel Ilham Febrian	222011407

package KIP;
public class KIP {
    private KodeProv Prov;
    private KodeKab Kab;
    private KodeKec Kec;
    private KodeKJU KJU;
    private int nourut;
    private String KIP;

    public KIP(KodeProv kodeProv, KodeKab kodeKab, KodeKec kodeKec, KodeKJU kodeKJU, int nourut) {
        this.Prov = kodeProv;
        this.Kab = kodeKab;
        this.Kec = kodeKec;
        this.KJU = kodeKJU;
        this.nourut = nourut;
        setKIP();
    }
    public KodeProv getProv() {
        return Prov;
    }
    public void setProv(KodeProv prov) {
        this.Prov = prov;
    }
    public KodeKJU getKJU() {
        return KJU;
    }
    public void setKJU(KodeKJU kJU) {
        this.KJU = kJU;
    }
    public KodeKab getKab() {
        return Kab;
    }
    public void setKab(KodeKab kab) {
        this.Kab = kab;
    }
    public KodeKec getKec() {
        return Kec;
    }
    public void setKec(KodeKec kec) {
        this.Kec = kec;
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
