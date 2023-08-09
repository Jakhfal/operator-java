public static void main (sting args {})
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jakhfal
 */
public class kasirSederhana {
    public static void main(String [] args) {
        System.out.println("1. Soto daging (15000)"); 
        System.out.println("2. Rawon daging (17000)"); 
        System.out.println("3. Mie (6000)"); 
        System.out.println("4. Sate daging (10000)"); 
        
        int soto=15000;
        int Rawon=17000;
        int Mie=6000;
        int Sate=10000;
        
        int JumlahBeli,total,bayar,kembali;
        Scanner input = new Scanner(System.in);
                                                                    
        System.out.println("Jumlah beli soto");
        int Jumlahsoto= input.nextInt(); 
        total= Jumlahsoto*soto;
        
        System.out.println("Jumlah beli rawon");
        int JumlahRawon= input.nextInt(); 
        total+=JumlahRawon*Rawon;
        
        System.out.println("Jumlah beli Mie");
        int JumlahMie= input.nextInt(); 
        total+=JumlahMie*Mie;
        
        System.out.println("Jumlah beli Sate");
        int JumlahSate= input.nextInt(); 
        total+=JumlahSate*Sate;
        
        System.out.println("Total Pembelian: "+total);
        System.out.println("Masukkan Pembayaran:");
        bayar=input.nextInt();
        kembali=bayar-total;
        System.out.println("Jumlah Kembalian: "+kembali);
        
        system.out.println=" === SELESAI === ";
    }
}
