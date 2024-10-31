package Pertemuan10;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilaiMhs = 0, jmlMhs = 0, nilaiTertinggi = 0, nilaiTerendah = 100;
        double rata2 = 0, totalNilai = 0;

        System.out.print("Masukan jumlah nilai mahasiswa : ");
        nilaiMhs = sc.nextInt();
        int [] nilaiAkhir = new int [nilaiMhs];
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiAkhir [i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiAkhir.length; i++) {
            totalNilai += nilaiAkhir[i];
            rata2 = totalNilai / nilaiAkhir.length;
        }
        for (int i =0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiAkhir[i];
            } if (nilaiAkhir[i] < nilaiTerendah) {
                nilaiTerendah = nilaiAkhir[i];
            }
        }
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.println("Nilai ke-" + (i + 1) + " : " + nilaiAkhir[i]);
        }
        System.out.println("Nilai tertinggi :" + nilaiTertinggi);
        System.out.println("Nilai terendah : " + nilaiTerendah);
        System.out.println("Nilai rata-rata mahasiswa : " + rata2 );
    }
}