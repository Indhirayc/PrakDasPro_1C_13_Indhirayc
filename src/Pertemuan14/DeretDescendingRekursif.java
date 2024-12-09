package Pertemuan14;

import java.util.Scanner;

public class DeretDescendingRekursif {
    static int nilaiN;
    static void fungsiRekusif (int n) {
        if (n < 0) {
            return;
        }
        System.out.print(n + " ");
        fungsiRekusif(n - 1);
    }
    static void fungsiIteratif (int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i +" ");
        }
    }
    public static void main(String[] args) {
        Scanner indhira12 = new Scanner (System.in);

        System.out.print("Masukan nilai n : ");
        nilaiN = indhira12.nextInt();

        System.out.print("Rekursif: ");
        fungsiRekusif(nilaiN);
        System.out.print("\nIteratif: ");
        fungsiIteratif(nilaiN);
        indhira12.close();
    }
}
