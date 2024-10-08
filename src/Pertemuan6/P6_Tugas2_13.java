package Pertemuan6;

import java.util.Scanner;

public class P6_Tugas2_13 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner (System.in);

        String hari, jenisBuku = null;
        int  jmlKamus, jmlNovel, jmlBukuLain = 0;
        double diskon = 0;

        System.out.print("Hari : ");
        hari = input13.nextLine();
        System.out.print("Jumlah kamus yang dibeli: ");
        jmlKamus = input13.nextInt();
        System.out.print("Jumlah novel yang dibeli: ");
        jmlNovel = input13.nextInt();
        System.out.print("Jumlah buku lain yang dibeli: ");
        jmlBukuLain = input13.nextInt();

        if (hari.equalsIgnoreCase("Rabu")) {
            if (jmlKamus >= 1) {
                diskon += 10;
                if (jmlKamus > 2) {
                    diskon += 2;
                } else {
                    diskon+= 0;
                }
            } if (jmlNovel >= 1) {
                diskon += 7;
                if (jmlNovel <= 3) {
                    diskon += 1;
                } else {
                    diskon += 2;
                }
            } if (jmlBukuLain > 3){
                diskon += 5;
            } 
    } else {
        System.out.println("Tidak mendapat diskon");
    }
   
    System.out.println("Total diskon  = " + diskon + "%");
}
}