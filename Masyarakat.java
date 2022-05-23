/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.util.ArrayList;
/**
 *
 * @author newid
 */
public class Masyarakat extends User {
    //enkap
    private ArrayList<Integer> idMasyarakat = new ArrayList<Integer>();
    private ArrayList<String> namaMasyarakat = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    
    public void Masyarakat(String nama, String alamat, String telepon){
        setNama(nama);
        setAlamat(alamat);
        setTelepon(telepon);
        setIdMasyarakat(namaMasyarakat.indexOf(nama));
    }
    
    public int gerIndexFromName(String nama){
        return namaMasyarakat.indexOf(nama);
    }
    public int getIdMasyarakat(int id){
        return idMasyarakat.get(id);
    }
    
    public void setIdMasyarakat(int id){
        this.idMasyarakat.add(id);
    }
    
    //polimor
    @Override
    public void setNama(String nama){
        this.namaMasyarakat.add(nama);
    }
    
    @Override
    public void setAlamat(String alamat){
        this.alamat.add(alamat);
    }
    
    @Override
    public void setTelepon(String telepon){
        this.telepon.add(telepon);
    }
    
    @Override
    public String getNama(int Id){
        return namaMasyarakat.get(Id);
    }
    
    @Override
    public String getAlamat(int Id){
        return alamat.get(Id);
    }
    
    @Override
    public String getTelepon(int Id){
        return alamat.get(Id);
    }
}
