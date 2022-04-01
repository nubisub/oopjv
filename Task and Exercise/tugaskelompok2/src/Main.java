import java.util.ArrayList; // import the ArrayList class

import java.util.Scanner;

import Perusahaan.Perusahaan;
import Validate.ValidateString;
import Validate.ValidateKJU;
import Validate.ValidateKabupaten;
import Validate.ValidateKecamatan;

public class Main {
    static void tampilMenu(ArrayList<Perusahaan> p) {
        boolean quit = false;
        ValidateString Kec = new ValidateKecamatan();
        ValidateString Kab = new ValidateKabupaten();
        ValidateString KJU = new ValidateKJU();
        do {
            System.out.println("Pilih kode yang ingin diinput");
            System.out.println("1. Tambah DPP");
            System.out.println("2. Daftar Dpp");
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
                    // System.out.println("Kode Kabupaten  : ");
                    // String kodeKab = input.nextLine();
                    do {
                        System.out.print("Kode Kabupaten  : ");
                        String kodeKab = input.nextLine();
                        if (Kab.isValid(kodeKab)) {
                            p1.getKip().getKab().setKode(kodeKab);
                            break;
                        }
                    } while (true);

                    // ValidateKabupaten vka = new ValidateKabupaten();
                    // while (!vka.isValid(kodeKab)) {
                    //     System.out.print("Kode Kabupaten: ");
                    //     kodeKab = input.nextLine();
                    // }
                    // p1.getKip().getKab().setKode(kodeKab);

                    // Kode Kecamatan
                    do {
                        System.out.print("Kode Kecamatan : ");
                        String kodeKec = input.nextLine();
                        if (Kec.isValid(kodeKec)) {
                            p1.getKip().getKec().setKode(kodeKec);
                            break;
                        }
                    } while (true);

                    // System.out.println("Kode Kecamatan  : ");
                    // String kodeKec = input.nextLine();
                    // ValidateKecamatan vk = new ValidateKecamatan();
                    // while (!vk.isValid(kodeKec)) {
                    //     System.out.println("Kode Kecamatan   : ");
                    //     kodeKec = input.nextLine();
                    // }
                    // p1.getKip().getKab().setKode(kodeKec);
                    
                    

                // Kode KJU
                    // System.out.println("Kode KJU        : ");
                    // String kodeKju = input.nextLine();
                    // p1.getKip().getKJU().setKode(kodeKju);

                    do {
                        System.out.print("Nama KJU        : ");
                        String namaKju = input.nextLine();
                        if (KJU.isValid(namaKju)) {
                            p1.getKip().getKJU().setKode(namaKju);
                            break;
                        }
                    } while (true);

                // Nourut
                    System.out.println("No. Urut dalam satu Kab/Kota : ");
                    String nourut = input.nextLine();
                    p1.getKip().setNourut(Integer.parseInt(nourut));

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
                    System.out.println("No. Telepon       : ");
                    String phone = input.nextLine();
                    p1.setPhone(phone);

                // Fax Perusahaan
                    System.out.println("No. Faximile      : ");
                    String fax = input.nextLine();
                    p1.setFax(fax);

                // BBH Perusahaan
                    System.out.println("BBH               : ");
                    String bbh = input.nextLine();
                    p1.setBBH(Integer.parseInt(bbh));

                // Input DPP
                // Sudah Dikunjungin
                    System.out.println("Sudah Dikunjugni? (1/0) : ");
                    String isDone = input.nextLine();
                    p1.getDpp().setDone(Integer.parseInt(isDone) == 1 );

                // Status DPP
                    System.out.println("Status         : ");
                    String status = input.nextLine();
                    p1.getDpp().setStatus(status);
            
                // Input Subsector
                    System.out.println("Tanaman Pangan : ");
                    String tanamanPangan = input.nextLine();
                    p1.getSubsector().getTanamanPangan().setUsaha(Integer.parseInt(tanamanPangan) == 1);

                    System.out.println("Hortikultura : ");
                    String hortikultura = input.nextLine();
                    p1.getSubsector().getHortikultura().setUsaha(Integer.parseInt(hortikultura) == 1);

                    System.out.println("Perkebunan : ");
                    String perkebunan = input.nextLine(); 
                    p1.getSubsector().getPerkebunan().setUsaha(perkebunan);

                    System.out.println("Peternakan : ");
                    String peternakan = input.nextLine();
                    p1.getSubsector().getPeternakan().setUsaha(Integer.parseInt(peternakan) == 1);

                    System.out.println("Kehutanan : ");
                    String kehutanan = input.nextLine();
                    p1.getSubsector().getKehutanan().setUsaha(Integer.parseInt(kehutanan) == 1);

                    System.out.println("Perikanan : ");
                    String perikanan = input.nextLine();
                    p1.getSubsector().getPerikanan().setUsaha(Integer.parseInt(perikanan) == 1);

                    p.add(p1);

                // Buat Subsector
                    // Subsector subsector = new Subsector(Integer.parseInt(tanamanPangan) == 1, Integer.parseInt(hortikultura) == 1,perkebunan, Integer.parseInt(peternakan) == 1, Integer.parseInt(kehutanan) == 1, Integer.parseInt(perikanan) == 1);
                

                // Tambah Perusahaan Ke list
                    // p.add(new Perusahaan(new KIP(new KodeProv(kodeProv), new KodeKab(kodeKab), new KodeKec(kodeKec), new KodeKJU(kodeKju), Integer.parseInt(nourut)), nama, alamat, phone, fax, Integer.parseInt(bbh),new DPP(Integer.parseInt(isDone) == 1, status), subsector));
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
                    System.out.println("Status         : " + perusahaan.getDpp().getStatusmessage());

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
