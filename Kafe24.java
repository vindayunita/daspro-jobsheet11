import java.util.Scanner;

public class Kafe24 {

    // Fungsi untuk menghitung total harga dan menerapkan diskon jika ada kode promo
    public static int hitungTotalHarga(int[] pilihanMenu, int[] banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 18000, 18000};
        int totalHarga = 0;

        // Menghitung total harga untuk semua pesanan
        for (int i = 0; i < pilihanMenu.length; i++) {
            totalHarga += hargaItems[pilihanMenu[i] - 1] * banyakItem[i];
        }

        // Memproses kode promo
        if ("DISKON50".equals(kodePromo)) {
            System.out.println("Kode Promo Valid: Diskon 50%");
            totalHarga *= 0.5; // Diskon 50%
        } else if ("DISKON30".equals(kodePromo)) {
            System.out.println("Kode Promo Valid: Diskon 30%");
            totalHarga *= 0.7; // Diskon 30%
        } else {
            System.out.println("Kode Promo Invalid: Tidak ada pengurangan total harga.");
        }

        return totalHarga;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Menampilkan menu
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam   - Rp 15,000");
        System.out.println("2. Cappuccino   - Rp 20,000");
        System.out.println("3. Latte        - Rp 22,000");
        System.out.println("4. Teh Tarik    - Rp 12,000");
        System.out.println("5. Roti Bakar   - Rp 18,000");
        System.out.println("6. Mie Goreng   - Rp 18,000");
        System.out.println("===========================");

        // Input jumlah jenis menu yang akan dipesan
        System.out.print("Masukkan jumlah jenis menu yang ingin Anda pesan: ");
        int jumlahJenis = sc.nextInt();

        int[] pilihanMenu = new int[jumlahJenis];
        int[] banyakItem = new int[jumlahJenis];

        // Input untuk setiap jenis menu
        for (int i = 0; i < jumlahJenis; i++) {
            System.out.print("Masukkan nomor menu yang ingin Anda pesan (ke-" + (i + 1) + "): ");
            pilihanMenu[i] = sc.nextInt();
            System.out.print("Masukkan jumlah item untuk menu tersebut: ");
            banyakItem[i] = sc.nextInt();
        }

        System.out.print("Masukkan kode promo: ");
        String kodePromo = sc.next();

        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);

        System.out.println("Total keseluruhan pesanan Anda setelah diskon: Rp " + totalHarga);

    }
}
