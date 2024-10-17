package Pertemuan7;

import java.util.Scanner;

public class P7_Tugas1_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        String namaPelanggan;
        double hargaTiket = 50000, jmlTiket, totalHarga, diskon;

        do { 
            System.out.print("Masukan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan. ");
                break;
            }
            System.out.print("Masukan Jumlah tiket yang ingin di beli: ");
            jmlTiket = sc.nextInt();
            
            if (jmlTiket > 4) {
                diskon =  0.1;
                totalHarga = (hargaTiket * jmlTiket) - (hargaTiket * diskon);
                System.out.println("Total harga yang harus di bayar: " + totalHarga); 
            } else if (jmlTiket > 10) {
                diskon = 0.15;
                totalHarga = (hargaTiket * jmlTiket) - (hargaTiket * diskon);
                System.out.println("Total harga yang harus di bayar: " + totalHarga); 
            } else {
                diskon = 0;
                totalHarga = hargaTiket * jmlTiket;
                System.out.println("Total harga yang harus di bayar: " + totalHarga); 
            } 
            sc.nextLine();
        } while (true);
    }
}