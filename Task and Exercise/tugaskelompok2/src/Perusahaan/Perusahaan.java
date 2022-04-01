package Perusahaan;

import DPP.DPP;
import KIP.KIP;
import Subsector.Subsector;
// import Validate.Validate;
// import Validate.ValidateKecamatan;

public class Perusahaan {
    private String nama;
    private String alamat;
    private String phone;
    private String fax;
    private int BBH;
    private KIP kip;
    private DPP dpp;
    private Subsector subsector;
    // private Validate validate;

    public Perusahaan() {
        this.kip = new KIP();
        this.dpp = new DPP();
        this.subsector = new Subsector();
    }

    // public Validate getValidate() {
    //     return validate;
    // }


    // public void setValidate(Validate validate) {
    //     this.validate = validate;
    // }


    public Subsector getSubsector() {
        return subsector;
    }


    public void setSubsector(Subsector subsector) {
        this.subsector = subsector;
    }


    public DPP getDpp() {
        return dpp;
    }


    public void setDpp(DPP dpp) {
        this.dpp = dpp;
    }


    public KIP getKip() {
        return kip;
    }

    public void setKip(KIP kip) {
        this.kip = kip;
    }

    public int getBBH() {
        return BBH;
    }

    public void setBBH(int bBH) {
        this.BBH = bBH;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }


}
