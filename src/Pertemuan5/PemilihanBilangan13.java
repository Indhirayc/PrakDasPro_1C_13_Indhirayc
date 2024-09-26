package Pertemuan5;

import java.util.Scanner;

public class PemilihanBilangan13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukan nilai kuis: ");
        int nilai = sc.nextInt();

        if (nilai < 75 )
        {
            System.out.println("Nilai " + nilai + " Mengikuti remidi");

        }
        else
        {
            System.out.println("Nilai " + nilai + " Tidak mengikuti remidi");
        }
    }
}
