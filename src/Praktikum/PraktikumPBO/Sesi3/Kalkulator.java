package Praktikum.PraktikumPBO.Sesi3;
import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean lanjut = true;

        while(lanjut){
            //Pilihan operasi matematika
            System.out.println("Pilih Operasi:");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Modular");
            System.out.println("6. Pangkat");
            System.out.println("7. Akar Kuadrat");
            System.out.println("8. Keluar");
            System.out.print("Masukkan Pilihan Anda (1-8): ");
            char operator = scanner.next().charAt(0);

            double bil1 = 0, bil2 = 0, hasil = 0;

            // if condition untuk memastikan jika pengguna ingin keluar
            if(operator == '8'){
                System.out.println("Keluar dari program.");
                break;
            }

            // if confition untuk operasi matematika
            if(operator == '7'){
                // Operasi akar kuadrat hanya membutuhkan satu bilangan
                System.out.print("Masukkan Angka: ");
                bil1 = scanner.nextDouble();
            } else{
                // Operasi selain akar kuadrat membutuhkan dua bilangan
                System.out.print("Masukkan Angka Pertama: ");
                bil1 = scanner.nextDouble();

                System.out.print("Masukkan Angka Kedua: ");
                bil2 = scanner.nextDouble();
            }

            // Operasi berdasarkan pilihan user
            switch(operator){
                case '1':
                    hasil = bil1 + bil2;
                    System.out.println("Hasil Penjumlahan: " + hasil);
                break;
                case '2':
                    hasil = bil1 - bil2;
                    System.out.println("Hasil Pengurangan: " + hasil);
                break;
                case '3':
                    hasil = bil1 * bil2;
                    System.out.println("Hasil Perkalian: " + hasil);
                break;
                case '4':
                    hasil = bil1 / bil2;
                    System.out.println("Hasil Pembagian: " + hasil);
                break;
                case '5':
                    hasil = bil1 % bil2;
                    System.out.println("Hasil Modular: " + hasil);
                break;
                case '6':
                    hasil = Math.pow(bil1, bil2);
                    System.out.println("Hasil Pangkat: " + hasil);
                break;
                case '7':
                    hasil = Math.sqrt(bil1);
                    System.out.println("Hasil Akar Kuadrat: " + hasil);
                break;
                default:
                    System.out.println("Operator yang dipilih Tidak Valid!");
                break;
            }
            // Apakah ingin melanjutkan
            System.out.print("Apakah ingin melanjutkan operasi lain? (y/n): ");
            char pilihan = scanner.next().charAt(0);
            if(pilihan != 'y' && pilihan != 'Y'){
                lanjut = false;
            }
        }
        scanner.close();
    }
}
