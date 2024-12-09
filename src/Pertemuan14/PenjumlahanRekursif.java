package Pertemuan14;

import java.util.Scanner;

public class PenjumlahanRekursif {
    static  int nilaiN;
    static int penjumlahan(int n) {
        if (n == 0) {
            return 0;
        } else{
            return (n + penjumlahan( n -1 ));
        }
    }
    public static void main(String[] args) {
        Scanner indhira12 = new Scanner (System.in);

        System.out.print("Masukan nilai n : ");
        nilaiN = indhira12.nextInt();

        System.out.println("Hasil penjumlahan " + penjumlahan(nilaiN));
        indhira12.close();
    }
}
