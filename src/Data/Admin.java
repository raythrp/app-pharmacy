/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Eka, Umar, Rayhan
 */
public class Admin {
    private String id_admin;
    private String nama_admin;
    private String cp;
    private String password;
    
    public Admin(){}
    
    public String getid_admin() {
        return this.id_admin;
    }
    
    public String getnama_admin() {
        return this.nama_admin;
    }
    
    public String getcp() {
        return this.cp;
    }
    
    public String getpassword() {
        return this.password;
    }
    
    public void setid_admin(String s) {
        this.id_admin = s;
    }
    
    public void setnama_admin(String s) {
        this.nama_admin = s;
    }
    
    public void setcp(String s) {
        this.cp = s;
    }
    
    public void setpassword(String s) {
        this.password = s;
    }
    
    public void insertAdmin() {
        Koneksi kon = new Koneksi();
        String sql = "INSERT INTO admin VALUES ('" + this.id_admin + "', '"  + this.nama_admin + "', '" + this.cp + "', '" + this.password + "')";
        kon.query(sql);
    }
    
    public ResultSet getWhereAdmin() {
        Koneksi kon = new Koneksi();
        String sql = "SELECT * FROM admin WHERE id_admin = '" + this.id_admin + "'";
        ResultSet res = kon.getData(sql);
        
        return res;
    }
    
    public void updateAdmin() {
        Koneksi kon = new Koneksi();
        String sql = "UPDATE admin SET nama_admin = '" + this.nama_admin + "', cp = '" + this.cp + "', password = " + this.password + " WHERE id_admin = '" + this.id_admin + "'";
        kon.query(sql);
    }
}
