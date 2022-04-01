import java.util.ArrayList; // import the ArrayList class

import java.util.Scanner;

import Perusahaan.Perusahaan;

import Validate.ValidateString;
import Validate.Validasitelphone;
import Validate.ValidateBBH;
import Validate.ValidateBoolean;
import Validate.ValidateKJU;
import Validate.ValidateKabupaten;
import Validate.ValidateKecamatan;
import Validate.ValidateNoUrut;
import Validate.ValidatePerkebunan;
import Validate.ValidateStatusDpp;

public class Main {
    static void tampilMenu(ArrayList<Perusahaan> p) {
        boolean quit = false;
        ValidateString Kec = new ValidateKecamatan();
        ValidateString Kab = new ValidateKabupaten();
        ValidateString KJU = new ValidateKJU();
        ValidateString NoUrut = new ValidateNoUrut();
        ValidateString telp = new Validasitelphone();
        ValidateString biner = new ValidateBoolean();
        ValidateString perkebunancheck = new ValidatePerkebunan();
        ValidateString bbhcheck = new ValidateBBH();
        ValidateString statuscheck = new ValidateStatusDpp();

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
                // Input KIP
                    Perusahaan p1 = new Perusahaan();
                    
                    // Kode Provinsi
                    System.out.println("Kode Provinsi   : \n 31");
                    String kodeProv = "";
                    p1.getKip().getProv().setKode(kodeProv);
                    // Kode Kabupaten
                    do {
                        System.out.print("Kode Kabupaten  : ");
                        String kodeKab = input.nextLine();
                        if (Kab.isValid(kodeKab)) {
                            p1.getKip().getKab().setKode(kodeKab);
                            break;
                        }
                    } while (true);
                    // Kode Kecamatan
                    do {
                        System.out.print("Kode Kecamatan : ");
                        String kodeKec = input.nextLine();
                        if (Kec.isValid(kodeKec)) {
                            p1.getKip().getKec().setKode(kodeKec);
                            break;
                        }
                    } while (true);
                    // Kode KJU
                    do {
                        System.out.print("Kode KJU        : ");
                        String namaKju = input.nextLine();
                        if (KJU.isValid(namaKju)) {
                            p1.getKip().getKJU().setKode(namaKju);
                            break;
                        }
                    } while (true);
                    // Nourut
                    do {
                        System.out.print("Nomor Urut      : ");
                        String noUrut = input.nextLine();
                        if (NoUrut.isValid(noUrut)) {
                            p1.getKip().setNourut(Integer.parseInt(noUrut));
                            break;
                        }
                    } while (true);
                    
                    p1.getKip().setKIP();


                // Input Profil Perusahaan
                // Nama Perusahaan
                    System.out.println("Nama Perusahaan   : ");
                    String nama = input.nextLine();
                    p1.setNama(nama);
                // Alamat Perusahaan
                    System.out.println("Alamat Perusahaan : ");
                    String alamat = input.nextLine();
                    p1.setAlamat(alamat);
                // Nomor Telepon Perusahaan
                    do {
                        System.out.println("No. Telepon       : ");
                    String phone = input.nextLine();
                        if (telp.isValid(phone)) {
                            p1.setPhone(phone);
                            break;
                        }
                    } while (true);
                // Fax Perusahaan
                    do {
                        System.out.println("No. Faximile       : ");
                    String fax = input.nextLine();
                        if (telp.isValid(fax)) {
                            p1.setFax(fax);
                            break;
                        }
                    } while (true);
                // BBH
                    do {
                        System.out.println("BBH               : ");
                    String bbh = input.nextLine();
                        if (bbhcheck.isValid(bbh)) {
                            p1.setBBH(Integer.parseInt(bbh));
                            break;
                        }
                    } while (true);


                // DPP
                    do {
                        System.out.println("Sudah Dikunjugni? (1/0) : ");
                    String isDone = input.nextLine();
                        if (biner.isValid(isDone)) {
                            p1.getDpp().setDone(Integer.parseInt(isDone) == 1 );
                            break;
                        }
                    } while (true);

                // Status DPP                    
                    do {
                        System.out.println("Status         : ");
                    String status = input.nextLine();
                        if (statuscheck.isValid(status)) {
                            p1.getDpp().setStatus(status);
                            break;
                        }
                    } while (true);


                // Input Subsector
                    do {
                        System.out.print("Tanaman Pangan      : ");
                        String tanamanPangan = input.nextLine();
                        if (biner.isValid(tanamanPangan)) {
                            p1.getSubsector().getTanamanPangan().setUsaha(Integer.parseInt(tanamanPangan) == 1);
                            break;
                        }
                    } while (true);
                    
                    do {
                        System.out.println("Hortikultura : ");
                        String hortikultura = input.nextLine();
                        if (biner.isValid(hortikultura)) {
                            p1.getSubsector().getHortikultura().setUsaha(Integer.parseInt(hortikultura) == 1);
                            break;
                        }
                    } while (true);

                    do {
                        System.out.println("Perkebunan : ");
                        String perkebunan = input.nextLine(); 
                        if (perkebunancheck.isValid(perkebunan)) {
                            p1.getSubsector().getPerkebunan().setUsaha(perkebunan);
                            break;
                        }
                    } while (true);
                    
                    do {
                        System.out.println("Peternakan : ");
                    String peternakan = input.nextLine();
                        if (biner.isValid(peternakan)) {
                            p1.getSubsector().getPeternakan().setUsaha(Integer.parseInt(peternakan) == 1);
                            break;
                        }
                    } while (true);

                    do {
                        System.out.println("Kehutanan : ");
                    String kehutanan = input.nextLine();
                        if (biner.isValid(kehutanan)) {
                            p1.getSubsector().getKehutanan().setUsaha(Integer.parseInt(kehutanan) == 1);
                            break;
                        }
                    } while (true);

                    do {
                        System.out.println("Perikanan : ");
                    String perikanan = input.nextLine();
                        if (biner.isValid(perikanan)) {
                            p1.getSubsector().getPerikanan().setUsaha(Integer.parseInt(perikanan) == 1);
                            break;
                        }
                    } while (true);

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
                    System.out.println("Sudah Dikunjugni? (1/0) : " + perusahaan.getDpp().getDone());
                    System.out.println("Status         : " + perusahaan.getDpp().getStatus());

                    System.out.println("Tanaman Pangan : " + perusahaan.getSubsector().getTanamanPangan().getSubsector());

                    System.out.println("Hortikultura : " + perusahaan.getSubsector().getHortikultura().getSubsector());


                    System.out.println("Perkebunan : " + perusahaan.getSubsector().getPerkebunan().getSubsector());
                    System.out.println("Peternakan : " + perusahaan.getSubsector().getPeternakan().getSubsector());
                    
                    System.out.println("Kehutanan : " + perusahaan.getSubsector().getKehutanan().getSubsector());
                    System.out.println("Perikanan : " + perusahaan.getSubsector().getPerikanan().getSubsector());
                    System.out.println("\n");
                }
                    break;
                case "3":
                    quit = true;  
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
            
        } while (quit == false);
    }
    public static void main(String[] args) {
        ArrayList<Perusahaan> p = new ArrayList();
        tampilMenu(p);   
    }
}
