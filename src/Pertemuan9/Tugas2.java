package Pertemuan9;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int jumlahPoliteknik;

        System.out.print("Masukkan jumlah politeknik yang mendaftar: ");
        jumlahPoliteknik = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < jumlahPoliteknik; i++) {
            System.out.println("Data Atlet Politeknik ke-" + (i+1));
            System.out.println("===Daftar Atlet Badminton===");
            for (int j = 0; j < 5; j++) {
                System.out.print("Masukkan nama atlet Badminton ke-" + (j+1) + ": ");
                String nama = sc.nextLine();
            }
                System.out.println("===Daftar Atlet Tenis Meja===");
            for (int j = 0; j < 5; j++) { 
                System.out.print("Masukkan nama atlet Tenis Meja ke-" + (j+1) + ": ");
                String nama = sc.nextLine();
            }
            System.out.println("===Daftar Atlet Basket===");
            for (int j = 0; j < 5; j++) {
                System.out.print("Masukkan nama atlet Basket ke-" + (j+1) + ": ");
                String nama = sc.nextLine();
            }
            System.out.println("===Daftar Atlet Bola Voly===");
            for (int j = 0; j < 5; j++) {
                System.out.print("Masukkan nama atlet Bola Voly ke-" + (j+1) + ": ");
                String nama = sc.nextLine();
            }
        }
    }
}