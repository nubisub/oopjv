package Perusahaan;

import DPP.DPP;
import KIP.KIP;
import Subsector.Subsector;

public class Perusahaan {
    private String nama;
    private String alamat;
    private String phone;
    private String fax;
    private String BBH;
    private KIP kip;
    private DPP dpp;
    private Subsector subsector;
    private String JenisUsahaUtama;

    public Perusahaan(KIP kip, DPP dpp, Subsector subsector, String nama, String alamat, String phone, String fax, String BBH,String JenisUsahaUtama) {
        this.kip = kip;
        this.dpp = dpp;
        this.subsector = subsector;
        this.nama = nama;
        this.alamat = alamat;
        this.phone = phone;
        this.fax = fax;
        this.BBH = BBH;
        this.JenisUsahaUtama = JenisUsahaUtama;
    }

    public String getJenisUsahaUtama() {
        return JenisUsahaUtama;
    }

    public void setJenisUsahaUtama(String jenisUsahaUtama) {
        this.JenisUsahaUtama = jenisUsahaUtama;
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

    public String getBBH() {
        return BBH;
    }

    public void setBBH(String bBH) {
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
