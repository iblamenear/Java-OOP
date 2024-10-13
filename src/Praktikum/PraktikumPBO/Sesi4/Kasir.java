package Praktikum.PraktikumPBO.Sesi4;

import java.util.Scanner;
public class Kasir {
    public static void main(String[] args) {
        // Deklarasi variabel dan scanner
        int belanjaan, diskon = 0, bayar;
        String kartu;
        Scanner scan = new Scanner(System.in);

        // Mengambil input
        System.out.print("Apakah ada kartu member: ");
        kartu = scan.nextLine();
        System.out.print("Total belanjaan: ");
        belanjaan = scan.nextInt();

        //Proses
        if (kartu.equalsIgnoreCase("ya")) {
            if (belanjaan > 500000) {
                diskon = 50000;
            } else if (belanjaan > 100000) {
                diskon = 15000;
            } else {
                diskon = 0;
            }
        }
        // Total yang harus dibayar
        bayar = belanjaan - diskon;
        //Output
        System.out.println("Total Bayar: Rp " + bayar);
    }
}
