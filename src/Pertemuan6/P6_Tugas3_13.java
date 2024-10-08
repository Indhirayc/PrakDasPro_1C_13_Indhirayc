package Pertemuan6;

import java.util.Scanner;

public class P6_Tugas3_13 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner (System.in);
        
        String merek, convers, sketcher, nike , kategori;
        int ukuran, harga = 0;

        System.out.print("Masukan merek sepatu : ");
        merek = input13.nextLine();
        System.out.print("Masukan kategori : ");
        kategori = input13.nextLine();
        System.out.print("Masukan ukuran : ");
        ukuran = input13.nextInt();

        if (merek.equalsIgnoreCase("converse")){
            if (kategori.equalsIgnoreCase("Slip on")) {
                if (ukuran >= 36 ){
                    if (ukuran <= 40 ) {
                        harga = 800_000;
                    } else {
                        System.out.println("Ukuran kosong");
                    }
                } else {
                    System.out.println("Ukuran kosong");
                }
            } else if (kategori.equalsIgnoreCase("High top")) {
                if (ukuran >= 40){
                    if (ukuran >= 44) {
                        harga = 1_200_000;
                    } else {
                        System.out.println("Ukuran kosong");
                    }
                } else {
                    System.out.println("Ukuran kosong");
                }
            } else {
                System.out.println("Kategori kosong");
            }
        } else if (merek.equalsIgnoreCase("Sketcher")) {
            if (kategori.equalsIgnoreCase("Woman")) {
                if (ukuran >= 36) {
                    if (ukuran <= 41) {
                        harga = 1_000_000;
                    } else {
                        System.out.println("Ukuran kosong");
                    }
                } else {
                    System.out.println("Ukuran kosong");
                }
            } else if (kategori.equalsIgnoreCase("Man")) {
                if (ukuran >= 41) {
                    if (ukuran <= 44) {
                        harga = 1_800_000;
                    } else {
                        System.out.println("Ukuran kosong");
                    }
                } else {
                    System.out.println("Ukuran kosong");
                }
            } else {
                System.out.println("Kategori kosong");
            }
        } else if (merek.equalsIgnoreCase("Nike")) {
            if (kategori.equalsIgnoreCase("Kids")) {
                if (ukuran >= 36) {
                    if (ukuran <= 40) {
                        harga = 750_000;
                    } else {
                        System.out.println("Ukuran kosong");
                    }
                } else {
                    System.out.println("Ukuran kosong");
                }
            } else if (kategori.equalsIgnoreCase("Adult")) {
                if (ukuran >= 40) {
                    if (ukuran <= 44) {
                        harga = 1_500_000;
                    } else {
                        System.out.println("Ukuran kosong");
                    }
                } else {
                    System.out.println("Ukuran kosong");
                }
            } else {
                System.out.println("Kategori kosong");
            }
    } else {
        System.out.println("Merek kosong");
    }
    System.out.println("Harga sepatu = Rp. " + harga );
}
}
