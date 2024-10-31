package Pertemuan10;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double total = 0;
        System.out.print("Masukan jumlah pesanan : ");
        int jmlPesanan = sc.nextInt();
        sc.nextLine();
        String [] namaMakanan = new String[jmlPesanan];
        double [] hargaMakanan = new double[jmlPesanan];

        for (int i = 0; i < jmlPesanan; i++) {
            System.out.print("Masukan nama makanan : ");
            namaMakanan[i] = sc.nextLine();
            System.out.print("Masukan harga makanan : ");
            hargaMakanan[i] = sc.nextDouble();
            sc.nextLine();
        }
        for (double harga : hargaMakanan) {
            total += harga;
        }
        for (int i = 0; i < jmlPesanan ; i++) {
            System.out.println("Pesanan ke-" + (i+1) + " " + namaMakanan[i] + " : " + (int) hargaMakanan[i] );
        }
        System.out.println("Total harga : " + total);
    }
}