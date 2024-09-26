package Kuis1;

import java.util.Scanner;

public class Kuis1_13_Indhira {
    private static double bulan13;

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Nama  : Indhira Yuantika Christy");
        System.out.println("NIM   : 244107020171");
        System.out.println("Absen : 13 ");
        System.out.println("========== QUIZ 1 TI - 1C ==========");

        int hari13 = 30, bulan13 = 12, tahun13 = 2000, lamaWaktu13, lamahariBerangkat13, lamaBerangkat13, lamaBulan13, lamaTahun13;
        int tglBerangkat13, bulanBerangkat13, tahunBerangkat13, tglPulang13 = 0, bulanPulang13 = 0,  tahunPulang13 = 0;

        System.out.print("Masukan tanggal berangkat: ");
        tglBerangkat13 = input.nextInt();
        System.out.print("Masukan bulan berangkat: ");
        bulanBerangkat13 = input.nextInt();
        System.out.print("Masukan tahun berangkat: ");
        tahunBerangkat13 = input.nextInt();

        System.out.println("Tanggal berangkat: " + tglBerangkat13 + "-" + bulanBerangkat13 + "-" + tahunBerangkat13);

        System.out.print("Masukan tanggal pulang: ");
        tglBerangkat13 = input.nextInt();
        System.out.print("Masukan bulan pulang: ");
        tglBerangkat13 = input.nextInt();
        System.out.print("Masukan tanggal pulang: ");
        tglBerangkat13 = input.nextInt();


       int lamahari13 = tglBerangkat13 + (bulanBerangkat13 * bulan13) + (tahunBerangkat13 * tahun13) + tglPulang13;
       lamaBulan13 = bulan13 % lamahari13;
       lamaTahun13 = tahun13; 

    

        System.out.println ("Lama Student Exchange anda adalah: " + lamahari13 + " hari " + lamaBulan13 + " bulan " + lamaBulan13 + " tahun " + lamaTahun13);


    }
}
