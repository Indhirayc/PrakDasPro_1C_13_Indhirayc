package Pertemuan13;

import java.util.Scanner;

public class Kubus12 {
    public static void main(String[] args) {
        Scanner indhira12 = new Scanner (System.in);

        System.out.print("Masukan panjang sisi kubus :");
        int pSisi = indhira12.nextInt();
        System.out.println("Volume Kubus: " + hitungVolume(pSisi) + " cm");
        System.out.println("Luas Permukaan Kubus: " + hitungLuasP(pSisi) + " cm");
        
    }
    static int hitungVolume (int pSisi) {
        int volumeKubus = pSisi * pSisi* pSisi;
        return volumeKubus;
    }
    static int hitungLuasP (int pSisi) {
        int luasPermukaan = 6 * (pSisi * pSisi);
        return luasPermukaan;
    }
} 
