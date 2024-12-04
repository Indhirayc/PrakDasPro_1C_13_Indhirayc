package Pertemuan13;

import java.util.Scanner;

public class Tugas2 {
    static Scanner indhira12 = new Scanner (System.in);
    static int jumlahHari,  jumlahMenu;
    static int [] hari;
    static String [] menu;
    static int [][] rekapPenjualan;
        public static void main(String[] args) {
            System.out.print("Masukan jumlah menu: ");
            jumlahMenu = indhira12.nextInt();
            System.out.print("Masukan jumlah hari: ");
            jumlahHari = indhira12.nextInt();
            indhira12.nextLine();

            hari = new int [jumlahHari];
            menu = new String[jumlahMenu];
            rekapPenjualan = new int[jumlahMenu][jumlahHari];

            for (int i = 0; i < jumlahHari; i++) {
                hari[i] = i + 1;
            }
            System.out.println("Masukan nama menu");
            for (int i = 0; i < jumlahMenu; i++) {
                System.out.print("Menu ke-" + (i + 1) + ": ");
                menu[i] = indhira12.nextLine();
            }
    
            while (true) { 
                System.out.println("-----------------------------------------------------");
                System.out.println("================== Menu Rekap Data ==================");
                System.out.println("1. Inputkan data penjualan");
                System.out.println("2. Tampilkan seluruh data penjualan");
                System.out.println("3. Tampilkan menu yang memiliki penjualan tertinggi");
                System.out.println("4. Tampilkan rata-rata penjualan setiap menu");
                System.out.println("5. Keluar");
                System.out.println("----------------------------------------------------");
                System.out.print("\nMasukan menu yang dipilih: ");
                int pilihMenu = indhira12.nextInt();
                indhira12.nextLine();

                if (pilihMenu == 1) {
                    inputData();
                } else if (pilihMenu == 2) {
                    tampilkanData();
                } else if (pilihMenu == 3) {
                    penjualanTertinggi();
                } else if (pilihMenu == 4) {
                    rata2Penjualan();
                } else if (pilihMenu == 5) {
                    System.out.println("Keluar dari program");
                    break;
                } else {
                    System.out.println("Pilihan tidak valid.");
                }
            
        }
    }
    public static void inputData () {
        System.out.println("Masukan data penjualan (dari hari ke-1 sampai ke-7)");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(" Masukan data untuk " + menu[i]);
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print("  Hari ke-" + (j+1) + " : ");
                rekapPenjualan[i][j] = indhira12.nextInt();
            }
        }
        System.out.println("Input rekap penjualan selesai.");
    }
    public static void tampilkanData () {
        System.out.println("Rekap Data penjualan");
        for (int i = 0; i < jumlahHari; i++) {
            System.out.print("              Hari ke-" + hari[i]);
        }
        System.out.println();
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + " ");
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print("     " + rekapPenjualan[i][j] + "                 ");
            }
            System.out.println();
        }
    }
    public static void penjualanTertinggi() {
        int total = 0;
        String menuTertinggi = "";

        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < rekapPenjualan[i].length; j++) {
                totalPenjualan += rekapPenjualan[i][j];
            } if (i == 0 || totalPenjualan > total) {
                total = totalPenjualan;
                menuTertinggi = menu[i];
            }
        }
        System.out.println("Menu dengan penjualan tertinggi adalah " + menuTertinggi + " dengan total penjualan " + total);
    }
    public static void rata2Penjualan () {
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < rekapPenjualan[i].length; j++) {
                total += rekapPenjualan[i][j];                
            }
            double rata2 = (double) total/rekapPenjualan[i].length;
            System.out.println(menu[i] + ": " + rata2);
        }
    }
}