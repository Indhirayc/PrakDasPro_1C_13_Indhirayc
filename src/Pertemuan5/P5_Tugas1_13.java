package Pertemuan5;

import java.util.Scanner;

public class P5_Tugas1_13 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        String nama, nim, nilaiHuruf, kualifikasi = null ;
        char kelas = 0;
        byte absen = 0;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukan kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukan nomor absen: ");
        absen = sc.nextByte();
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = sc.nextDouble();

       nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;
       if (nilaiAkhir >= 100) {
        nilaiHuruf = "A";
        kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir >= 73) {
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari baik";
        } else if (nilaiAkhir >= 65) {
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        } else if (nilaiAkhir >= 60) {
            nilaiHuruf = "C+";
            kualifikasi = "Lebih dari Cukup";
        } else if (nilaiAkhir >= 50) {
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
        } else if (nilaiAkhir >= 39) {
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
        } else {
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
        }
        System.out.println("Mahasiswa dengan nama: " + nama + " NIM: " + nim + "Kelas: " + kelas + " Nomor absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai akhir huruf: " + nilaiHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);
    }
}