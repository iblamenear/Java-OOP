package Praktikum.PraktikumPBO.Sesi4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BurgerRestaurant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean lanjutOrder = true; // Variabel untuk mengontrol loop
        int totalPesanan = 0; // Variabel untuk menghitung total jumlah pesanan
        int totalHarga = 0; // Variabel untuk menghitung total harga
        List<String> detailPesanan = new ArrayList<>(); // Daftar untuk menyimpan detail pesanan

        while (lanjutOrder) {
            // Menampilkan menu burger
            System.out.println("\nSelamat datang di restoran Burger cik Muani Khas Ngawi!");
            System.out.println("Menu kami:");
            System.out.println("1. Cheeseburger - Rp. 17.000");
            System.out.println("2. Double Cheeseburger - Rp. 25.000");
            System.out.println("3. Burger Sosis - Rp. 17.000");
            System.out.println("4. Burger Ayam - Rp. 15.000");
            System.out.println("5. Burger Vegan (0% Daging) - Rp.30.000");

            // Memilih burger
            System.out.print("\nMasukkan nomor burger yang ingin Anda pesan: ");
            int PilihanBurger = scanner.nextInt();
            
            // Menggunakan switch untuk menentukan burger dan harganya
            int price = 0;
            String namaBurger = "";

            switch (PilihanBurger) {
                case 1:
                    namaBurger = "Cheeseburger";
                    price = 17000;
                    break;
                case 2:
                    namaBurger = "Double Cheeseburger";
                    price = 25000;
                    break;
                case 3:
                    namaBurger = "Burger Sosis";
                    price = 17000;
                    break;
                case 4:
                    namaBurger = "Burger Ayam";
                    price = 15000;
                    break;
                case 5:
                    namaBurger = "Burger Vegan (0% Daging)";
                    price = 30000;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    continue; // Kembali ke awal loop untuk meminta input lagi
            }

            // Memasukkan jumlah pesanan
            System.out.print("Masukkan jumlah pesanan: ");
            int quantity = scanner.nextInt();

            // Memvalidasi jumlah pesanan
            if (quantity <= 0) {
                System.out.println("Jumlah pesanan tidak valid. Jumlah harus lebih dari 0.");
                continue; // Kembali ke awal loop untuk meminta input lagi
            }

            // Menghitung total harga untuk pesanan ini
            int totalPrice = price * quantity;

            // Menampilkan total harga untuk pesanan ini
            System.out.println("\nPesanan Anda:");
            System.out.println(quantity + " x " + namaBurger + " = Rp. " + totalPrice);

            // Mengupdate total jumlah dan total harga
            totalPesanan += quantity;
            totalHarga += totalPrice;

            // Menyimpan detail pesanan ke dalam daftar
            detailPesanan.add(quantity + " x " + namaBurger);

            // Menanyakan kepada pengguna apakah ingin memesan lagi
            System.out.print("Apakah Anda ingin memesan lagi? (ya/tidak): ");
            String response = scanner.next();
            if (!response.equalsIgnoreCase("ya")) {
                lanjutOrder = false; // Menghentikan loop jika pengguna tidak ingin memesan lagi
            }
        }

        // Menampilkan total pesanan dan total harga jika lebih dari dua kali pemesanan
        if (totalPesanan > 2) {
            System.out.println("\nTotal Pesanan Anda:");
            for (String orderDetail : detailPesanan) {
                System.out.println(orderDetail);
            }
            System.out.println("Jumlah Total: " + totalPesanan + " burger");
            System.out.println("Total Harga: Rp. " + totalHarga);
        }

        System.out.println("Terima kasih telah memesan di restoran Burger cik Muani Khas Ngawi!");
        scanner.close(); // Menutup scanner
    }
}
