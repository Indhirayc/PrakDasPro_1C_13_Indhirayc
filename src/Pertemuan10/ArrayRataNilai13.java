package Pertemuan10;

import java.util.Scanner;

public class ArrayRataNilai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int [] nilaiMhs = new int [10];
        double total = 0;
        double rata2Lulus, rata2TidakLulus;
        int jmlLulus = 0, jmlTidakLulus = 0, totalNilai = 0, jmlMhs, totalLulus = 0, totalTidakLulus = 0;
        System.out.print("Masukan jumlah mahasiswa: ");
        jmlMhs = sc.nextInt();

        for (int i = 0; i < jmlMhs; i++) {
            System.out.print("Masukan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs [i] = sc.nextInt();
            if (nilaiMhs [i] >= 70) {
                jmlLulus++;
                totalLulus += nilaiMhs [i];
            } else {
                jmlTidakLulus ++;
                totalTidakLulus += nilaiMhs [i];
            }
        }
        rata2Lulus = totalLulus / jmlLulus;
        rata2TidakLulus = totalTidakLulus/ jmlTidakLulus;
        System.out.println("Rata-rata nilai mahasiswa lulus = " + rata2Lulus);
        System.out.println("Rata-rata nilai mahasiswa tidak lulus = " + rata2TidakLulus);
    }  
}
