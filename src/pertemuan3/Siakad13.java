package Pertemuan3;

import java.util.Scanner;

public class Siakad13 {
    public   static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nama, nim = null;
        char kelas = 0;
        byte absen = 0;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;
        float bobotKuis = 20/100f, bobotTugas = 15/100f, bobotUTS = 30/100f, bobotUAS = 35/100f;

        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = sc.nextDouble();

        nilaiAkhir = (nilaiKuis * bobotKuis) + (nilaiTugas * bobotTugas) + (nilaiUTS * bobotUTS) + (nilaiUAS * bobotUAS);

        System.out.println("Nama: " + nama + " NIM: " + nim);
        System.out.println("Kelas: " + kelas + " Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);

    }
}
