/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan.gui;

import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hendr
 */
public class coba {
    public static void main(String[] args) throws SQLException {
        databaseConnection conn = null;
        try {
             conn = databaseConnection.getInstance();
//            databaseConnection conn1 = databaseConnection.getInstance();
        } catch (SQLException ex) {
            Logger.getLogger(coba.class.getName()).log(Level.SEVERE, null, ex);
        }
        
//        Statement stmt = conn.createStatement();
        java.sql.Statement stmt = conn.getConnection().createStatement();
        String sql = "INSERT INTO mahasiswa (nim) VALUES ('coba')";
        stmt.executeUpdate(sql);
        
    }
}
