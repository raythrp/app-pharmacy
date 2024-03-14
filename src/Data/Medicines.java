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
public class Medicines {
    private int id_medicine;
    private String nama_medicine;
    private String expire;
    private int amount;
    private int price;
    
    public int getid_medicine() {
        return this.id_medicine;
    }
    
    public String getnama_medicine() {
        return this.nama_medicine;
    }
    
    public String getexpire() {
        return this.expire;
    }
    
    public int getamount() {
        return this.amount;
    }
    
    public int getprice() {
        return this.price;
    }
    
    public void setid_medicine(int i) {
        this.id_medicine = i;
    }
    
    public void setnama_medicine(String s) {
        this.nama_medicine = s;
    }
    
    public void setexpire(String s) {
        this.expire = s;
    }
    
    public void setamount(int i) {
        this.amount = i;
    }
    
    public void setprice(int i) {
        this.price = i;
    }
    
    public void insertMedicine() {
        Koneksi kon = new Koneksi();
        String sql = "INSERT INTO medicines (id_medicine, nama_medicine, expire, amount, price) VALUES (NULL, '" + this.nama_medicine + "', '" + this.expire + "', " + this.amount + ", " + this.price + ")";
        kon.query(sql);
    }
    
    public void deleteMedicine() {
        Koneksi kon = new Koneksi();
        String sql = "DELETE FROM medicines WHERE id_medicine = " + this.id_medicine;
        kon.query(sql);
    }
    
    public void updateMedicine() {
        Koneksi kon = new Koneksi();
        String sql = "UPDATE medicines SET nama_medicine = '" + this.nama_medicine + "', expire = '" + this.expire + "', amount = " + this.amount + ", price = " + this.price + " WHERE id_medicine = " + this.id_medicine;
        kon.query(sql);
    }
    
    public ResultSet getAllMedicine() {
        Koneksi kon = new Koneksi();
        String sql = "SELECT * FROM medicines";
        ResultSet res = kon.getData(sql);
        
        return res;
    } 
    
    public ResultSet getWhereMedicine() {
        Koneksi kon = new Koneksi();
        String sql = "SELECT * FROM medicines WHERE id_medicine = " + this.id_medicine;
        ResultSet res = kon.getData(sql);
        
        return res;
    }
}
