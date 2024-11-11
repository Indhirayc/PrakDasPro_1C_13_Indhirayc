package Pertemuan11;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int jumlahResponden = 2;
        int jumlahPertanyaan = 2;
        int [][] hasilSurvey = new int[jumlahResponden][jumlahPertanyaan];

        System.out.println("========== Input Jawaban Survei ========== ");
        for (int i = 0; i < jumlahResponden; i++) {
            System.out.println("Responden " + (i+1) + ": ");
            for (int j = 0; j < jumlahPertanyaan; j++) {
                System.out.print(" Jawaban Pertanyaan ke-" + (j+1) + ": ");
                hasilSurvey[i][j] = sc.nextInt();
                
                while (hasilSurvey[i][j] < 1 || hasilSurvey[i][j] > 5) {
                    System.out.print("  Nilai tidak valid. Masukkan nilai antara 1 dan 5: ");
                    hasilSurvey[i][j] = sc.nextInt();
                }
            }
        }
        System.out.println("\n=== Rata-rata Nilai Setiap Responden ====");
        for (int i = 0; i < jumlahResponden; i++) {
            double totalResponder = 0;
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalResponder += hasilSurvey[i][j];
            }
            double rataResponder = totalResponder / jumlahPertanyaan;
            System.out.println("Rata-rata Responden " + (i + 1) + ": " + rataResponder);
        }
        System.out.println("\n=== Rata-rata Nilai Setiap Pertanyaan ===");
        for (int j = 0; j < jumlahResponden; j++) {
            double totalPertanyaan = 0;
            for (int i = 0; i < jumlahResponden; i++) {
                totalPertanyaan += hasilSurvey[i][j];
            }
            double rataPertanyaan = totalPertanyaan / jumlahResponden;
            System.out.println("Rata-rata Pertanyaan ke-" + (j + 1) + ": " + rataPertanyaan);
        }
        System.out.println("\n=== Rata-rata Nilai Secara Keseluruhan ===");
        double totalkeseluruhan = 0;
        for (int i = 0; i < jumlahResponden; i++) {
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalkeseluruhan += hasilSurvey [i][j];
            }
        }
        double rataKeseluruhan = totalkeseluruhan / (jumlahResponden * jumlahPertanyaan);
        System.out.println("Rata-rata Nilai Keseluruhan: " + rataKeseluruhan);

    }
}
