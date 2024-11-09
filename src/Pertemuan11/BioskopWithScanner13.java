package Pertemuan11;

import java.util.Scanner;

public class BioskopWithScanner13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        String nama, next = null;
        int baris, kolom, pilihanMenu;
        String[][] penonton = new String[4][2];

        while (true) { 
            System.out.println("----------------------------------------");
            System.out.println("============= MENU BIOSKOP =============");
            System.out.println("----------------------------------------");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Masukan angka dari menu yang dipilih : ");
            pilihanMenu = sc.nextInt();
            sc.nextLine();
            System.out.println("----------------------------------------");
            
            if (pilihanMenu == 1) {
                do {
                    System.out.print("Masukan nama: ");
                    nama = sc.nextLine();
                    
                    System.out.print("Masukan baris: ");
                    baris = sc.nextInt();
                    
                    System.out.print("Masukan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Baris dan kolom tidak valid.");
                    } else if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi pada baris " + baris + " Kolom " + kolom + " sudah terisi. Pilih kursi lain");
                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton disimpan.");
                    }
                    System.out.print("Input penonton lainnya? (y/n) : ");
                    next = sc.nextLine();

                } while (next.equalsIgnoreCase("y")) ; 
            
            } else if (pilihanMenu == 2) {
                System.out.println("Daftar Penonton: ");
                for (int i = 0; i < penonton.length; i++) {
                    System.out.print("Penonton baris ke-" + (i + 1) + ": ");
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.print("***");
                        } else {
                            System.out.print(penonton[i][j]);
                        }
                        if (j < penonton[i].length-1){
                            System.out.print(", ");
                        }
                    }
                    System.out.println();
                } 
            
            }else if (pilihanMenu == 3){
                System.out.println("Anda telah keluar dari program");
                break;
            } else {
                System.out.println("Pilihan menu tidak valid. Silahkan coba lagi");
            }
        }   
    }
}