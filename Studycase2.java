public class Studycase2 {
    static String[] daftarMenu = {"Kopi Hitam", "Latte", "Cappucino", "Espresso", "Green Tea"};
    static int [] hargaMenu = {10000, 15000, 17000, 20000, 12000};
    static String[] namaPelanggan = new String[100];
    static int[] nomorMeja = new int[100];
    static String[] namaMenuPesanan = new String[100];
    static int[] jumlahItemPesanan = new int[100];
    static int[] totalHargaPesanan = new int[100];
    static int jumlahPesanan = 0;
    
    public static void tampilkanMenuUtama() {
        System.out.println("\n== Sistem Manajemen Bledos Cafe");
        System.out.println("1. Tambah Pesanan");
        System.out.println("2. Tampikan Semua Pesanan");
        System.out.println("3. Keluar");
    }
}