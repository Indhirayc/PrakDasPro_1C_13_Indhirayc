package Pertemuan13;

public class PengunjungCafe12 {
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Cirta");
    }
    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung: ");
        for (String pengunjung : namaPengunjung) {
            System.out.println("- " + pengunjung);
        }
    }
}
