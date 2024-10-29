package Pertemuan9;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukan nilai N (Nilai N minimal 3) : ");
        int N = sc.nextInt();

        if (N < 3) {
            System.out.println("Nilai N minimal 3.");

        } else {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (i == N-1 || i == 0 || j == 0 || j == N-1 ) {
                        System.out.print(N + " ");
                    } else {
                        System.out.print("  ");
                    }
                    
                }
                System.out.println();
            }
        
        }
    }
}
