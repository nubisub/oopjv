// 1.	Abdullah Ridwan	    222011352
// 2.	Navika Artiari		222011358
// 3.	Thomson		        222011365
// 4.	Hendra Kusuma	    222011395
// 5.	Rafel Ilham Febrian	222011407

package Subsector;

public class Subsector {
    private Hortikultura hortikultura;
    private TanamanPangan tanamanPangan;
    private Perkebunan perkebunan;
    private Kehutanan kehutanan;
    private Perikanan perikanan;
    private Peternakan peternakan;

    public Subsector(boolean tanamanPangan, boolean hortikultura,  String perkebunan, boolean peternakan, boolean kehutanan, boolean perikanan) {
        this.hortikultura = new Hortikultura(hortikultura);
        this.tanamanPangan = new TanamanPangan(tanamanPangan);
        this.perkebunan = new Perkebunan(perkebunan);
        this.kehutanan = new Kehutanan(kehutanan);
        this.perikanan = new Perikanan(perikanan);
        this.peternakan = new Peternakan(peternakan);
    }

    public Peternakan getPeternakan() {
        return peternakan;
    }

    public void setPeternakan(Peternakan peternakan) {
        this.peternakan = peternakan;
    }

    public Perikanan getPerikanan() {
        return perikanan;
    }

    public void setPerikanan(Perikanan perikanan) {
        this.perikanan = perikanan;
    }

    public Kehutanan getKehutanan() {
        return kehutanan;
    }

    public void setKehutanan(Kehutanan kehutanan) {
        this.kehutanan = kehutanan;
    }

    public Perkebunan getPerkebunan() {
        return perkebunan;
    }

    public void setPerkebunan(Perkebunan perkebunan) {
        this.perkebunan = perkebunan;
    }

    public Hortikultura getHortikultura() {
        return hortikultura;
    }
    public TanamanPangan getTanamanPangan() {
        return tanamanPangan;
    }
    public void setTanamanPangan(TanamanPangan tanamanPangan) {
        this.tanamanPangan = tanamanPangan;
    }
    public void setHortikultura(Hortikultura hortikultura) {
        this.hortikultura = hortikultura;
    }
}
