package Pertemuan3;

import java.util.Scanner;

public class P3_Tugas2_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jamKerja, upahPerJam;
        double gajiPokok, gajiKotor, gajiBersih;
        float bonus = 10/100f, pajak = 5/100f;

        System.out.print("Masukkan jumlah jam kerja: ");
        jamKerja = scanner.nextInt();
        System.out.print("Masukkan upah per jam: ");
        upahPerJam = (int) scanner.nextDouble();

        gajiPokok = jamKerja * upahPerJam;
        gajiKotor = gajiPokok + (gajiPokok * bonus);
        gajiBersih = gajiKotor - (gajiKotor * pajak);

        System.out.println("Gaji pokok: Rp " + gajiPokok);
        System.out.println("Gaji kotor: Rp " + gajiKotor);
        System.out.println("Gaji bersih: Rp " + gajiBersih);

    }
    }