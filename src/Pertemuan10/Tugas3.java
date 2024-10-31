package Pertemuan10;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int hasil = -1;
        String [] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", 
        "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        System.out.print("Masukan nama makanan yang di cari : ");
        String namaYgDiCari = sc.nextLine();

        for (int i = 0; i < menu.length; i++) {
            if (namaYgDiCari.equalsIgnoreCase(menu[i])) {
                hasil = i;
                System.out.println("Makanan ditemukan");
                break;
            }
        }
        if (hasil == -1) {
            System.out.println("Tidak ditemukan");
        }
    }
}