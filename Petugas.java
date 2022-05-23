package javaapplication2;

import java.util.ArrayList;
/**
 *
 * @author newid
 */
public class Petugas extends User{
//mewariskan method dari kelas induk
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    //ArrayList dapat menambah data baru secara dinamis tanpa harus menentukan ukurannya di awal
    
    public void doYourJob (barang barang){
        System.out.print("Nama Barang : ");
        barang.addNamaBarang();
        System.out.print("Harga Awal Barang : ");
        barang.addHargaAwal();
        barang.setStatus(true);
    }
    
    public Petugas(String nama, String alamat, String telepon){
        setNama(nama);
        setAlamat(alamat);
        setTelepon(telepon);
    }
    
    //polimor
    @Override
    public void setNama(String nama){
        this.namaPetugas.add(nama);
    }
    
    @Override
    public void setAlamat(String alamat){
        this.telepon.add(alamat);
    }
    
    @Override
    public void setTelepon(String telepon){
        this.telepon.add(telepon);
    }
    
    @Override
    public String getNama(int Id){
        return namaPetugas.get(Id);
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
