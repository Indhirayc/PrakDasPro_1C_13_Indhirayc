package Pertemuan10;

import java.util.Scanner;

public class SearchNilai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] arrNilai = new int [10];
        int hasil = 0, jmlMhs = 0, cariNilai = 0;

        System.out.print("Masukan jumlah mahasiswa: ");
        jmlMhs = sc.nextInt();
        for (int i = 0; i < jmlMhs; i++) {
            System.out.print("Masukan nilai mahasiswa ke-" + (i+1) + " : ");
                arrNilai [i] = sc.nextInt();
            }
            System.out.print("Masukan nilai dicari : ");
            cariNilai = sc.nextInt();
        
        for ( int i = 0; i < arrNilai.length; i++) {
            if ( cariNilai == arrNilai [i]) {
                hasil = i+1;
                break;
            } else {
                System.out.println("Nilai yang dicari tidak ditemukan");
                break;
            }
        }
        System.out.println();
        System.out.println("Nilai " + cariNilai + " ketemu di indeks ke-" + hasil);
        System.out.println();
    }
}
