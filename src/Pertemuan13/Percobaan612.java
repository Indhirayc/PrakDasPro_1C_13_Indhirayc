package Pertemuan13;

import java.util.Scanner;

public class Percobaan612 {
    public static void main(String[] args) {
        Scanner indhira12 = new Scanner(System.in);

        int p,l,t,L,vol;

        System.out.print("Masukan panjang: ");
        p = indhira12.nextInt();
        System.out.print("Masukan lebar: ");
        l = indhira12.nextInt();
        System.out.print("Masukan tinggi: ");
        t = indhira12.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas Persegi panjang adalah " + L);

        vol = hitungVolume(t, p, L);
        System.out.println("Volume Balok adalah " + vol);
    }
    static int hitungLuas (int pjg, int lb) {
        int Luas = pjg*lb;
        return Luas;
    }
    static int hitungVolume (int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }
}
