package Pertemuan14;

public class Percobaan1 {
    static int faktorRekusif(int n) {
        if (n == 0) {
            return (1);
        } else {
            return (n * faktorRekusif (n -1)) ;
        }
    }
    static int faktorIteratif (int n) {
        int faktor = 1;
        for (int i = n; i >= 1; i--) {
            faktor = faktor * i;
        }
        return faktor;
    }
    public static void main(String[] args) {
        System.out.println(faktorRekusif(5));
        System.out.println(faktorIteratif(5));
    }
}
