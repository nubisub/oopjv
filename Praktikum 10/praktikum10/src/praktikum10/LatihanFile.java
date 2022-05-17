/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10;

import java.io.File;

/**
 *
 * @author hendr
 */
public class LatihanFile {
    public static void main(String[] args) {
 // TODO code application logic here
 File f = new File("D:\\Kuliah\\Tugas\\Praktikum\\1.Object Oriented Programming\\Praktikum 10\\praktikum10\\test\\TextFile.txt");
 System.out.println(f.getName());
 System.out.println(f.getParent());
 System.out.println(f.canWrite());
 }
}
