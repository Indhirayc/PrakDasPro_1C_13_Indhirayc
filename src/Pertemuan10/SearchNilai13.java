package Pertemuan10;

import java.util.Scanner;

public class SearchNilai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int hasil = -1, jmlMhs = 0, cariNilai = 0;

        System.out.print("Masukan jumlah mahasiswa: ");
        jmlMhs = sc.nextInt();
        int [] arrNilai = new int [jmlMhs];
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukan nilai mahasiswa ke-" + (i+1) + " : ");
                arrNilai [i] = sc.nextInt();
            }
            System.out.print("Masukan nilai dicari : ");
            cariNilai = sc.nextInt();
        
        for ( int i = 0; i < arrNilai.length; i++) {
            if ( cariNilai == arrNilai [i]) {
                hasil = i+1;
                System.out.println();
                System.out.println("Nilai " + cariNilai + " ketemu di indeks ke-" + hasil);
                System.out.println();
                break;
            } 
        }
        if ( hasil == -1) {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
    }
}
