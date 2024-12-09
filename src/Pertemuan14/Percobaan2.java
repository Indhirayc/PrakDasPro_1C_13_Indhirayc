package Pertemuan14;

import java.util.Scanner;

public class Percobaan2 {
    static String deret = "";
    static int hitungPangkat (int x, int y) {
        if (y == 0) {
            deret += "1";
            return (1);
        } else {
            deret += x + "x";
            return (x * hitungPangkat(x, y - 1 ));
            
        }
    }
    public static void main(String[] args) {
        Scanner indhira12 = new Scanner (System.in);
        System.out.print("Bilangan yang  dihitung: ");
        int bilangan = indhira12.nextInt();
        System.out.print("Pangkat: ");
        int pangkat = indhira12.nextInt();

        deret = "";
        int hasil = hitungPangkat(bilangan, pangkat);

        System.out.println(deret + " = " + hasil);
    }
}
