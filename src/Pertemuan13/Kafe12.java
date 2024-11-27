package Pertemuan13;

import java.util.Scanner;

public class Kafe12 {
    public static void main(String[] args) {
        Scanner indhira12 = new Scanner (System.in);

        Menu("Andi", true, "diskon50");

        System.out.print("\nMasukan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = indhira12.nextInt();
        System.out.print("Masukan jumlah item yang ingin dipesan: ");
        int banyakItem = indhira12.nextInt();

        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem);
        System.out.println("Total harga untuk pesanan Anda: Rp " + totalHarga);
        
    }
    public static  void Menu (String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");

        }if (kodePromo.equalsIgnoreCase("diskon50")) {
            System.out.println("Berikan Diskon 50%");
        } else if (kodePromo.equalsIgnoreCase("diskon30")) {
            System.out.println("Berikan Diskon30");
        } else {
            System.out.println("Kode Invalid");
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
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int [] hargaItem = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItem[pilihanMenu-1] * banyakItem;
        return hargaTotal;
    }
}
