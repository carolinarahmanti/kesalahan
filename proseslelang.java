package javaapplication2;

import java.util.ArrayList;
//inter
//adalah nilai abstrak yang belum diisi apa-apa
//mengandung deklarasi method tanpa implemen
public interface proseslelang {
    void addPenawar(int Id);
    void addIdBarang(int Id);
    void addHargaTawar(int harga);
    void setStatus(boolean status);
    
    int getHargaTertinggi();
    int getIdPenawar();
    boolean getStatus(int id);
}
