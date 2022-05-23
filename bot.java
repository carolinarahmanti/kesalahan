/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.util.Random;
/**
 *
 * @author newid
 */
public class bot {
    public int generateHarga(int hargaSebelum){
        Random rand = new Random();
        int lelang = rand.nextInt();
        if(lelang !=1){
            int hargaBot = rand.nextInt(hargaSebelum);
            return hargaBot;
        }else{
            return 0;
        }
    }
    
}
