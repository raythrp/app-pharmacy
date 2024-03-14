/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.sql.ResultSet;

/**
 *
 * @author Rayhan, Eka, Umar
 */
public class Transactions {
    private int id_transaction;
    private String id_admin;
    private int price;
    private int id_medicine;
    private String time_transaction;
    
    public int getid_transaction() {
        return this.id_transaction;
    }
    
    public int getprice() {
        return this.price;
    }
    
    public int getid_medicine() {
        return this.id_medicine;
    }
    public String getid_admin() {
        return this.id_admin;
    }
    
    public String gettime_transaction() {
        return this.time_transaction;
    }
    
    public void settime_transaction(String s) {
        this.time_transaction = s;
    }
    
    public void setid_medicine(int i) {
        this.id_medicine = i;
    }
    public void setid_admin(String i) {
        this.id_admin = i;
    }
    
    public void setprice(int i) {
        this.price = i;
    }
    
    public void insertTransaction() {
        Koneksi kon = new Koneksi();
        String sql = "INSERT INTO transactions (id_transaction, price, id_medicine, time_transaction, id_admin) VALUES (NULL, " + this.price + ", " + this.id_medicine + ", '" + this.time_transaction + "', '" + this.id_admin + "')";
        kon.query(sql);
    }
    
    public ResultSet getAllTransaction() {
        Koneksi kon = new Koneksi();
        String sql = "SELECT * FROM transactions";
        ResultSet res = kon.getData(sql);
        
        return res;
    } 
}
