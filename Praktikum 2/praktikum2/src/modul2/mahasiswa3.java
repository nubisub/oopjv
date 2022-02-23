/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2;

/**
 *
 * @author hendr
 */
public class mahasiswa3 {
    int nim;
    String nama;
    
    void tambahdata(int vnim, String vnama){
        nim = vnim;
        nama = vnama;
    }
    void tampilkaninfo(){
        System.out.println("nama = "+ nama + ", nim = " + nim);
    }
}
