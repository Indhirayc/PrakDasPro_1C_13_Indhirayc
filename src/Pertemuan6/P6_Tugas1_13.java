package Pertemuan6;

import java.util.Scanner;

public class P6_Tugas1_13 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner (System.in);
        
        int bil1 = 28, bil2 = 54, bil3 = 15, bilTerbesar = 0;

        if (bil2 > bil1 ) {
            if (bil2 > bil3) {
                bilTerbesar = bil2;
            }
        } else if (bil1 > bil3) {
            if (bil1> bil3) {
                bilTerbesar = bil1;
            }
        } else if (bil3 > bil1) {
            if (bil3 > bil2);
                bilTerbesar = bil3;
        }
        System.out.println("Bilangan Terbesar adalah " + bilTerbesar );
    }
}
