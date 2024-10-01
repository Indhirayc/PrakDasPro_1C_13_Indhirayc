package Pertemuan5;

import java.util.Scanner;

public class P5_Tugas3_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalBelanja = 0, hargaMakanan, jumlahMakanan, potongan = 0;
        String namaMakanan;

        System.out.print("Masukan nama makanan: ");
        namaMakanan = input.nextLine();
        System.out.print("Masukan jumlah makanan yang dibeli: ");
        jumlahMakanan = input.nextInt();
        System.out.print("Masukan total belanja: ");
        totalBelanja = input.nextInt();
        if (totalBelanja > 500000) {
            potongan = (int) (totalBelanja - (totalBelanja * 0.10));
            
        } else if (totalBelanja > 200000) {
            potongan = (int) (totalBelanja - (totalBelanja * 0.05));
            
        } else if (totalBelanja > 100000) {
            potongan = (int) (totalBelanja - (totalBelanja * 0.01));
            
        }
        System.out.println("Total yang harus dibayar " + potongan);
    }
}
