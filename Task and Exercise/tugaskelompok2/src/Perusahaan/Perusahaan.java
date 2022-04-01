package Perusahaan;

import DPP.DPP;
import KIP.KIP;
import Subsector.Subsector;

public class Perusahaan {
    private String nama;
    private String alamat;
    private String phone;
    private String fax;
    private int BBH;
    private KIP kip;
    private DPP dpp;
    private Subsector subsector;

    // constructor
    public Perusahaan(KIP kip, String nama, String alamat, String phone, String fax, int i, DPP dpp, Subsector subsector) {
        this.kip = kip;
        this.nama = nama;
        this.alamat = alamat;
        this.phone = phone;
        this.fax = fax;
        this.BBH = i;
        this.dpp = dpp;
        this.subsector = subsector;
    }


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
