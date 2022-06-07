/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hendr
 */
public class Praktikum10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
 FileOutputStream fos = new FileOutputStream("D:\\Kuliah\\Tugas\\Praktikum\\1.Object Oriented Programming\\Praktikum 10\\praktikum10\\test\\objek.dat");
 ObjectOutputStream oos = new ObjectOutputStream(fos);
 Mahasiswa mhs = new Mahasiswa();
 mhs.setNim("1234");
 mhs.setNama("Andi");
 oos.writeObject(mhs);
 oos.close();
 fos.close();
 } catch (FileNotFoundException ex) {
 
Logger.getLogger(LatihanFile.class.getName()).log(Level.SEVERE, 
null, ex);
 } catch (IOException ex) {
 
Logger.getLogger(LatihanFile.class.getName()).log(Level.SEVERE, 
null, ex);
 }


    }
    
}
