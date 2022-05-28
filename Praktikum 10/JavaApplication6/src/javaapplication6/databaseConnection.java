/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package javaapplication6;
//import com.mysql.cj.jdbc.Driver;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author hendr
 */

public class databaseConnection {
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
  
}
