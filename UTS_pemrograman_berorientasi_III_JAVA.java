/*
; * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.pbo2.uts_pemrograman_berorientasi_iii_java;

import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author Win 10
 */
public class UTS_pemrograman_berorientasi_III_JAVA {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("==============Selamat datang di koperasi pinjam Bangkling SitiAswinah==============");
        
        System.out.print("Nama : ");
        String nama = input.nextLine();
        System.out.print("Pinjamnya : ");
        long pinjamnya = input.nextLong();
        System.out.print("Lama Angsuran :");
        int lamaAngsuran = input.nextInt();
        
        
        double bayaran, bunga;
        
//        mulai berhitung

        if (lamaAngsuran == 3){
            bunga = (pinjamnya * (0.5 /100)) * 3;
            bayaran = (pinjamnya + bunga) / 3;
            
            System.out.println("==============================");
            System.out.println("Nama : " + nama);
            System.out.println("Pinjamnya : " + pinjamnya);
            System.out.println("Lama Angsuran : " + lamaAngsuran);
            
            Locale localeId = new Locale("in", "ID");
            NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeId);
            System.out.println("Total angsuran yang harus anda bayar perbulan sebesar : " + formatRupiah.format(bayaran));
        }
        else if (lamaAngsuran == 6) {
            bunga = (pinjamnya * 0.01) * 6;
            bayaran = (pinjamnya + bunga) / 6;
            
            System.out.println("==============================");
            System.out.println("Nama : " + nama);
            System.out.println("Pinjamnya : " + pinjamnya);
            System.out.println("Lama Angsuran : " + lamaAngsuran);
            
            Locale localeId = new Locale("in", "ID");
            NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeId);
            System.out.println("Total angsuran yang harus anda bayar perbulan sebesar : " + formatRupiah.format(bayaran));
        }
        else if (lamaAngsuran == 12) {
            bunga = (pinjamnya * 0.015) * 12;
            bayaran = (pinjamnya + bunga) / 12;
            
            System.out.println("==============================");
            System.out.println("Nama : " + nama);
            System.out.println("Pinjamnya : " + pinjamnya);
            System.out.println("Lama Angsuran : " + lamaAngsuran);
            
            Locale localeId = new Locale("in", "ID");
            NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeId);
            System.out.println("Total angsuran yang harus anda bayar perbulan sebesar : " + formatRupiah.format(bayaran));
        } 
        else {
            System.out.println("==============================");
            System.out.println("Nama : " + nama);
            System.out.println("Pinjamnya : " + pinjamnya);
            System.out.println("Lama Angsuran : " + lamaAngsuran);
            System.out.println("Lama Angsuran Tidak Tersedia");
        }
        
        
    }
}
