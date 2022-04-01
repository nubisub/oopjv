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

public class Main {
    static void tampilMenu(ArrayList<Perusahaan> p) {
        boolean quit = false;
        
        do {
            System.out.println("Pilih kode yang ingin diinput");
            System.out.println("1. Tambah DPP");
            System.out.println("2. Daftar Dpp");
            System.out.print("Pilihan: ");
            Scanner input = new Scanner(System.in);
            String menu = input.nextLine();

            switch (menu) {
                case "1":
                    System.out.println("Kode Provinsi   : \n 31");
                    String kodeProv = "";
                    System.out.println("Kode Kecamatan  : ");
                    String kodeKec = input.nextLine();
                    System.out.println("Kode Kabupaten  : ");
                    String kodeKab = input.nextLine();
                    System.out.println("Kode KJU        : ");
                    String kodeKju = input.nextLine();
                    System.out.println("No. Urut dalam satu Kab/Kota : ");
                    String nourut = input.nextLine();


                    System.out.println("Nama Perusahaan   : ");
                    String nama = input.nextLine();
                    System.out.println("Alamat Perusahaan : ");
                    String alamat = input.nextLine();
                    System.out.println("No. Telepon       : ");
                    String phone = input.nextLine();
                    System.out.println("No. Faximile      : ");
                    String fax = input.nextLine();
                    System.out.println("BBH               : ");
                    String bbh = input.nextLine();

                    System.out.println("Sudah Dikunjugni? (1/0) : ");
                    String isDone = input.nextLine();
                    System.out.println("Status         : ");
                    String status = input.nextLine();
                    
                    System.out.println("Tanaman Pangan : ");
                    String tanamanPangan = input.nextLine();
                    System.out.println("Hortikultura : ");
                    String hortikultura = input.nextLine();
                    System.out.println("Perkebunan : ");
                    String perkebunan = input.nextLine(); 
                    System.out.println("Peternakan : ");
                    String peternakan = input.nextLine();
                    System.out.println("Kehutanan : ");
                    String kehutanan = input.nextLine();
                    System.out.println("Perikanan : ");
                    String perikanan = input.nextLine();
                    


                    Subsector subsector = new Subsector(Integer.parseInt(tanamanPangan) == 1, Integer.parseInt(hortikultura) == 1,perkebunan, Integer.parseInt(peternakan) == 1, Integer.parseInt(kehutanan) == 1, Integer.parseInt(perikanan) == 1);
                    // input integer


                    p.add(new Perusahaan(new KIP(new KodeProv(kodeProv), new KodeKab(kodeKab), new KodeKec(kodeKec), new KodeKJU(kodeKju), Integer.parseInt(nourut)), nama, alamat, phone, fax, Integer.parseInt(bbh),new DPP(Integer.parseInt(isDone) == 1, status), subsector));
                    break;
                case "2":
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
        // Subsector s = new Subsector(true, true, false, false, true, true);
        // s.getHortikultura().setUsaha(true);
        // s.getTanamanPangan().setUsaha(false);
        // System.out.println(s.getTanamanPangan().getSubsector());
        // System.out.println(s.getHortikultura().getSubsector());
        // System.out.println(s.getTanamanPangan().getSubsector());
        // System.out.println(s.getPerkebunan().getSubsector());
        // System.out.println(s.getKehutanan().getSubsector());
        // System.out.println(s.getPerikanan().getSubsector());

        // System.out.println(s.getPeternakan().getSubsector());



    }
}
