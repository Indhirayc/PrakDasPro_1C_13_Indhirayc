package Pertemuan3;

import java.util.Scanner;

public class P3_Tugas1_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double tarifPerKWH = 1500, ketentuanListrik = 500, penggunaanListrik,  totalTagihan;

        System.out.print("Masukan penggunaan jumlah listrik: ");
        penggunaanListrik = sc.nextDouble();

        totalTagihan = tarifPerKWH * penggunaanListrik;

        System.out.println("Penggunaan listrik: " + penggunaanListrik);
        System.out.println("Penggunaan listrik lebih dari 500 KWH: " + (penggunaanListrik > ketentuanListrik));
        System.out.println("Total tagihan listrik: " + totalTagihan);

        }

}