package Pertemuan5;

import java.util.Scanner;

public class P5_Tugas2_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double nominalBayar = 0;
        double totalHarga;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
        float diskon = 10/100f;

        System.out.print("Masukan keanggotaan (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.print("Masukan jumlah pembelian kopi: ");
        jmlKopi = input.nextInt();
        System.out.print("Masukan jumlah pembelian teh: ");
        jmlTeh = input.nextInt();
        System.out.print("Masukan jumlah pembelian roti: ");
        jmlRoti = input.nextInt();

        totalHarga =  ((jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti));
        byte totalByte = (byte) totalHarga;

        System.out.println("Total harga: " + totalHarga);
        
        if ( keanggotaan == true) {
            nominalBayar = totalHarga - (diskon * totalHarga);
        } else if ( keanggotaan == false ){
            nominalBayar = totalHarga;
        }
        System.out.println("Keanggotaan pelanggan: " + keanggotaan);
        System.out.println("Item pembelian: "  + jmlKopi + " kopi, " + jmlTeh + " teh, " + jmlRoti + " roti ");
        System.out.println("Nominal bayar Rp " + nominalBayar);
        
    }
}
