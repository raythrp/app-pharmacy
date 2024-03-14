/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Rayhan, Eka, Umar
 */
public class Koneksi {
    private String dbuser = "root";
    private String dbpass = "";
    private Statement stmt = null;
    private Connection con = null;
    private ResultSet res = null;
    
    public Koneksi() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "" + e.getMessage(), "JDBC Driver Error", JOptionPane.WARNING_MESSAGE);
        }
        
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/pbo_apotek", dbuser,dbpass);
            stmt = con.createStatement();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "" + e.getMessage(), "Connection Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public ResultSet getData(String sql) {
        try {
            res = stmt.executeQuery(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "" + e.getMessage(), "Connection Error", JOptionPane.WARNING_MESSAGE);
        }
        
        return res;
    }
    
    public void query(String sql) {
        try {
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "" + e.getMessage(), "Connection Error", JOptionPane.WARNING_MESSAGE);
        }
    }
}
