package Pertemuan14;

import java.util.Scanner;

public class Percobaan3 {
    
    static double hitungLaba(double saldo, int tahun) {
        if (tahun == 0) {
            return (saldo);
        } else {
            return (1.11 * hitungLaba(saldo, tahun - 1));
        }
    }
    public static void main(String[] args) {
        Scanner indhira12 = new Scanner (System.in);
        double saldoAwal;
        int tahun;
        System.out.print("Jumlah saldo awal: ");
        saldoAwal = indhira12.nextDouble();
        System.out.print("Lamanya investasi (tahun) : ");
        tahun = indhira12.nextInt();

        System.out.print("Jumlah saldo setelah " + tahun + " tahun : " + hitungLaba(saldoAwal, tahun));
    }
}
