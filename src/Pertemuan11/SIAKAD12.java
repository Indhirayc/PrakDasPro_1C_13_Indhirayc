package Pertemuan11;

import java.util.Scanner;

public class SIAKAD12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukan jumlah siswa: ");
        int jumlahSiswa = sc.nextInt();
        System.out.print("Masukan jumlah Mata Kuliah: ");
        int jumlahMatkul = sc.nextInt();

        int[][] nilai = new int [jumlahSiswa][jumlahMatkul];

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("\nInput nilai mahasiswa ke-" + (i+1));
            double totalPerSiswa = 0;

            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata: " + totalPerSiswa/jumlahMatkul);
            System.out.println("====================================== ");
        }

        System.out.println("\nRata-rata Nilai setiap Mata Kuliah : ");
        for (int j = 0; j < jumlahMatkul; j++) {
            double totalPerMatkul = 0;
            
            for (int i = 0; i < jumlahSiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j+1) + ": " + totalPerMatkul/jumlahMatkul);
        }
    }
}
