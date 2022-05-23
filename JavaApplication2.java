package javaapplication2;

import java.util.Scanner;
/**
 *
 * @author newid
 */
public class JavaApplication2 {
    /*Var*/
    static Masyarakat masyarakat = new Masyarakat();
    static barang barangLelang = new barang();
    static Petugas petugas = new Petugas("Bapak Jon", "Bukan Malang", "081111111113");
    
    static Scanner userInput = new Scanner(System.in);
    static Scanner ulangi = new Scanner(System.in);
    
    static String jawab = "";
    static String user_input = "";
    static int Pilihan;
    
    static String loginName = "";
    static bot opponent = new bot();
    static int currentHarga;
    
    static int bot_harga;
    static int user_harga;
    /*Var*/
    
    public static void main(String[] args) {
        login();
        askGeneratebarang();
        askAjukanBarang();
        System.out.println("Daftar barang");
        System.out.println();//jarak
        barangLelang.tampilBarang();
        
        System.out.println("Barang mana yang ingin anda tawar? : ");
        Pilihan = userInput.nextInt();
        if (Pilihan > barangLelang.idBarang.size() || !barangLelang.getStatus(Pilihan)){
            System.out.println("Homor barang tidak valid");
        }else{
            System.out.println("Barang : "+ barangLelang.getNamaBarang(Pilihan));
            System.out.println("Harga awal : " + barangLelang.getHargaAwal(Pilihan));
            System.out.println("Status : "+ barangLelang.getStatus(Pilihan));
            barangLelang.addPenawar(masyarakat.getIdMasyarakat(masyarakat.gerIndexFromName(loginName)));
            barangLelang.overrideHargaTawar();
            barangLelang.addHargaTawar(Integer.parseInt(barangLelang.getHargaAwal(Pilihan)));
            
            lelangStart();
        }
        pemenang();
    }
    
    static boolean UserAnswerIsYes(String input){
        return input.equalsIgnoreCase("y");
        
    }
    
    static void login(){
        System.out.println("---- MASUK ----");
        System.out.println("Nama : ");
        String nama = userInput.nextLine();
        loginName = nama;
        System.out.println("Alamat : ");
        String alamat = userInput.nextLine();
        System.out.println("Telepon : ");
        String telepon = userInput.nextLine();
        masyarakat.Masyarakat(nama, alamat, telepon);
    }
    
    static void askGeneratebarang(){
        //meminta memuat
        System.out.println("Muat barang? (y/n) : ");
        user_input = userInput.nextLine();
        
        if(UserAnswerIsYes(user_input)){
            generatebarang();
            System.out.println("Barang Lelang Termuat");
        }else{
            System.out.println("Maaf, terjadi kesalahan");
        }
    }
    
    static void askAjukanBarang(){
        //jika ingin mengajukan
        System.out.println("Ajukan barangmu untuk lelang? (y/n) : ");
        user_input = userInput.nextLine();
        if (UserAnswerIsYes(user_input)){
            petugas.doYourJob(barangLelang);
            System.out.println("Barang ditambahkan");
        }else{
            System.out.println("");
        }
    }
    
    static void lelangStart(){
        do {
            
            /*logic here*/
            //our turn
            currentHarga = barangLelang.getHargaTertinggi();
            System.out.println("harga Saat ini : " + currentHarga);
            System.out.println(); //jarak
            System.out.println("Masukkan harga : ");
            int harga = userInput.nextInt();
            
            System.out.println(); //jarak
            
            if(harga <= barangLelang.getHargaTertinggi()){
                System.out.println("harga anda terlalu rendah");
            }else {
                barangLelang.addHargaTawar(harga);
                user_harga = harga;
            }
            //System.out.println(); //jarak
            
            currentHarga = barangLelang.getHargaTertinggi();
            
            //bot turn
            bot_harga = opponent.generateHarga(currentHarga);
            if(harga < barangLelang.getIdMasyarakat()){
                System.out.println("Bot : Skip");
            }else {
                barangLelang.addHargaTawar(bot_harga);
                System.out.println("Bot : "+ bot_harga);
            }
            currentHarga = barangLelang.getHargaTertinggi();
            System.out.println();//jarak
            ///logic here/
            
            System.out.println("apakah anda ingin menawar lagi? (y/n) : ");
            jawab = ulangi.nextLine();
            
        } while (UserAnswerIsYes(jawab));
    }
    
    static void generatebarang(){
        barangLelang.addNamaBarang("Yoyo");
        barangLelang.addHargaAwal("5000");
        barangLelang.addHargaTawar(5000);
        barangLelang.setStatus(true);
        
        barangLelang.addNamaBarang("Gasing");
        barangLelang.addHargaAwal("10000");
        barangLelang.addHargaTawar(10000);
        barangLelang.setStatus(true);
        
        barangLelang.addNamaBarang("Robot");
        barangLelang.addHargaAwal("999999");
        barangLelang.addHargaTawar(999999);
        barangLelang.setStatus(true);
    }
    
    static void pemenang(){
        barangLelang.setStatus(Pilihan, false);
        if(currentHarga == user_harga){
            System.out.println("Pemenang "+ barangLelang.getNamaBarang(Pilihan));
            System.out.println("Adalah : "+ loginName);
            System.out.println("Dengan harga : "+ currentHarga);
        }else {
            System.out.println("Pemenang "+ barangLelang.getNamaBarang(Pilihan));
            System.out.println("Adalah : BOT");
            System.out.println("Dengan harga : "+ currentHarga);
        }
    }
    
}
