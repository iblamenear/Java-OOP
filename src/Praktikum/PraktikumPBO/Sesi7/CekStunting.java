package Praktikum.PraktikumPBO.Sesi7;

import java.util.Scanner;

class Bayi {
    private String nama;
    private double tinggi; // dalam cm
    private double berat;  // dalam kg

    // Setter dan Getter untuk Nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // Setter dan Getter untuk Tinggi
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    // Setter dan Getter untuk Berat
    public void setBerat(double berat) {
        this.berat = berat;
    }

    public double getBerat() {
        return berat;
    }

    // Method untuk cek apakah bayi berisiko stunting
    public String cekStunting() {
        // Misalnya, standar yang digunakan: tinggi < 48 cm dan berat < 2.5 kg untuk risiko stunting
        double batasTinggi = 48.0;
        double batasBerat = 2.5;

        if (tinggi < batasTinggi && berat < batasBerat) {
            return "Bayi berisiko stunting.";
        } else {
            return "Bayi tidak berisiko stunting.";
        }
    }

    // Method untuk menampilkan informasi bayi
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Berat: " + berat);
        System.out.println(cekStunting());
    }
}

public class CekStunting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bayi bayi1 = new Bayi();

        // Input data bayi pertama kali
        System.out.print("Masukkan nama bayi: ");
        bayi1.setNama(scanner.nextLine());

        System.out.print("Masukkan tinggi bayi (cm): ");
        bayi1.setTinggi(scanner.nextDouble());

        System.out.print("Masukkan berat bayi (kg): ");
        bayi1.setBerat(scanner.nextDouble());

        // Tampilkan informasi awal bayi
        bayi1.tampilkanInfo();

        // Opsi untuk memperbarui data
        System.out.print("\nApakah Anda ingin memperbarui data bayi? (ya/tidak): ");
        String pilihan = scanner.next();

        if (pilihan.equalsIgnoreCase("ya")) {
            System.out.print("Masukkan tinggi baru bayi (cm): ");
            double tinggiBaru = scanner.nextDouble();

            System.out.print("Masukkan berat baru bayi (kg): ");
            double beratBaru = scanner.nextDouble();

            // Perbarui data bayi
            bayi1.setTinggi(tinggiBaru);
            bayi1.setBerat(beratBaru);

            // Tampilkan informasi bayi setelah perubahan
            System.out.println("\nData setelah diperbarui:");
            bayi1.tampilkanInfo();
        } else {
            System.out.println("Data bayi tidak diubah.");
        }

        scanner.close();
    }
}
