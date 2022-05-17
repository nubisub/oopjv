/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan.gui;

//import com.mysql.cj.jdbc.Driver;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author hendr
 */

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Result;
public class databaseConnection {
  private ArrayList<Mahasiswa> data = new ArrayList<>();
  private static databaseConnection instance;
  private Connection connection;
  private String url = "jdbc:mysql://localhost:3306/mahasiswa";
  private String username = "root";
  private String password = "";
  databaseConnection() throws SQLException {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      this.connection = DriverManager.getConnection(url, username, password);
    } catch (ClassNotFoundException ex) {
      System.out.println("Something is wrong with the DB connection: " + ex.getMessage());
    }
  }
  public Connection getConnection() {
    return connection;
  }
  public static databaseConnection getInstance() throws SQLException {
    if (instance == null) {
      instance = new databaseConnection();
    } else if (instance.getConnection().isClosed()) {
      instance = new databaseConnection();
    }
    return instance;
  }
  // insert into database stmt
  public void insertMahasiswa(Mahasiswa mahasiswa) throws SQLException {
    data.add(mahasiswa);
    String nim = mahasiswa.getNim();
    String nama = mahasiswa.getNama();
    String sex = mahasiswa.getJenisKelamin();
    int umur = mahasiswa.getUmur();
    String alamat = mahasiswa.getAlamat();
    String provinsi = mahasiswa.getProvinsi();
    // String hobi = mahasiswa.getHobi();
    Statement stmt = getConnection().createStatement();
    String coba2;
    
      
    System.out.println(nama);
    System.out.println(nim);
    System.out.println(sex);
    System.out.println(umur);
    System.out.println(alamat);
    System.out.println(provinsi);

    // coba2 = "coba2";
    String sql = "INSERT INTO mahasiswa (nim, nama, sex, umur, alamat, provinsi) VALUES ('" + nim + "', '" + nama + "','" + sex + "','" + umur + "', '" + alamat + "','" + provinsi + "')";
    // String sql = "INSERT INTO mahasiswa (nim) VALUES ('"+coba2+"') ";
    stmt.executeUpdate(sql);
    ArrayList<String> hobi = mahasiswa.getHobi();
    for (int i = 0; i < hobi.size(); i++) {
      String namahobi = hobi.get(i);
      System.out.println(namahobi);
      String sql2 = "INSERT INTO hobi (nim, hobi) VALUES ('" + nim + "', '" + namahobi + "')";
      stmt.executeUpdate(sql2);
     
    }
  }
  // edit mahasiswa
  public void editMahasiswa(Mahasiswa mahasiswa) throws SQLException {
    data.add(mahasiswa);
    String nim = mahasiswa.getNim();
    String nama = mahasiswa.getNama();
    String sex = mahasiswa.getJenisKelamin();
    int umur = mahasiswa.getUmur();
    String alamat = mahasiswa.getAlamat();
    String provinsi = mahasiswa.getProvinsi();
    // String hobi = mahasiswa.getHobi();
    Statement stmt = getConnection().createStatement();
System.out.println(nama);
    System.out.println(nim);
    System.out.println(sex);
    System.out.println(umur);
    System.out.println(alamat);
    System.out.println(provinsi);
    // update sql where nim - nim
    String sql = "UPDATE mahasiswa SET nama = '" + nama + "', sex = '" + sex + "', umur = '" + umur + "', alamat = '" + alamat + "', provinsi = '" + provinsi + "' WHERE nim = '" + nim + "'";
    // update name where nim
    // String sql3 = "UPDATE mahasiswa SET nama = '" + nama + "' WHERE nim = '" + nim + "'";
    stmt.executeUpdate(sql); 
    ArrayList<String> hobi = mahasiswa.getHobi();
    for (int i = 0; i < hobi.size(); i++) {
      String namahobi = hobi.get(i);
      System.out.println(namahobi);
      String sql2 = "INSERT INTO hobi (nim, hobi) VALUES ('" + nim + "', '" + namahobi + "')";
      stmt.executeUpdate(sql2);

    }
    // String sql = "UPDATE 
  }


  // delete from database stmt
  public void deleteMahasiswa(String nim) throws SQLException {
    Statement stmt = getConnection().createStatement();
    String sql = "DELETE FROM mahasiswa WHERE nim = '" + nim + "'";
    stmt.executeUpdate(sql);
  }
  // select from database stmt
  public ResultSet getAllMahasiswa() throws SQLException {
    Statement stmt = getConnection().createStatement();
    String sql = "SELECT * FROM mahasiswa";
    ResultSet rs = stmt.executeQuery(sql);
    return rs;
  }
  // select from database with nim
  public ResultSet getMahasiswa(String nim) throws SQLException {
    Statement stmt = getConnection().createStatement();
    String sql = "SELECT * FROM mahasiswa WHERE nim = '" + nim + "'";
    ResultSet rs = stmt.executeQuery(sql);
    return rs;
  }
  // get hobi
  public ResultSet getHobi(String nim) throws SQLException {
    Statement stmt = getConnection().createStatement();
    String sql = "SELECT * FROM hobi WHERE nim = '" + nim + "'";
    ResultSet rs = stmt.executeQuery(sql);
    return rs;
  }
  public ResultSet getUser(String username, String password) throws SQLException {
    Statement stmt = getConnection().createStatement();
    String sql = "SELECT * FROM user WHERE username = '" + username + "' AND password = '" + password + "'";
    ResultSet rs = stmt.executeQuery(sql);
    return rs;
  }
  public void deleteHobi(String nim) throws SQLException {
    Statement stmt = getConnection().createStatement();
    String sql = "DELETE FROM hobi WHERE nim = '" + nim + "'";
    stmt.executeUpdate(sql);
  }
}
