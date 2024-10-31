package Coba;

import java.util.Scanner;

public class fc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int[] array = new int[30]; // Deklarasi array dengan ukuran 30

        // Pengisian elemen array
        for (int i = 0; i < 30; i++) {
            System.out.print("Masukkan nilai untuk elemen array[" + i + "]: ");
            array[i] = sc.nextInt(); // Input nilai dari pengguna
        }

        // Menampilkan isi array
        System.out.println("\nIsi array:");
        for (int j = 0; j < 30; j++) {
            System.out.println("array[" + j + "] = " + array[j]); // Menampilkan setiap elemen
        }

        sc.close(); // Menutup scanner
    }
}
