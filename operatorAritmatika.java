/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SMK TELKOM 032
 */
public class operatorAritmatika {
    public static void main(String args[]) {
        
        int bilangan1=15;
        int bilangan2=5;
        int hasilPenjumlahan = bilangan1+bilangan2;
        int hasilPengurangan = bilangan1-bilangan2;
        int hasilPerkalian = bilangan1*bilangan2;
        int hasilPembagian = bilangan1/bilangan2;
        
        
        System.out.println("===  ARITMATIKA  ===");
        System.out.println("bilanngan1 = " + bilangan1);
        System.out.println("bilangan2  =" + bilangan2);
        
        System.out.println("hasilPenjumlahan = " + hasilPenjumlahan);
        System.out.println("hasilpengurangan = " + hasilPengurangan);
        System.out.println("hasilperkalian = " + hasilPerkalian);
        System.out.println("hasilpembagian =  " + hasilPembagian);
        
        
        System.out.println("  === RATA RATA ===  ");
        
        double NilaiIpa = 90.9;
        double NilaiMTK = 81.4;
        double NilaiInformatika = 91.0;
        double NilaiPai = 99.0;
        
        System.out.println("NilaiIpa = " + NilaiIpa);
        System.out.println("NilaiMTK = " + NilaiMTK);
        System.out.println("NilaiInformtika = " + NilaiInformatika);
        System.out.println("NilaiPai = " + NilaiPai);
        
        double nilaiRata = 
    (NilaiIpa+NilaiMTK+NilaiInformatika+NilaiPai)/4;
        
        System.out.println(" nilaiRata = " + nilaiRata);
        
         double BeratBadan = 62;
        double TinggiBadan = 161;
        
        double HasilBMI = (BeratBadan / (TinggiBadan*TinggiBadan));
        System.out.println("hasil BMI:"+HasilBMI);
        
    }
        
        
        
    }

