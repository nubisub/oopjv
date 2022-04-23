import java.util.ArrayList; // import the ArrayList class

import java.util.Scanner;

import DPP.DPP;
import KIP.KIP;
import KIP.KodeKJU;
import KIP.KodeKab;
import KIP.KodeKec;
import KIP.KodeProv;
import Perusahaan.Perusahaan;
import Subsector.Subsector;
import Validate.Validate;
import Validate.ValidateBBH;
import Validate.ValidateBoolean;
import Validate.ValidateJenisUsahaUtama;
import Validate.ValidateKJU;
import Validate.ValidateKabupaten;
import Validate.ValidateKecamatan;
import Validate.ValidateKecamatanJak;
import Validate.ValidateNoUrut;
import Validate.ValidatePerkebunan;
import Validate.ValidateStatusDpp;

public class Main {
    static void tampilMenu(ArrayList<Perusahaan> p) {
        
        boolean quit = false;
        Validate Kec = new ValidateKecamatan();
        Validate Kab = new ValidateKabupaten();
        Validate KJU = new ValidateKJU();
        Validate NoUrut = new ValidateNoUrut();
        Validate biner = new ValidateBoolean();
        Validate perkebunancheck = new ValidatePerkebunan();
        Validate bbhcheck = new ValidateBBH();
        Validate statuscheck = new ValidateStatusDpp();
        Validate jenisusahautama = new ValidateJenisUsahaUtama();
        Validate jakarta;
        String kodeProv;
        String kodeKab;
        String kodeKec;
        String kodeKju;
        String phone;
        String fax;
        String bbh;
        String isDone;
        String status;
        String jenisUsahaUtama;
        String tanamanPangan;
        String hortikultura;
        String perkebunan;
        String peternakan;
        String kehutanan;
        String perikanan;
        String noUrut;
        String nama;
        String alamat;



        do {
            System.out.println("Pilih kode yang ingin diinput");
            System.out.println("1. Tambah DPP");
            System.out.println("2. Lihat DPP");
            System.out.println("3. Exit");
            System.out.print("Pilihan: ");
            Scanner input = new Scanner(System.in);
            String menu = input.nextLine();

            switch (menu) {
                case "1":
                    
                    // Kode Provinsi
                    System.out.println("Kode Identitas Perusahaan");
                        System.out.print("Kode Provinsi   : ");
                        System.out.println("31");
                         kodeProv = "31";
                    

                    // Kode Kabupaten
                    do {
                        System.out.print("Kode Kabupaten  : ");
                         kodeKab = input.nextLine();
                        if (Kab.isValid(kodeKab)) {
                            jakarta = new ValidateKecamatanJak(kodeKab);
                            break;
                        }
                    } while (true);
                    // Kode Kecamatan
                    do {
                        System.out.print("Kode Kecamatan  : ");
                         kodeKec = input.nextLine();
                        if (Kec.isValid(kodeKec)&& jakarta.isValid(kodeKec)) {
                            break;
                        }
                    } while (true);
                    // Kode KJU
                    do {
                        System.out.print("Kode KJU        : ");
                         kodeKju = input.nextLine();
                        if (KJU.isValid(kodeKju)) {
                            break;
                        }
                    } while (true);
                    // Nourut
                    do {
                        System.out.print("Nomor Urut      : ");
                         noUrut = input.nextLine();
                        if (NoUrut.isValid(noUrut)) {
                            break;
                        }
                    } while (true);
                    

                // DPP
                System.out.println("Pencacahan Kuesioner Rutin/DPP");
                    do {
                        System.out.print("Sudah Dikunjungi? : ");
                    isDone = input.nextLine();
                        if (biner.isValid(isDone)) {
                            break;
                        }
                    } while (true);

                // Status DPP                    
                    do {
                        System.out.print("Status            : ");
                     status = input.nextLine();
                        if (statuscheck.isValid(status)) {
                            break;
                        }
                    } while (true);


                    System.out.print("Nama Perusahaan   : ");
                     nama = input.nextLine();
                // Alamat Perusahaan
                    System.out.print("Alamat Perusahaan : ");
                     alamat = input.nextLine();
                // Nomor Telepon Perusahaan
                    // do {
                        System.out.print("No. Telepon       : ");
                     phone = input.nextLine();
                    //      if (telp.isValid(phone)) {
                    //         break;
                    //     }
                    // } while (true);
                // Fax Perusahaan
                    // do {
                        System.out.print("No. Faximile      : ");
                     fax = input.nextLine();
                    //     if (telp.isValid(fax)) {
                    //         break;
                    //     }
                    // } while (true);
                // BBH
                    do {
                        System.out.print("BBH               : ");
                     bbh = input.nextLine();
                        if (bbhcheck.isValid(bbh)) {
                            break;
                        }
                    } while (true);


                

                System.out.println("Subsektor");
                // Input Subsector
                    do {
                        System.out.print("Tanaman Pangan   : ");
                        tanamanPangan = input.nextLine();
                        if (biner.isValid(tanamanPangan)) {
                            break;
                        }
                    } while (true);
                    
                    do {
                        System.out.print("Hortikultura     : ");
                        hortikultura = input.nextLine();
                        if (biner.isValid(hortikultura)) {
                            break;
                        }
                    } while (true);

                    do {
                        System.out.print("Perkebunan       : ");
                        perkebunan = input.nextLine(); 
                        if (perkebunancheck.isValid(perkebunan)) {
                            break;
                        }
                    } while (true);
                    
                    do {
                        System.out.print("Peternakan       : ");
                    peternakan = input.nextLine();
                        if (biner.isValid(peternakan)) {
                            break;
                        }
                    } while (true);

                    do {
                        System.out.print("Kehutanan        : ");
                    kehutanan = input.nextLine();
                        if (biner.isValid(kehutanan)) {
                            break;
                        }
                    } while (true);

                    do {
                        System.out.print("Perikanan        : ");
                        perikanan = input.nextLine();
                        if (biner.isValid(perikanan)) {
                            break;
                        }
                    } while (true);

                    System.out.println("Jenis Usaha Utama");
                    do {
                        System.out.print("Jenis Usaha Utama: ");
                    jenisUsahaUtama = input.nextLine();
                        if (jenisusahautama.isValid(jenisUsahaUtama)) {
                            break;
                        }
                    } while (true);

                    Subsector subsector = new Subsector(Integer.parseInt(tanamanPangan) == 1, Integer.parseInt(hortikultura) == 1,perkebunan, Integer.parseInt(peternakan) == 1, Integer.parseInt(kehutanan) == 1, Integer.parseInt(perikanan) == 1);

                    KIP kip = new KIP(new KodeProv(kodeProv), new KodeKab(kodeKab), new KodeKec(kodeKec), new KodeKJU(kodeKju), Integer.parseInt(noUrut));

                    DPP dpp = new DPP(Integer.parseInt(isDone) == 1, status);

                    Perusahaan p1 = new Perusahaan(kip, dpp,subsector, nama, alamat, phone, fax, bbh, jenisUsahaUtama);

                    p.add(p1);

                    break;
                case "2":
                // Print Daftar Perusahaan
                for (Perusahaan perusahaan : p) {
                    System.out.println("Kode Identitas Perusahaan : " + perusahaan.getKip().getKIP());
                    System.out.println("Nama Perusahaan   : " + perusahaan.getNama());
                    System.out.println("Alamat Perusahaan : " + perusahaan.getAlamat());
                    System.out.println("No. Telepon       : " + perusahaan.getPhone());
                    System.out.println("No. Faximile      : " + perusahaan.getFax());
                    System.out.println("BBH               : " + perusahaan.getBBH());
                    System.out.println("Sudah Dikunjugni? : " + perusahaan.getDpp().getDone());
                    System.out.println("Status            : " + perusahaan.getDpp().getStatus());

                    System.out.println("Tanaman Pangan    : " + perusahaan.getSubsector().getTanamanPangan().getSubsector());

                    System.out.println("Hortikultura      : " + perusahaan.getSubsector().getHortikultura().getSubsector());


                    System.out.println("Perkebunan   : " + perusahaan.getSubsector().getPerkebunan().getSubsector());
                    System.out.println("Peternakan   : " + perusahaan.getSubsector().getPeternakan().getSubsector());
                    
                    System.out.println("Kehutanan    : " + perusahaan.getSubsector().getKehutanan().getSubsector());
                    System.out.println("Perikanan    : " + perusahaan.getSubsector().getPerikanan().getSubsector());
                    System.out.println("Jenis Usaha Utama : " + perusahaan.getJenisUsahaUtama());
                }

                    break;
                case "3":
                    quit = true;  
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
            
        } while (!quit);
    }
    public static void main(String[] args) {
        ArrayList<Perusahaan> p = new ArrayList();
        tampilMenu(p);   
    }
}
