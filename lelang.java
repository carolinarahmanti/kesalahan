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
public class lelang implements proseslelang{
    //fungsi yang digunakan untuk memasukan class Interface sebagai nilai asli dari suatu program
    ArrayList<Boolean> Status = new ArrayList<Boolean>();
    ArrayList<Integer> idPenawar = new ArrayList<>();
    ArrayList<Integer> idBarang = new ArrayList<>();
    ArrayList<Integer> hargaTawar = new ArrayList<>();
    
    //polimor
    @Override
    public void addPenawar(int Id){
        this.idPenawar.add(Id);
    }
    @Override
    public void addIdBarang(int Id){
        this.idBarang.add(Id);
    }
    @Override
    public void addHargaTawar(int harga){
        this.hargaTawar.add(harga);
    }
    @Override
    public void setStatus(boolean status){
        this.Status.add(status);
    }
    @Override
    public int getHargaTertinggi(){
        return 0;
    }
    @Override
    public int getIdPenawar(){
        return 0;
    }
    @Override
    public boolean getStatus(int Id){
        return this.Status.get(Id);
    }
}
