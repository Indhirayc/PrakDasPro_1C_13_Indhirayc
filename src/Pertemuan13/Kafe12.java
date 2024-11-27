package Pertemuan13;

import java.util.Scanner;

public class Kafe12 {
    public static void main(String[] args) {
        Scanner indhira12 = new Scanner (System.in);
        
        Menu("Andi", true);
        
        System.out.print("Masukan kode promo (jika ada): ");
        String kodePromo = indhira12.next();
        String pesanLagi = "y";
        String[] totalPesan = new String[10];
        int totalHargaKeseluruhan = 0, jumlahPesanan = 0 ;

    while (pesanLagi.equalsIgnoreCase("y")) { 
        System.out.print("\nMasukan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = indhira12.nextInt();
        System.out.print("Masukan jumlah item yang ingin dipesan: ");
        int banyakItem = indhira12.nextInt();

        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
        totalHargaKeseluruhan += totalHarga;

        totalPesan[jumlahPesanan] = "Nomor Menu " + pilihanMenu + ", Jumlah Item: " + banyakItem + ", Harga Total: Rp " + totalHarga;
        jumlahPesanan++;

        System.out.print("Apakah Anda ingin memesan lagi (y/n) ? : ");
        pesanLagi = indhira12.next();

    }
    System.out.println("\nDaftar pesanan Anda:");
    for (int i = 0; i < jumlahPesanan; i++) {
        System.out.println(totalPesan[i]);
    }
    System.out.println("Total pemesanan Anda: " + totalHargaKeseluruhan);
}
    public static  void Menu (String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("=========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int [] hargaItem = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItem[pilihanMenu-1] * banyakItem;
        if (kodePromo.equalsIgnoreCase("diskon50")) {
            System.out.println("\nMendapat Diskon 50%");
            hargaTotal -= hargaTotal * 50 / 100;
        } else if (kodePromo.equalsIgnoreCase("diskon30")) {
            System.out.println("\nMendapat Diskon 30%");
            hargaTotal -= hargaTotal * 30 / 100;
        } else {
            System.out.println("\nKode promo tidak valid. Tidak ada diskon yang diterapkan.");
        }

        return hargaTotal;
    }
}
